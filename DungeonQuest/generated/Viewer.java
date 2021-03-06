import java.util.Set;
import java.util.HashSet;

public class Viewer {
   /**
    * <pre>
    *           1..1     1..1
    * Viewer ------------------------- Controller
    *           viewer        &gt;       controller
    * </pre>
    */
   private Controller controller;
   
   public void setController(Controller value) {
      this.controller = value;
   }
   
   public Controller getController() {
      return this.controller;
   }
   
   /**
    * <pre>
    *           1..1     1..*
    * Viewer ------------------------- Client
    *           viewer        &lt;       client
    * </pre>
    */
   private Set<Client> client;
   
   public Set<Client> getClient() {
      if (this.client == null) {
         this.client = new HashSet<Client>();
      }
      return this.client;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Viewer ------------------------> Player
    *           viewer        &gt;       playerInfo
    * </pre>
    */
   private Set<Player> playerInfo;
   
   public Set<Player> getPlayerInfo() {
      if (this.playerInfo == null) {
         this.playerInfo = new HashSet<Player>();
      }
      return this.playerInfo;
   }
   
   public void displayContent() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void displayOptions() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
