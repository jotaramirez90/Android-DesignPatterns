package com.jota.patterns.factory;

import com.jota.patterns.model.Equilateral;
import com.jota.patterns.model.Isosceles;
import com.jota.patterns.model.Scalene;
import com.jota.patterns.model.Triangle;

public class TriangleFactory implements TriangleFactoryMethod {

  @Override public Triangle createTriangle(int sideA, int sideB, int sideC) {
    if ((sideA == sideB) && (sideA == sideC)) {
      return new Equilateral(sideA, sideB, sideC);
    } else if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC)) {
      return new Scalene(sideA, sideB, sideC);
    } else {
      return new Isosceles(sideA, sideB, sideC);
    }
  }
}
