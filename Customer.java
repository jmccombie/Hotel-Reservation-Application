package model;

import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

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

            boolean emailsMatch = pattern.matcher(email).matches();
            if (!emailsMatch) {
                throw new IllegalArgumentException("Error, Invalid email format");
            }
    }
}
