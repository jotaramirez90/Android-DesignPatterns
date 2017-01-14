package com.jota.patterns.model;

public class Isosceles extends Triangle {

  public Isosceles(int sideA, int sideB, int sideC) {
    super(sideA, sideB, sideC);
  }

  @Override public String getDescription() {
    return "Triangle isosceles";
  }

  @Override public double getArea() {
    return 0;
  }
}
