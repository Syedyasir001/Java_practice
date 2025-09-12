import java.util.Scanner;

public class Shopping_cart_prg {
    public static void main(String[] args) {

        // shopping cart program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String currency;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter currency symbol (e.g., ₹, $, €): ");
        currency = scanner.nextLine();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + (quantity > 1 ? "s" : ""));
        System.out.printf("Your total is %s%.2f%n", currency, total);

        scanner.close();
    }
}
