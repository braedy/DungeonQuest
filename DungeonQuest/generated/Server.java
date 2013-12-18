import java.util.Set;
import java.util.HashSet;
import Array;

public class Server {
   private int connectedPlayers;
   
   private void setConnectedPlayers(int value) {
      this.connectedPlayers = value;
   }
   
   private int getConnectedPlayers() {
      return this.connectedPlayers;
   }
   
   /**
    * <pre>
    *           1..1     1..*
    * Server ------------------------- NetworkInterface
    *           server        &gt;       networkInterface
    * </pre>
    */
   private Set<NetworkInterface> networkInterface;
   
   public Set<NetworkInterface> getNetworkInterface() {
      if (this.networkInterface == null) {
         this.networkInterface = new HashSet<NetworkInterface>();
      }
      return this.networkInterface;
   }
   
   private Array clients;
   
   private void setClients(Array value) {
      this.clients = value;
   }
   
   private Array getClients() {
      return this.clients;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Server ------------------------- Client
    *           server        &gt;       client
    * </pre>
    */
   private Set<Client> client;
   
   public Set<Client> getClient() {
      if (this.client == null) {
         this.client = new HashSet<Client>();
      }
      return this.client;
   }
   
   private String ip_address;
   
   private void setIp_address(String value) {
      this.ip_address = value;
   }
   
   private String getIp_address() {
      return this.ip_address;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * Server ------------------------- Manager
    *           server        &gt;       manager
    * </pre>
    */
   private Manager manager;
   
   public void setManager(Manager value) {
      this.manager = value;
   }
   
   public Manager getManager() {
      return this.manager;
   }
   
   public void init() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void close() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void getConnectedPlayers() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void getIP() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void play() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
