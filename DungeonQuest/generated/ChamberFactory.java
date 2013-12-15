import java.util.Set;
import java.util.HashSet;

public class ChamberFactory {
/**
 * <pre>
 *           1..1     1..1
 * ChamberFactory ------------------------- GameBoard
 *           chamberFactory        &lt;       gameBoard
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
 * ChamberFactory ------------------------- Chamber
 *           chamberFactory        &lt;       chamber
 * </pre>
 */
private Set<Chamber> chamber;

public Set<Chamber> getChamber() {
   if (this.chamber == null) {
this.chamber = new HashSet<Chamber>();
   }
   return this.chamber;
}

public void createDungeonChamber(String/*No type specified*/ x, int y, String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTrapChamber(String/*No type specified*/ x, int y, String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTowerRoom(String/*No type specified*/ x, int y, String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createTreasureChamber(String/*No type specified*/ x, int y, String/*No type specified*/ int) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
