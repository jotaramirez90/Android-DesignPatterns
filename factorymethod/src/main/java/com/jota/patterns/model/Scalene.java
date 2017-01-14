package com.jota.patterns.model;

public class Scalene extends Triangle {

  public Scalene(int sideA, int sideB, int sideC) {
    super(sideA, sideB, sideC);
  }

  @Override public String getDescription() {
    return "Triangle scalene";
  }

  @Override public double getArea() {
    return 0;
  }
}
