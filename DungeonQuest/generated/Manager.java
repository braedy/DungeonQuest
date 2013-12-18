import null.Array;
import Array;
import org.apache.commons.lang.ArrayUtils;
import java.util.Set;
import java.util.HashSet;

public class Manager {
private static GameBoard board;

private PlayerInfo[] players;

private void setPlayers(Array value) {
   this.players = value;
}

private PlayerInfo[] getPlayers() {
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
   PlayerAction playerAction = new PlayerAction();
   playerAction.setPlayerInfo(new PlayerInfo(gamerTag));
   playerAction.chooseHero();
   PlayerInfo player = playerAction.getPlayerInfo();
   ArrayUtils.add(players, player);
}

public PlayerInfo[] getPlayers() {
   return players;
}

public GameBoard getBoard() {
   return board;
}

public PlayerInfo getCurrentTurn() {
   return currentTurn;
}

public void nextTurn() {
	if (java.util.Arrays.binarySearch(players, currentTurn) = players.length-1){
			currentTurn = players[0];
	}
	else{
		   currentTurn = players[java.util.Arrays.binarySearch(players, currentTurn)];
	}
}

public void removePlayer(PlayerInfo player) {
   players = ArrayUtils.removeElement(players, player);
}

public void combatState() {
   new combatState();
}

public void notify() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
