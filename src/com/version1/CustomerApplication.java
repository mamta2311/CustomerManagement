package com.version1;

public class CustomerApplication {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ram", 'I');
        Customer c2 = new Customer("Lakhan", 'A');
        Customer c3 = new Customer("John", 'H');
        Customer c4 = new Customer("Madan", 'O');
        System.out.println("Name: " + c1.getName() + "\n Status: " + c1.getStatus());
        System.out.println("Name: " + c2.getName() + "\n Status: " + c2.getStatus());
        System.out.println("Name: " + c3.getName() + "\n Status: " + c3.getStatus());
        System.out.println("Name: " + c4.getName() + "\n Status: " + c4.getStatus());

        c2.changeDetails("Lakhan Rao", 'I');
        System.out.println("Name: " + c2.getName() + "\n Status: " + c2.getStatus());
    }
}
