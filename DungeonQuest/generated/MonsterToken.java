import java.util.Set;
import java.util.HashSet;

public class MonsterToken extends Token {
   private String monsterType;
   
   private void setMonsterType(String value) {
      this.monsterType = value;
   }
   
   private String getMonsterType() {
      return this.monsterType;
   }
   
   /**
    * <pre>
    *           1..1     4..4
    * MonsterToken ------------------------- PowerCard
    *           monsterToken        &gt;       powerCard
    * </pre>
    */
   private Set<PowerCard> powerCard;
   
   public Set<PowerCard> getPowerCard() {
      if (this.powerCard == null) {
         this.powerCard = new HashSet<PowerCard>();
      }
      return this.powerCard;
   }
   
   private int lifeValue;
   
   private void setLifeValue(int value) {
      this.lifeValue = value;
   }
   
   private int getLifeValue() {
      return this.lifeValue;
   }
   
   public String getMonsterType() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public int getLifeValue() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
