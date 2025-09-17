package methods;

public class PasswordValidator {

    /**
     * Checks the strength of a given password based on length and character types.
     * @param password The password string to check.
     * @return A String indicating the strength: "Weak", "Medium", or "Strong".
     */
    public String checkStrength(String password) {
        // Rule 1: Weak if less than 8 characters
        if (password.length() < 8) {
            return "Weak";
        }

        // Check for a mix of characters by calling helper methods
        boolean hasLetters = containsLetters(password);
        boolean hasDigits = containsDigits(password);

        // Rule 3: Strong if it has both letters and digits
        if (hasLetters && hasDigits) {
            return "Strong";
        }
        // Rule 2: Medium if it's long but doesn't have mixed characters
        else {
            return "Medium";
        }
    }

    /**
     * Private helper method to check if a string contains any letters.
     */
    private boolean containsLetters(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                return true; // Found a letter, no need to check further
            }
        }
        return false;
    }

    /**
     * Private helper method to check if a string contains any digits.
     */
    private boolean containsDigits(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { 
                return true; // Found a digit, no need to check further
            }
        }
        return false;
    }

    // Main method to test the validator
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        String pass1 = "p@ss";           // Weak
        String pass2 = "longpassword";   // Medium
        String pass3 = "123456789";      // Medium
        String pass4 = "passw0rd123";    // Strong

        System.out.println("Password: '" + pass1 + "' -> Strength: " + validator.checkStrength(pass1));
        System.out.println("Password: '" + pass2 + "' -> Strength: " + validator.checkStrength(pass2));
        System.out.println("Password: '" + pass3 + "' -> Strength: " + validator.checkStrength(pass3));
        System.out.println("Password: '" + pass4 + "' -> Strength: " + validator.checkStrength(pass4));
    }
}
