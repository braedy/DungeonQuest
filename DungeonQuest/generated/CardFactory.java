import java.util.Set;
import java.util.HashSet;

public class CardFactory {
/**
 * <pre>
 *           1..1     0..*
 * CardFactory ------------------------- PlayerAction
 *           cardFactory        &lt;       playerAction
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
 *           0..*     0..*
 * CardFactory ------------------------- Card
 *           cardFactory        &lt;       card
 * </pre>
 */
private Set<Card> card;

public Set<Card> getCard() {
   if (this.card == null) {
this.card = new HashSet<Card>();
   }
   return this.card;
}

public void createHeroCard(String hero) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createCombatCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createDoorCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createPowerCard(String owner) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createCatacombCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createDungeonCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createDragonCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createCryptCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTreasureCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createSearchCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createRuneCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTrapCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createCorpseCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
