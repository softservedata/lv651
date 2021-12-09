package com.softserve.arraysloops.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car1 = new Car("Toyota", 2008, 3);
    Car car2 = new Car("Nissan", 2010, 1);
    Car car3 = new Car("Skoda", 1996, 4);
    Car car4 = new Car("Honda", 2020, 2);

    @Test
    void getType() {
        assertEquals("Toyota", car1.getType());
        assertEquals("Nissan", car2.getType());
        assertEquals("Skoda", car3.getType());
        assertEquals("Honda", car4.getType());
    }

    @Test
    void getYearProduction() {
        assertEquals(2008, car1.getYearProduction());
        assertEquals(2010, car2.getYearProduction());
        assertEquals(1996, car3.getYearProduction());
        assertEquals(2020, car4.getYearProduction());
    }

    @Test
    void getEngineCapacity() {
        assertEquals(3, car1.getEngineCapacity());
        assertEquals(1, car2.getEngineCapacity());
        assertEquals(4, car3.getEngineCapacity());
        assertEquals(2, car4.getEngineCapacity());
    }
}