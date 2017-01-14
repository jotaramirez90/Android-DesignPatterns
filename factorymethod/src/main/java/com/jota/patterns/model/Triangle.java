package com.jota.patterns.model;

public abstract class Triangle {

  private int sideA;
  private int sideB;
  private int sideC;

  public Triangle(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public abstract String getDescription();

  public abstract double getArea();

  public int getSideA() {
    return sideA;
  }

  public int getSideB() {
    return sideB;
  }

  public int getSideC() {
    return sideC;
  }
}
