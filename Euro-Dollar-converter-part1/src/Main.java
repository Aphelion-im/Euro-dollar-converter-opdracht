import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euroToDollarRate = 1.06630;
        double dollarToEuroRate = 0.937824;

        System.out.println("MENU");
        System.out.println("---");
        System.out.println("1) Convert Euro to Dollar");
        System.out.println("2) Convert Dollar to Euro");

        System.out.print("Choose an option: ");
        int optionChosen = scanner.nextInt();
        System.out.println("You have chosen option " + optionChosen);
        System.out.print("Please enter amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        switch (optionChosen) {
            case 1:
                System.out.println(amountToConvert + " Euro is " + (amountToConvert * euroToDollarRate) + " Dollar");
                break;
            case 2:
                System.out.println(amountToConvert + " Dollar is " + (amountToConvert * dollarToEuroRate) + " Euro");
                break;
            default:
                System.out.println("No such option!");
        }
        scanner.close();
    }
}