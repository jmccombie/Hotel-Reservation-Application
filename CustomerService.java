package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    /*
    Create a collection within CustomerService class to store customer
    information.

    Udacity forum said to use Singleton pattern.

    Map collection will utilize constant time vice linear time, therefore
    map is the preferred collection type.

     */

    private final Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(String email, String firstName, String lastName) {
        customers.put(email, new Customer(firstName, lastName, email));
    }

    public Customer getCustomer(String customerEmail){
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }

    /*
    A static reference variable must be initialized as "null"

    Then, when variable is found to be "null" it is assigned
    a new value.

    The variable is then returned and will never be "null"
     */

    private static CustomerService customerService = null;
    private CustomerService() {}

    public static CustomerService getInstance(){
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }
}
