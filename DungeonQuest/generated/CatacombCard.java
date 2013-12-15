
public class CatacombCard extends Card {
private int loot;

private void setLoot(int value) {
   this.loot = value;
}

private int getLoot() {
   return this.loot;
}

private boolean attributeTest;

private void setAttributeTest(boolean value) {
   this.attributeTest = value;
}

private boolean isAttributeTest() {
   return this.attributeTest;
}

public void addToPersonalDeck(PlayerInfo player) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getLoot() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public boolean isTest() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
