package Day1;

import java.util.Scanner;

public class Strongpswrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password to check whether it is strong or not:");
        String password = sc.nextLine();

        int totalLength = password.length();
        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        String specialChars = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~";

        for (int i = 0; i < totalLength; i++) {
            char ch = password.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (specialChars.indexOf(ch) != -1) {
                specialCount++;
            }
        }

        // Final result
        if (totalLength >= 8 && lowerCount > 0 && upperCount > 0 && digitCount > 0 && specialCount > 0) {
            System.out.println("✅ Strong password!");
        } else {
            System.out.println("❌ Weak password. Reasons:");
            if (totalLength < 8) System.out.println("- Password must be at least 8 characters.");
            if (lowerCount == 0) System.out.println("- Missing lowercase letter.");
            if (upperCount == 0) System.out.println("- Missing uppercase letter.");
            if (digitCount == 0) System.out.println("- Missing digit.");
            if (specialCount == 0) System.out.println("- Missing special character.");
        }
    }
}
