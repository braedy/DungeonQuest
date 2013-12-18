
public class Client {
   private String gamerTag;
   
   public void setGamerTag(String value) {
      this.gamerTag = value;
   }
   
   public String getGamerTag() {
      return this.gamerTag;
   }
   
   /**
    * <pre>
    *           1..*     1..1
    * Client ------------------------- Viewer
    *           client        &gt;       viewer
    * </pre>
    */
   private Viewer viewer;
   
   public void setViewer(Viewer value) {
      this.viewer = value;
   }
   
   public Viewer getViewer() {
      return this.viewer;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Client ------------------------- Server
    *           client        &lt;       server
    * </pre>
    */
   private Server server;
   
   public void setServer(Server value) {
      this.server = value;
   }
   
   public Server getServer() {
      return this.server;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * Client ------------------------- NetworkInterface
    *           client        &lt;       networkInterface
    * </pre>
    */
   private NetworkInterface networkInterface;
   
   public void setNetworkInterface(NetworkInterface value) {
      this.networkInterface = value;
   }
   
   public NetworkInterface getNetworkInterface() {
      return this.networkInterface;
   }
   
   private String ip_address;
   
   private void setIp_address(String value) {
      this.ip_address = value;
   }
   
   private String getIp_address() {
      return this.ip_address;
   }
   
   public void disconnect() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void setGamerTag(String/*No type specified*/ String) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
