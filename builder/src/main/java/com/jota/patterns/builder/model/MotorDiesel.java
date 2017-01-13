package com.jota.patterns.builder.model;

public class MotorDiesel extends Motor {

  @Override public String consumeFuel() {
    return "Diesel";
  }

  @Override public int injectFuel(int liters) {
    return liters;
  }
}
