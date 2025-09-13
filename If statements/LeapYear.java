import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        boolean isLY;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year to check if it is a Leap Year: ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            isLY = true;
        } else if (year % 100 == 0) {
            isLY = false;
        } else if (year % 4 == 0) {
            isLY = true;
        } else {
            isLY = false;
        }

        if (isLY) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
