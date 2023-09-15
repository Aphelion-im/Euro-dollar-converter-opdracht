import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    double euroToDollar = 1.07;
    double dollarToEuro = 0.94;

    ArrayList<Double> values = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void showUserMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("---");
            System.out.println("1) Euro to Dollar"); // euroToDollar
            System.out.println("2) Dollar to Euro"); // dollarToEuro
            System.out.println("q) Exit");
            System.out.print("Choose an option: ");
            try {
                String chosenOption = scanner.nextLine();
                if (chosenOption.equals("q")) {
                    System.out.println("Exiting program...");
                    scanner.close();
                    break;
                }

                System.out.print("Choose an amount: ");
                double chosenAmount = Integer.parseInt(scanner.nextLine());

                values.add(chosenAmount);

                switch (chosenOption) {
                    case "1":
                        System.out.println(chosenAmount + " Euro " + CurrencyConverter.doMath(euroToDollar, chosenAmount));
                        break;
                    case "2":
                        System.out.println(chosenAmount + " Dollar " + CurrencyConverter.doMath(dollarToEuro, chosenAmount));
                        break;
                    default:
                        System.out.println("No such option!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("An error has occurred. Exiting program now.");
                break;
            }
        }

        System.out.println("The entered values for this session are: " + values);
    }
}
