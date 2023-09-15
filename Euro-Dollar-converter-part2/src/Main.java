// https://stackoverflow.com/questions/28113856/while-statement-cannot-complete-without-throwing-an-exception-android

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double euroToUSDollarRate = 1.06611;
        double USDollarToEuroRate = 0.937957;

        while (true) {
            try {
                System.out.println("MENU");
                System.out.println("---");
                System.out.println("1) Euro to US Dollar conversion");
                System.out.println("2) US Dollar to Euro conversion");
                System.out.println("3) Exit program");

                System.out.print("Choose an option: ");
                int optionChosen = scanner.nextInt();

                if (optionChosen == 3) {
                    System.out.println("Exiting program...");
                    scanner.close();
                    break;
                } else if (optionChosen > 3) {
                    System.out.println("No such option!");
                    continue;
                }

                System.out.print("Choose an amount to convert: ");
                double amountChosen = scanner.nextDouble();

                switch (optionChosen) {
                    case 1:
                        System.out.println(amountChosen + " Euro is " + (amountChosen * euroToUSDollarRate) + " US Dollars");
                        break;
                    case 2:
                        System.out.println(amountChosen + " Dollar is " + (amountChosen * USDollarToEuroRate) + " Euro's");
                        break;
                    default:
                        System.out.println("Unknown input");
                        break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred!");
                scanner.close();
                break;
            }
        }
    }
}