import Array;

public class PlayerInfo {
private static HeroCard hero;

public static void setHero(HeroCard value) {
   PlayerInfo.hero = value;
}

public static HeroCard getHero() {
   return PlayerInfo.hero;
}

private int playerNo;

private void setPlayerNo(int value) {
   this.playerNo = value;
}

private int getPlayerNo() {
   return this.playerNo;
}

private String gamerTag;

public void setGamerTag(String value) {
   this.gamerTag = value;
}

public String getGamerTag() {
   return this.gamerTag;
}

private Array personalDeck;

public void setPersonalDeck(Array value) {
   this.personalDeck = value;
}

public Array getPersonalDeck() {
   return this.personalDeck;
}

private boolean inCatacombs;

public void setInCatacombs(boolean value) {
   this.inCatacombs = value;
}

public boolean isInCatacombs() {
   return this.inCatacombs;
}

private boolean dead;

public void setDead(boolean value) {
   this.dead = value;
}

public boolean isDead() {
   return this.dead;
}

private boolean exitedDungeon;

public void setExitedDungeon(boolean value) {
   this.exitedDungeon = value;
}

public boolean isExitedDungeon() {
   return this.exitedDungeon;
}

private Array boardLocation;

private void setBoardLocation(Array value) {
   this.boardLocation = value;
}

private Array getBoardLocation() {
   return this.boardLocation;
}

/**
 * <pre>
 *           1..1     1..1
 * PlayerInfo ------------------------- PlayerAction
 *           playerInfo        &lt;       playerAction
 * </pre>
 */
private PlayerAction playerAction;

public void setPlayerAction(PlayerAction value) {
   this.playerAction = value;
}

public PlayerAction getPlayerAction() {
   return this.playerAction;
}

}
