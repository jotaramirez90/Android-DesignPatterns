package com.jota.patterns.abstractfactory.model;

public abstract class Vehicle {

  public abstract String getName();

  public abstract String getType();

  public String showDetails() {
    return getName() + " " + getType();
  }
}
