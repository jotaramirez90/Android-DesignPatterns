package com.jota.patterns.abstractfactory.factory;

import com.jota.patterns.abstractfactory.model.Car;
import com.jota.patterns.abstractfactory.model.CarCountry;
import com.jota.patterns.abstractfactory.model.Motorbike;
import com.jota.patterns.abstractfactory.model.MotorbikeCountry;

public class FactoryVehicleCountry implements FactoryVehicle {

  public FactoryVehicleCountry() {
  }

  @Override public Car createCar() {
    return new CarCountry();
  }

  @Override public Motorbike createMotorbike() {
    return new MotorbikeCountry();
  }
}
