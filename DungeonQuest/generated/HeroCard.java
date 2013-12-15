import Array;
import java.util.Set;
import java.util.HashSet;

public class HeroCard extends Card {
private int lifeValue;

private void setLifeValue(int value) {
   this.lifeValue = value;
}

private int getLifeValue() {
   return this.lifeValue;
}

private int strength;

private void setStrength(int value) {
   this.strength = value;
}

private int getStrength() {
   return this.strength;
}

private int agility;

private void setAgility(int value) {
   this.agility = value;
}

private int getAgility() {
   return this.agility;
}

private int armour;

private void setArmour(int value) {
   this.armour = value;
}

private int getArmour() {
   return this.armour;
}

private int luck;

private void setLuck(int value) {
   this.luck = value;
}

private int getLuck() {
   return this.luck;
}

private Array activeTokens;

private void setActiveTokens(Array value) {
   this.activeTokens = value;
}

private Array getActiveTokens() {
   return this.activeTokens;
}

/**
 * <pre>
 *           1..1     4..4
 * HeroCard ------------------------- PowerCard
 *           heroCard        &gt;       powerCard
 * </pre>
 */
private Set<PowerCard> powerCard;

public Set<PowerCard> getPowerCard() {
   if (this.powerCard == null) {
this.powerCard = new HashSet<PowerCard>();
   }
   return this.powerCard;
}

private int loot;

private void setLoot(int value) {
   this.loot = value;
}

private int getLoot() {
   return this.loot;
}

private RuneCard rune;

private void setRune(RuneCard value) {
   this.rune = value;
}

private RuneCard getRune() {
   return this.rune;
}

public void updateLifeValue(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateStrength(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateAgility(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateArmour(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateLuck(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateLoot(String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getLifeValue() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getStrength() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getAgility() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getArmour() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getLuck() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Array getActiveTokens() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getLoot() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public RuneCard getRune() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateActiveTokens(String/*No type specified*/ Array) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setRune() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
