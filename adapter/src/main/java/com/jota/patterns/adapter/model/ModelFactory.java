package com.jota.patterns.adapter.model;

import java.util.ArrayList;

public class ModelFactory {

  public static ArrayList<City> getCities() {
    ArrayList<City> cities = new ArrayList<>();
    cities.add(new City("Madrid", "Spain"));
    cities.add(new City("Barcelona", "Spain"));
    cities.add(new City("Bilbao", "Spain"));
    cities.add(new City("Lisbon", "Portugal"));
    cities.add(new City("Rome", "Italy"));
    cities.add(new City("London", "UK"));
    cities.add(new City("Paris", "France"));
    cities.add(new City("Brussels", "Belgium"));
    cities.add(new City("New York", "USA"));
    cities.add(new City("San Francisco", "USA"));

    return cities;
  }
}
