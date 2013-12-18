
public class PowerCard extends Card {
   private int escapeValue;
   
   private void setEscapeValue(int value) {
      this.escapeValue = value;
   }
   
   private int getEscapeValue() {
      return this.escapeValue;
   }
   
   private int damageValue;
   
   private void setDamageValue(int value) {
      this.damageValue = value;
   }
   
   private int getDamageValue() {
      return this.damageValue;
   }
   
   /**
    * <pre>
    *           4..4     1..1
    * PowerCard ------------------------- HeroCard
    *           powerCard        &lt;       heroCard
    * </pre>
    */
   private HeroCard heroCard;
   
   public void setHeroCard(HeroCard value) {
      this.heroCard = value;
   }
   
   public HeroCard getHeroCard() {
      return this.heroCard;
   }
   
   private String owner;
   
   private void setOwner(String value) {
      this.owner = value;
   }
   
   private String getOwner() {
      return this.owner;
   }
   
   /**
    * <pre>
    *           4..4     1..1
    * PowerCard ------------------------- MonsterToken
    *           powerCard        &lt;       monsterToken
    * </pre>
    */
   private MonsterToken monsterToken;
   
   public void setMonsterToken(MonsterToken value) {
      this.monsterToken = value;
   }
   
   public MonsterToken getMonsterToken() {
      return this.monsterToken;
   }
   
   public void boostAttribute() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public int getEscapeValue() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public int getDamageValue() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public String getOwner() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
