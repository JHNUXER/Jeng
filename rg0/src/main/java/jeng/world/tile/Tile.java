package jeng.world.tile;

public abstract class Tile {
  public String id;
  public String name;
  public TileIcon icon;
  
  protected TileSlot slot;
  protected float[] health;
  
  public abstract boolean destroy();
  
  public void tick() {
    if (this.health[0] == 0) {
      slot.destroyTile();
    }
  }
}
