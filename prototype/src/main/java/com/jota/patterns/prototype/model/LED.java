package com.jota.patterns.prototype.model;

public class LED extends Television {

  private boolean is3D;

  public LED(String brand, int inches, double price, boolean is3D) {
    super(brand, inches, price);
    this.is3D = is3D;
  }

  public boolean is3D() {
    return is3D;
  }
}
