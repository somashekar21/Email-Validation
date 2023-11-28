package emailvalidation;

import java.util.Arrays;
import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        // Sample array of email IDs
        String[] emailArray = {"somashekar@gmail.com", "shekar@gmail.com", "soma@gmail.com"};

        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Calling the method to search for the email ID
        boolean found = searchEmailID(emailArray, searchEmail);

        // Displaying the result
        if (found) {
            System.out.println("Email ID found in the array.");
        } else {
            System.out.println("Email ID not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to search for the email ID in the array
    private static boolean searchEmailID(String[] emailArray, String searchEmail) {
        // Using Arrays.asList() to convert the array to a list for easy searching
        return Arrays.asList(emailArray).contains(searchEmail);
    }
}
