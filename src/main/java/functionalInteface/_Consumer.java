package functionalInteface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer, showNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showNumber ? customer.customerPhoneNumber : "******"));

    public static void main(String[] args) {

        Customer rakesh = new Customer("Rakesh Dama", "7989787819");
        // Normal Java Function
        greetCustomer(
                new Customer("Rakesh", "12345")
        );

        // Consumer Functional Interface
        greetCustomerConsumer.accept(
                new Customer("Dama", "7890"));

        // Biconsumer
        greetCustomerConsumerv2.accept(rakesh, false);
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
