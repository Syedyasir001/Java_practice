package methods;

import java.util.Scanner;

public class PVuserinput {

    public String checkStrength(String password) {
        if (password.length() < 8) {
            return "Weak";
        }

        boolean hasLetters = containsLetters(password);
        boolean hasDigits = containsDigits(password);

        if (hasLetters && hasDigits) {
            return "Strong";
        } else {
            return "Medium";
        }
    }

    private boolean containsLetters(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDigits(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PVuserinput validator = new PVuserinput();

        System.out.print("Enter the password: ");
        String userPassword = scanner.nextLine();

        String strength = validator.checkStrength(userPassword);
        System.out.println("Password Strength: " + strength);

        scanner.close();
    }
}

