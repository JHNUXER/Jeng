package jeng.physics.substance;

public class Substance {
  public String name;
  public String id;
  public float density;
  
  public float getMass(float volume) {
    return volume * density;
  }
}
