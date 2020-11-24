package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("AllTest")
class EmployeeTest {

    Employee employee;
    Vehicle vehicle;
    Customer customer;

    @BeforeEach
    void setUp() {
        employee = new Employee("Sam", "909 Main st.");
        vehicle = new Vehicle(11000, 2010);
        customer = new Customer("Lion", "5555 Main st.", 15000, 2000);
    }

    @Test
    void handleCustomer() {
        String response = employee.handleCustomer(customer, false, vehicle);
        assertEquals("finish handling a customer", response);

        response = employee.handleCustomer(customer, false, vehicle);
        assertEquals("finish handling a customer", response);
    }

    @Test
    void creditHistory() {
        assertEquals("finish handling a customer", employee.handleCustomer(customer, true, vehicle));
    }

    @Test
    void getName() {
        assertEquals("Sam", employee.getName());
    }

    @Test
    void setName() {
        employee.setName("Samantha");
        assertEquals("Samantha", employee.getName());
    }

    @Test
    void getAddress() {
        assertEquals("909 Main st.", employee.getAddress());
    }

    @Test
    void setAddress() {
        employee.setAddress("1111 Adam st.");
        assertEquals("1111 Adam st.", employee.getAddress());
    }
}