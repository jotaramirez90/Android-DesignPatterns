package com.jota.patterns.prototype.prototype;

import com.jota.patterns.prototype.model.Television;
import java.util.HashMap;

public class TelevisionPrototype {

  public enum TelevisionType {
    LCD, LED
  }

  private HashMap<TelevisionType, Television> prototypes = new HashMap<>();

  public TelevisionPrototype() {
  }

  public void addPrototype(TelevisionType type, Television television) {
    prototypes.put(type, television);
  }

  public void deletePrototype(TelevisionType type) {
    prototypes.remove(type);
  }

  public Object getPrototype(TelevisionType type) throws CloneNotSupportedException {
    return prototypes.get(type).clone();
  }
}
