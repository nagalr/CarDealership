package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer emptyCustomer;
    Customer customer;
    Vehicle vehicle;
    Employee employee;

    @BeforeEach
    void setUp() {
        customer = new Customer("Jonny", "123 Main st.", 12000, 1000);
        vehicle = new Vehicle();
        employee = new Employee("Sam", "456 Main st.");
    }

    @Test
    void purchaseCar() {
        assertEquals("Purchasing a Car.", customer.purchaseCar(vehicle, employee, false) );
    }

    @Test
    void getName() {
        assertEquals("Jonny", customer.getName());
    }

    @Test
    void setName() {
        customer.setName("Jonny the beauty");
        assertEquals("Jonny the beauty", customer.getName());
    }

    @Test
    void getAddress() {
        assertEquals("123 Main st.", customer.getAddress());
    }

    @Test
    void setAddress() {
        customer.setAddress("789 Main st.");
        assertEquals("789 Main st.", customer.getAddress());
    }

    @Test
    void getCashOnHand() {
        assertEquals(12000, customer.getCashOnHand());
    }

    @Test
    void setCashOnHand() {
        customer.setCashOnHand(14000);
        assertEquals(14000, customer.getCashOnHand());
    }

    @Test
    void getLoanAmount() {
        assertEquals(1000, customer.getLoanAmount());
    }

    @Test
    void setLoanAmount() {
        customer.setLoanAmount(2000);
        assertEquals(2000, customer.getLoanAmount());
    }
}