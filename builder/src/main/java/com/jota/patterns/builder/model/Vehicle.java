package com.jota.patterns.builder.model;

public class Vehicle {

  private String brand;
  private String color;
  private Bodywork bodywork;
  private Motor motor;
  private Wheel wheel;

  public Vehicle() {
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Bodywork getBodywork() {
    return bodywork;
  }

  public void setBodywork(Bodywork bodywork) {
    this.bodywork = bodywork;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }
}
