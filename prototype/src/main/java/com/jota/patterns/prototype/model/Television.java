package com.jota.patterns.prototype.model;

public abstract class Television implements Cloneable {

  private String brand;
  private int inches;
  private double price;

  public Television(String brand, int inches, double price) {
    this.brand = brand;
    this.inches = inches;
    this.price = price;
  }

  @Override public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getBrand() {
    return brand;
  }

  public int getInches() {
    return inches;
  }

  public double getPrice() {
    return price;
  }
}
