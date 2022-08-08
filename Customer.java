package model;

import java.util.regex.Pattern;

public class Customer {
    String firstName;
    String lastName;
    String email;

    @Override
    public String toString() {
        return "Customer name: " + lastName + ", " + firstName + ", " + "Email: " + email;
    }
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);

        try {
            pattern.matcher(email).matches();
        } catch (IllegalArgumentException ex) {
            ex.getLocalizedMessage();
        }
    }
}
