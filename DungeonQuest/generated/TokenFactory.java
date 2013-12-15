import java.util.Set;
import java.util.HashSet;

public class TokenFactory {
/**
 * <pre>
 *           1..1     1..1
 * TokenFactory ------------------------- GameBoard
 *           tokenFactory        &gt;       gameBoard
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
 *           1..1     0..*
 * TokenFactory ------------------------- Combat
 *           tokenFactory        &gt;       combat
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
 *           0..*     0..*
 * TokenFactory ------------------------- Token
 *           tokenFactory        &lt;       token
 * </pre>
 */
private Set<Token> token;

public Set<Token> getToken() {
   if (this.token == null) {
this.token = new HashSet<Token>();
   }
   return this.token;
}

/**
 * <pre>
 *           0..*     0..*
 * TokenFactory ------------------------- PlayerAction
 *           tokenFactory        &gt;       playerAction
 * </pre>
 */
private Set<PlayerAction> playerAction;

public Set<PlayerAction> getPlayerAction() {
   if (this.playerAction == null) {
this.playerAction = new HashSet<PlayerAction>();
   }
   return this.playerAction;
}

public void createHeroFigure(HeroCard hero) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTravelMarker(PlayerInfo traveller) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createCatacombEntrance() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createWoundToken() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createMonsterToken() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
