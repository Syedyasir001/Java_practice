import java.util.Scanner;

public class if_statements {
    public static void main(String[] args) {

        // if statements
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your age to check eligibility: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age == 16) {
            System.out.println("Sorry, you are not yet eligible to vote. Two more years to go!");
        } else {
            System.out.println("You are still a kid.");
        }

        scanner.close();
    }
}
