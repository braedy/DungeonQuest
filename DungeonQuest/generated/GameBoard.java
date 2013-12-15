import Array;
import java.util.Set;
import java.util.HashSet;

public class GameBoard {
private static Array dungeonGrid;

public static void setDungeonGrid(Array value) {
   GameBoard.dungeonGrid = value;
}

public static Array getDungeonGrid() {
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

public void setChamberFactory(ChamberFactory value) {
   this.chamberFactory = value;
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
 * GameBoard ------------------------- TokenFactory
 *           gameBoard        &lt;       tokenFactory
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
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void addChamber() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Chamber getCurrentChamber(String/*No type specified*/ Player) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void addBoardTokens(String/*No type specified*/ Player, String/*No type specified*/ Token) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void removeBoardTokens(String/*No type specified*/ Player, String/*No type specified*/ Token) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
