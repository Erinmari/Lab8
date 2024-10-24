package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Adds a city to cityList and checks that hasCity returns True for that city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(list.hasCity(city), Boolean.TRUE);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Spruce Grove", "ALberta");
        list.addCity(city);
        int addedListSize = list.getCount();
        //now remove the city
        list.deleteCity(city);
        //check that the size decreased by one
        assertEquals(list.getCount(), addedListSize - 1);
        //check that the city is no longer in the city list
        assertEquals(list.hasCity(city), Boolean.FALSE);
    }



}
