import java.util.Set;
import java.util.HashSet;

public abstract class Token implements TokenInterface {
   /**
    * <pre>
    *           0..*     0..*
    * Token ------------------------- TokenFactory
    *           token        &gt;       tokenFactory
    * </pre>
    */
   private Set<TokenFactory> tokenFactory;
   
   public Set<TokenFactory> getTokenFactory() {
      if (this.tokenFactory == null) {
         this.tokenFactory = new HashSet<TokenFactory>();
      }
      return this.tokenFactory;
   }
   
   }
