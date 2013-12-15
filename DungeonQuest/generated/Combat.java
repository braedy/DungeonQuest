import java.util.Set;
import java.util.HashSet;

public class Combat {
/**
 * <pre>
 *           0..*     0..*
 * Combat ------------------------- PlayerAction
 *           combat        &lt;       playerAction
 * </pre>
 */
private Set<PlayerAction> playerAction;

public Set<PlayerAction> getPlayerAction() {
   if (this.playerAction == null) {
this.playerAction = new HashSet<PlayerAction>();
   }
   return this.playerAction;
}

/**
 * <pre>
 *           0..*     1..1
 * Combat ------------------------- TokenFactory
 *           combat        &lt;       tokenFactory
 * </pre>
 */
private TokenFactory tokenFactory;

public void setTokenFactory(TokenFactory value) {
   this.tokenFactory = value;
}

public TokenFactory getTokenFactory() {
   return this.tokenFactory;
}

/**
 * <pre>
 *           0..*     1..1
 * Combat ------------------------- Manager
 *           combat        &lt;       manager
 * </pre>
 */
private Manager manager;

public void setManager(Manager value) {
   this.manager = value;
}

public Manager getManager() {
   return this.manager;
}

private int monsterHealth;

public void setMonsterHealth(int value) {
   this.monsterHealth = value;
}

public int getMonsterHealth() {
   return this.monsterHealth;
}

private int playerHealth;

public void setPlayerHealth(int value) {
   this.playerHealth = value;
}

public int getPlayerHealth() {
   return this.playerHealth;
}

private PowerCard playerPowerCard;

public void setPlayerPowerCard(PowerCard value) {
   this.playerPowerCard = value;
}

public PowerCard getPlayerPowerCard() {
   return this.playerPowerCard;
}

private PowerCard monsterPowerCard;

public void setMonsterPowerCard(PowerCard value) {
   this.monsterPowerCard = value;
}

public PowerCard getMonsterPowerCard() {
   return this.monsterPowerCard;
}

private boolean playersTurn;

public void setPlayersTurn(boolean value) {
   this.playersTurn = value;
}

public boolean isPlayersTurn() {
   return this.playersTurn;
}

private CombatCard cardDrawn;

public void setCardDrawn(CombatCard value) {
   this.cardDrawn = value;
}

public CombatCard getCardDrawn() {
   return this.cardDrawn;
}

public void init() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getMonsterHealth() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getPlayerHealth() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void choosePowerCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void attemptEscape() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public CombatCard drawCombatCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public boolean isPlayersTurn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void dealDamage(CombatCard card, boolean playersTurn) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public CombatCard getCardDrawn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void monsterDeath() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void playerDeath() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void end() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void update() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
