import Array;
import java.util.Set;
import java.util.HashSet;

public class Manager {
private GameBoard board;

private void setBoard(GameBoard value) {
   this.board = value;
}

private GameBoard getBoard() {
   return this.board;
}

private Array players;

private void setPlayers(Array value) {
   this.players = value;
}

private Array getPlayers() {
   return this.players;
}

private PlayerInfo currentTurn;

private void setCurrentTurn(PlayerInfo value) {
   this.currentTurn = value;
}

private PlayerInfo getCurrentTurn() {
   return this.currentTurn;
}

/**
 * <pre>
 *           1..1     1..1
 * Manager ------------------------- GameBoard
 *           manager        &gt;       gameBoard
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
 *           1..1     1..1
 * Manager ------------------------- Server
 *           manager        &lt;       server
 * </pre>
 */
private Server server;

public void setServer(Server value) {
   this.server = value;
}

public Server getServer() {
   return this.server;
}

/**
 * <pre>
 *           1..1     0..*
 * Manager ------------------------- Constraints
 *           manager        &gt;       constraints
 * </pre>
 */
private Set<Constraints> constraints;

public Set<Constraints> getConstraints() {
   if (this.constraints == null) {
this.constraints = new HashSet<Constraints>();
   }
   return this.constraints;
}

/**
 * <pre>
 *           1..1     0..*
 * Manager ------------------------- PlayerAction
 *           manager        &gt;       playerAction
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
 *           1..1     0..*
 * Manager ------------------------- Combat
 *           manager        &gt;       combat
 * </pre>
 */
private Set<Combat> combat;

public Set<Combat> getCombat() {
   if (this.combat == null) {
this.combat = new HashSet<Combat>();
   }
   return this.combat;
}

public void startGame() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void endGame() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void newPlayer(String gamerTag) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Array getPlayers() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public GameBoard getBoard() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public PlayerInfo getCurrentTurn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void nextTurn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void removePlayer(PlayerInfo player) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void combatState() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void notify() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
