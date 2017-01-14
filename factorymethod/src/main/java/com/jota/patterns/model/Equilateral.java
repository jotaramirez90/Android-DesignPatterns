package com.jota.patterns.model;

public class Equilateral extends Triangle {

  public Equilateral(int sideA, int sideB, int sideC) {
    super(sideA, sideB, sideC);
  }

  @Override public String getDescription() {
    return "Triangle equilateral";
  }

  @Override public double getArea() {
    return 0;
  }
}
