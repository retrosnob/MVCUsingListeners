
package mvcusinglisteners;

/**
 * The ViewEvent just contains a simple message string
 * but it could be made much more comprehensive.
 * @author Justin Robertson
 */
public class ViewEvent extends MVCEvent {
    
    public ViewEvent(String message) {
        super(message);
    }

}
