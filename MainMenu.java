package api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public static void printMainMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Select your option: ");
    }
    public static void mainMenu(String[] args) {
        String[] options = {"1. Find and reserve a room",
                            "2. See my reservations",
                            "3. Create an account",
                            "4. Admin",
                            "5. Exit",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printMainMenu(options);
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
