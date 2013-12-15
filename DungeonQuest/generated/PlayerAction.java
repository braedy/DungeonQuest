import java.util.Set;
import java.util.HashSet;
import Array;

public class PlayerAction {
/**
 * <pre>
 *           0..*     1..1
 * PlayerAction ------------------------- CardFactory
 *           playerAction        &gt;       cardFactory
 * </pre>
 */
private CardFactory cardFactory;

public void setCardFactory(CardFactory value) {
   this.cardFactory = value;
}

public CardFactory getCardFactory() {
   return this.cardFactory;
}

/**
 * <pre>
 *           0..*     1..1
 * PlayerAction ------------------------- GameBoard
 *           playerAction        &gt;       gameBoard
 * </pre>
 */
private GameBoard gameBoard;

public void setGameBoard(GameBoard value) {
   this.gameBoard = value;
}

public GameBoard getGameBoard() {
   return this.gameBoard;
}

/**
 * <pre>
 *           0..*     0..*
 * PlayerAction ------------------------- Combat
 *           playerAction        &gt;       combat
 * </pre>
 */
private Set<Combat> combat;

public Set<Combat> getCombat() {
   if (this.combat == null) {
this.combat = new HashSet<Combat>();
   }
   return this.combat;
}

/**
 * <pre>
 *           0..*     1..1
 * PlayerAction ------------------------- Manager
 *           playerAction        &lt;       manager
 * </pre>
 */
private Manager manager;

public void setManager(Manager value) {
   this.manager = value;
}

public Manager getManager() {
   return this.manager;
}

/**
 * <pre>
 *           1..1     1..1
 * PlayerAction ------------------------- PlayerInfo
 *           playerAction        &gt;       playerInfo
 * </pre>
 */
private PlayerInfo playerInfo;

public void setPlayerInfo(PlayerInfo value) {
   this.playerInfo = value;
}

public PlayerInfo getPlayerInfo() {
   return this.playerInfo;
}

/**
 * <pre>
 *           0..*     0..*
 * PlayerAction ------------------------- TokenFactory
 *           playerAction        &lt;       tokenFactory
 * </pre>
 */
private Set<TokenFactory> tokenFactory;

public Set<TokenFactory> getTokenFactory() {
   if (this.tokenFactory == null) {
this.tokenFactory = new HashSet<TokenFactory>();
   }
   return this.tokenFactory;
}

private Card drawnCard;

public void setDrawnCard(Card value) {
   this.drawnCard = value;
}

public Card getDrawnCard() {
   return this.drawnCard;
}

private Die die;

public void setDie(Die value) {
   this.die = value;
}

public Die getDie() {
   return this.die;
}

/**
 * <pre>
 *           0..*     0..*
 * PlayerAction ------------------------- Card
 *           playerAction        &lt;       card
 * </pre>
 */
private Set<Card> card;

public Set<Card> getCard() {
   if (this.card == null) {
this.card = new HashSet<Card>();
   }
   return this.card;
}

public void chooseHero() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void search() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void move() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void drawCard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void enterCatacombs() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void exitCatacombs() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void death() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public int getPlayerNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void addPlayerToken(Token token) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void removePlayerToken(Token token) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Array getLocation() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setLocation(String/*No type specified*/ x, int y, String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void encounterMonster() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void endTurn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
