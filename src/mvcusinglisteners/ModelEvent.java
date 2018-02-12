
package mvcusinglisteners;

/**
 * The ViewEvent just contains a simple message string
 * but could be made much more comprehensive. 
 * @author Justin Robertson
 */
public class ModelEvent extends MVCEvent {
    
    public ModelEvent(String message) {
        super(message);
    }

}