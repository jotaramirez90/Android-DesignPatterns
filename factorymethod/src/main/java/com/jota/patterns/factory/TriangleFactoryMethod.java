package com.jota.patterns.factory;

import com.jota.patterns.model.Triangle;

public interface TriangleFactoryMethod {

  Triangle createTriangle(int sideA, int sideB, int sideC);
}
