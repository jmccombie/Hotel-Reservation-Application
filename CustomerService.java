package service;

import model.Customer;

import java.util.Collection;

public class CustomerService {
    public void addCustomer(String email, String firstName, String lastName) {

    }

    public Customer getCustomer(String customerEmail){
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return null;
    }
    private static CustomerService customerService = null;
    private CustomerService() {}

    public static CustomerService getInstance(){
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }
}
