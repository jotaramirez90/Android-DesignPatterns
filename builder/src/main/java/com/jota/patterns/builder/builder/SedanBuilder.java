package com.jota.patterns.builder.builder;

import com.jota.patterns.builder.model.Bodywork;
import com.jota.patterns.builder.model.Motor;
import com.jota.patterns.builder.model.MotorDiesel;
import com.jota.patterns.builder.model.Vehicle;
import com.jota.patterns.builder.model.Wheel;

public class SedanBuilder extends VehicleBuilder {

  @Override protected void defineVehicle() {
    vehicle = new Vehicle();
    vehicle.setBrand("Sedan");
    vehicle.setColor("Red");
  }

  @Override protected void buildMotor() {
    Motor motor = new MotorDiesel();
    vehicle.setMotor(motor);
  }

  @Override protected void buildWheel() {
    Wheel wheel = new Wheel();
    wheel.setDiameter(16);
    wheel.setTire("normal");
    vehicle.setWheel(wheel);
  }

  @Override protected void buildBodywork() {
    Bodywork bodywork = new Bodywork();
    bodywork.setMaterial("aluminum");
    bodywork.setType("sedan");
    vehicle.setBodywork(bodywork);
  }
}
