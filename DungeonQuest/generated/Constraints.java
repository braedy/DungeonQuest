
public abstract class Constraints {
   /**
    * <pre>
    *           0..*     1..1
    * Constraints ------------------------- Manager
    *           constraints        &lt;       manager
    * </pre>
    */
   private Manager manager;
   
   public void setManager(Manager value) {
      this.manager = value;
   }
   
   public Manager getManager() {
      return this.manager;
   }
   
   }
