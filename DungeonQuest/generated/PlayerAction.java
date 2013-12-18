import null.Array;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.lang.ArrayUtils;
import Array;

public class PlayerAction {
/**
    * <pre>
    *           1..1     1..1
    * PlayerAction ------------------------- PlayerInfo
    *           playerAction        &gt;       playerInfo
    * </pre>
    */
   private PlayerInfo playerInfo;
   
   public void setPlayerInfo() {
      playerInfo = Manager.getCurrentTurn();
   }
   
   public PlayerInfo getPlayerInfo() {
      return this.playerInfo;
   }
   
	
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

public PlayerAction() {
	die = new Die();
	cardFactory = new CardFactory();
	
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
	playerInfo.hero = drawCard(HeroCard card);
	playerInfo.hero.setRune(drawCard(RuneCard card)));
}

public void search() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void move() {
   if (Gameboard.getCurrentChamber().getClass().getName().compareTo("TrapChamber")){
	   drawnCard = drawCard(TrapCard card);
	   die.rollDie();
	   drawnCard.trapped(die.getDieValue())   
   }
   //Gameboard.getCurrentChamber()  && move interaction check for door/portcullis
   else throw new UnsupportedOperationException("not implemented");
}

public void drawCard(Card card) {
	// to be reconfigured in next iteration i.e. remove hard code entirely
   switch(card.getClass().getName()){
   case "DungeonCard": drawnCard = cardFactory.createDungeonCard();
   				return drawnCard;
   case "TrapCard": drawnCard = cardFactory.createTrapCard();
   				return drawnCard;
   case "HeroCard": drawnCard = cardFactory.createHeroCard();
   				return drawnCard;
   case "RuneCard": drawnCard = cardFactory.createRuneCard();
   				return drawnCard;
   case "TreasureCard": drawnCard = cardFactory.createTreasureCard();
   				return drawnCard;
   // etc.
   };
}

public void enterCatacombs() {
   playerInfo.inCatacombs = true;
}

public void exitCatacombs() {
   playerInfo.inCatabombs = false;
}

public void death() {
   playerInfo.dead = true;
}

public int getPlayerNo() {
   return playerInfo.playerNo;
}

public void addPlayerToken(Token token) {
   playerInfo.hero.updateActiveTokens(token);
}

public void removePlayerToken(Token token) {
   playerInfo.hero.updateActiveTokens(token);
}

public int[][] getLocation() {
   return playerInfo.boardLocation;
}

public void setLocation(int x, int y) {
   playerInfo.boardLocation = [x][y];
}

public void encounterMonster() {
   Manager.combatState();
}

public void endTurn() {
	Manager.nextTurn();
}

}

