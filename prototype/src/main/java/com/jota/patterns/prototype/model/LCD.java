package com.jota.patterns.prototype.model;

public class LCD extends Television {

  private int visionAngle;

  public LCD(String brand, int inches, double price, int visionAngle) {
    super(brand, inches, price);
    this.visionAngle = visionAngle;
  }

  public int getVisionAngle() {
    return visionAngle;
  }
}
