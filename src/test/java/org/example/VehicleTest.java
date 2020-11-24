package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("AllTest")
class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle(5000, 2002);
    }

    @Test
    void getPrice() {
        assertEquals(5000, vehicle.getPrice());
    }

    @Test
    void setPrice() {
        vehicle.setPrice(6000);
        assertEquals(6000, vehicle.getPrice());
    }

    @Test
    void getProductionYear() {
        assertEquals(2002, vehicle.getProductionYear());
    }

    @Test
    void setProductionYear() {
        vehicle.setProductionYear(2003);
        assertEquals(2003, vehicle.getProductionYear());
    }
}