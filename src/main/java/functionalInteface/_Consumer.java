package functionalInteface;

import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber);

    public static void main(String[] args) {
        // Normal Java Function
        greetCustomer(
                new Customer("Rakesh", "12345")
        );

        // Consumer Functional Interface
        greetCustomerConsumer.accept(
                new Customer("Dama", "7890"));
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
