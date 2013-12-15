
public class Controller {
private String gamerTag;

public void setGamerTag(String value) {
   this.gamerTag = value;
}

public String getGamerTag() {
   return this.gamerTag;
}

/**
 * <pre>
 *           1..1     1..1
 * Controller ------------------------- Viewer
 *           controller        &lt;       viewer
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
 *           1..*     1..1
 * Controller ------------------------> Manager
 *           controller        &gt;       manager
 * </pre>
 */
private Manager manager;

public void setManager(Manager value) {
   this.manager = value;
}

public Manager getManager() {
   return this.manager;
}

public void interaction(Object eventSource) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
