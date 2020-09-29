package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

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
    }

    @Test
    void setName() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getCashOnHand() {
    }

    @Test
    void setCashOnHand() {
    }

    @Test
    void getLoanAmount() {
    }

    @Test
    void setLoanAmount() {
    }
}