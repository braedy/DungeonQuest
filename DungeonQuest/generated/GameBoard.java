import Array;
import java.util.Set;
import java.util.HashSet;

public class GameBoard {
   private static int[][] dungeonGrid;
   
   public static void setDungeonGrid(int[][] value) {
      GameBoard.dungeonGrid = new int[10][13];
   }
   
   public static int[][] getDungeonGrid() {
      return GameBoard.dungeonGrid;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * GameBoard ------------------------- ChamberFactory
    *           gameBoard        &gt;       chamberFactory
    * </pre>
    */
   private ChamberFactory chamberFactory;
   
   public void setChamberFactory() {
      chamberFactory = new ChamberFactory();
   }
   
   public ChamberFactory getChamberFactory() {
      return this.chamberFactory;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * GameBoard ------------------------- Manager
    *           gameBoard        &lt;       manager
    * </pre>
    */
   
   
   /**
    * <pre>
    *           1..1     1..1
    * GameBoard ------------------------- TokenFactory
    *           gameBoard        &lt;       tokenFactory
    * </pre>
    */
   private TokenFactory tokenFactory;
   
   public void setTokenFactory(TokenFactory value) {
      tokenFactory = new TokenFactory();
   }
   
   public TokenFactory getTokenFactory() {
      return this.tokenFactory;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * GameBoard ------------------------- PlayerAction
    *           gameBoard        &lt;       playerAction
    * </pre>
    */
   private Set<PlayerAction> playerAction;
   
   public Set<PlayerAction> getPlayerAction() {
      if (this.playerAction == null) {
         this.playerAction = new HashSet<PlayerAction>();
      }
      return this.playerAction;
   }
   
   private Chamber currentChamber;
   
   private void setCurrentChamber(Chamber value) {
      this.currentChamber = value;
   }
   
   private Chamber getCurrentChamber() {
      return this.currentChamber;
   }
   
   public void init() {
      Manager.board = dungeonGrid;
   }
   
   public void addChamber() {
	   // to be reconfigured in next iteration i.e. remove hard code entirely
//	   switch(card.getClass().getName()){
//	   case 1: currentChamber = chamberFactory.createDungeonChamber();
//	   				return currentChamber;
//	   case 2: currentChamber = chamberFactory.createTrapChamber();
//	   				return currentChamber;
//	   case 3: currentChamber = chamberFactory.createTreasureChamber();
//	   				return currentChamber;
	   // etc.
	   };
   }
   
   public Chamber getCurrentChamber() {
      return currentChamber;
   }
   
   public void addBoardTokens(Token token) {
      currentChamber.setActiveTokens(token);
   }
   
   public void removeBoardTokens(Token token) {
      currentChamber.setActiveToken(token);
   }
   
   }
