package model;

public class Driver {
    public static void main(String[] args) {

        //Valid email format:
        //Customer customer = new Customer("first", "second", "j@domain.com");

        //Invalid email format:
        Customer customer = new Customer("first", "second", "email");

        System.out.println(customer);
    }
}
