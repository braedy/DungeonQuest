import java.util.Set;
import java.util.HashSet;

public class ServerViewer extends Server {
/**
 * <pre>
 *           1..1     0..*
 * ServerViewer ------------------------> Viewer
 *           serverViewer        &gt;       viewer
 * </pre>
 */
private Set<Viewer> viewer;

public Set<Viewer> getViewer() {
   if (this.viewer == null) {
this.viewer = new HashSet<Viewer>();
   }
   return this.viewer;
}

public void updateDisplay() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void updateOptions() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
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
