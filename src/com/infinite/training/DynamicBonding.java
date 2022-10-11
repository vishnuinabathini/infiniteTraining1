package com.infinite.training;

class DynamicBinding {

    public static void main(String[] args) {
        Customer2 regCust1 = new RegularCustomer1();
        Customer2 regCust2 = new RegularCustomer1();
        Customer2 premCust1 = new PremiumCustomer();

        showCustomerDetails(regCust1);
        showCustomerDetails(premCust1);
        showCustomerDetails(regCust2);
    }

    public static void showCustomerDetails(Customer2 customer) {
        customer.display();
    }
}
    class Customer2 {
        public void display() {
            System.out.println("Customer is coming...");
        }
    }
    class RegularCustomer1 extends Customer2 {
        @Override
        public void display() {
            System.out.println("A regular customer has come");
        }
    }
    class PremiumCustomer extends Customer2 {
        @Override
        public void display() {
            System.out.println("A premium customer has come");
        }
    }

