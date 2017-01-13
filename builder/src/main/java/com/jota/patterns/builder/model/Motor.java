package com.jota.patterns.builder.model;

public abstract class Motor {

  private int power;
  private int speed;
  private int intake;

  public abstract String consumeFuel();

  public abstract int injectFuel(int liters);
}
