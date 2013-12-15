
public class CryptCard extends Card {
private int loot;

private void setLoot(int value) {
   this.loot = value;
}

private int getLoot() {
   return this.loot;
}

private boolean cryptGuardian;

private void setCryptGuardian(boolean value) {
   this.cryptGuardian = value;
}

private boolean isCryptGuardian() {
   return this.cryptGuardian;
}

public int guardianDamage(boolean cryptGuardian) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getLoot() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public boolean isGuarded() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
