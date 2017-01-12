package com.jota.patterns.abstractfactory.factory;

import com.jota.patterns.abstractfactory.model.Car;
import com.jota.patterns.abstractfactory.model.Motorbike;

public interface FactoryVehicle {

  Car createCar();

  Motorbike createMotorbike();
}
