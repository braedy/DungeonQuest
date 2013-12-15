import java.util.Set;
import java.util.HashSet;

public abstract class Chamber implements ChamberInterface {
/**
 * <pre>
 *           0..*     0..*
 * Chamber ------------------------- ChamberFactory
 *           chamber        &gt;       chamberFactory
 * </pre>
 */
private Set<ChamberFactory> chamberFactory;

public Set<ChamberFactory> getChamberFactory() {
   if (this.chamberFactory == null) {
this.chamberFactory = new HashSet<ChamberFactory>();
   }
   return this.chamberFactory;
}

}
