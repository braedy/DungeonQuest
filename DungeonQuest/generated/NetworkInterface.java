
public class NetworkInterface {
/**
 * <pre>
 *           1..*     1..1
 * NetworkInterface ------------------------- Server
 *           networkInterface        &lt;       server
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
 * NetworkInterface ------------------------- Client
 *           networkInterface        &gt;       client
 * </pre>
 */
private Client client;

public void setClient(Client value) {
   this.client = value;
}

public Client getClient() {
   return this.client;
}

private String ip_address;

private void setIp_address(String value) {
   this.ip_address = value;
}

private String getIp_address() {
   return this.ip_address;
}

public void join(String/*No type specified*/ String) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void play(String/*No type specified*/ ) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void observe(String/*No type specified*/ ) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public static void main() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void createServer(String/*No type specified*/ String) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
