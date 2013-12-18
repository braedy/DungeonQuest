
/**
 * This is an inner class of PlayerAction
 */
public class PlayerInfo implements Player {
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
