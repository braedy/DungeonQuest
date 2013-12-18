import java.util.Set;
import java.util.HashSet;

public abstract class Card implements CardInterface {
   /**
    * <pre>
    *           0..*     0..*
    * Card ------------------------- CardFactory
    *           card        &gt;       cardFactory
    * </pre>
    */
   private Set<CardFactory> cardFactory;
   
   public Set<CardFactory> getCardFactory() {
      if (this.cardFactory == null) {
         this.cardFactory = new HashSet<CardFactory>();
      }
      return this.cardFactory;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Card ------------------------- PlayerAction
    *           card        &gt;       playerAction
    * </pre>
    */
   private Set<PlayerAction> playerAction;
   
   public Set<PlayerAction> getPlayerAction() {
      if (this.playerAction == null) {
         this.playerAction = new HashSet<PlayerAction>();
      }
      return this.playerAction;
   }
   
   }
