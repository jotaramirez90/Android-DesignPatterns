package com.jota.patterns.builder.builder;

import com.jota.patterns.builder.model.Vehicle;

public abstract class VehicleBuilder {

  protected Vehicle vehicle;

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void buildVehicle() {
    defineVehicle();
    buildMotor();
    buildBodywork();
    buildWheel();
  }

  protected abstract void defineVehicle();

  protected abstract void buildMotor();

  protected abstract void buildWheel();

  protected abstract void buildBodywork();
}
