package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
    // add the deleteCity test
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }
    // add the countCity test
    @Test
    public void testCountCities(){
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertEquals(1,list.countCities());
    }
}
