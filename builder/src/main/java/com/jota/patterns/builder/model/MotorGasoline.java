package com.jota.patterns.builder.model;

public class MotorGasoline extends Motor {

  @Override public String consumeFuel() {
    return "Gasoline";
  }

  @Override public int injectFuel(int liters) {
    return liters;
  }
}
