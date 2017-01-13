package com.jota.patterns.builder.director;

import com.jota.patterns.builder.builder.VehicleBuilder;
import com.jota.patterns.builder.model.Vehicle;

public class VehicleDirector {

  private VehicleBuilder builder;

  public VehicleDirector(VehicleBuilder builder) {
    this.builder = builder;
  }

  public void buildVehicle() {
    builder.buildVehicle();
  }

  public Vehicle getVehicle() {
    return builder.getVehicle();
  }
}
