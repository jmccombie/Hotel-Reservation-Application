package api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMenu {

    public static void printAdminMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Select your option: ");
    }
    public static void adminMenu(String[] args) {
        String[] options = {"1. See all Customers",
                            "2. See all Rooms",
                            "3. See all Reservations",
                            "4. Add a Room",
                            "5. Back to Main Menu",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printAdminMenu(options);
            try {
                option = scanner.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
            catch (Exception ex) {
                System.out.println("An unexpected error has occurred. Please try again.");
                scanner.next();
            }
        }
    }
}

