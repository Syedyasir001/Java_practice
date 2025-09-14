import java.util.Scanner;

public class UserInputValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge = 0;

        while (true) {
            System.out.print("Please enter your age: ");
            try {
                String input = scanner.nextLine();
                userAge = Integer.parseInt(input);
                break; // exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a whole number.");
            }
        }

        System.out.println("Thank you! You have entered your age as: " + userAge);
        scanner.close();
    }
}
