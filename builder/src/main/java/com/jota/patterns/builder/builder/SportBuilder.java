package com.jota.patterns.builder.builder;

import com.jota.patterns.builder.model.Bodywork;
import com.jota.patterns.builder.model.Motor;
import com.jota.patterns.builder.model.MotorGasoline;
import com.jota.patterns.builder.model.Vehicle;
import com.jota.patterns.builder.model.Wheel;

public class SportBuilder extends VehicleBuilder {

  @Override protected void defineVehicle() {
    vehicle = new Vehicle();
    vehicle.setBrand("Sport");
    vehicle.setColor("Black");
  }

  @Override protected void buildMotor() {
    Motor motor = new MotorGasoline();
    vehicle.setMotor(motor);
  }

  @Override protected void buildWheel() {
    Wheel wheel = new Wheel();
    wheel.setDiameter(17);
    wheel.setTire("sport");
    vehicle.setWheel(wheel);
  }

  @Override protected void buildBodywork() {
    Bodywork bodywork = new Bodywork();
    bodywork.setMaterial("aluminum");
    bodywork.setType("sport");
    vehicle.setBodywork(bodywork);
  }
}
