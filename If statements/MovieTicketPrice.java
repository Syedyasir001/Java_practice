import java.util.Scanner;

public class MovieTicketPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        double ticketPrice;

        System.out.print("Enter your age to check availiable discpounts: " );
        age = scanner.nextInt();

        //if statements
        if (age < 12) {
            ticketPrice = 200.00;
            System.out.println("Applying children discount ");
            System.out.println("The price of the ticket will be: " + ticketPrice + " only");

        }else if (age >= 60) {
            ticketPrice = 300.00;
            System.out.println("Applying senior discount ");
            System.out.println("The price of the ticket will be: " + ticketPrice + " only");

        } else {
            ticketPrice = 600;
            System.out.println("Applying standard price ");
            System.out.println("The price of the ticket will be: " + ticketPrice + " only");

        }




        scanner.close();



    }
}
