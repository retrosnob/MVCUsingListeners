
package mvcusinglisteners;

/**
 * The ModelEventListener interface specifies that implementing
 * classes must have an onModelEventHappened method, that takes
 * a ModelEvent parameter and return void.
 * @author Justin Robertson
 */
public interface ModelEventListener {
    
    public void onModelEventHappened(ModelEvent e);
    
}


