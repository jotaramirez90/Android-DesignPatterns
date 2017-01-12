package com.jota.patterns.abstractfactory.factory;

import com.jota.patterns.abstractfactory.model.Car;
import com.jota.patterns.abstractfactory.model.CarRoad;
import com.jota.patterns.abstractfactory.model.Motorbike;
import com.jota.patterns.abstractfactory.model.MotorbikeRoad;

public class FactoryVehicleRoad implements FactoryVehicle {

  public FactoryVehicleRoad() {
  }

  @Override public Car createCar() {
    return new CarRoad();
  }

  @Override public Motorbike createMotorbike() {
    return new MotorbikeRoad();
  }
}
