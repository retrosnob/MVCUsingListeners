/**
 * The ViewEventListener interface specifies that implementing
 * classes must have an onViewEventHappened method, that takes
 * a ViewEvent parameter and returns void.
 */
package mvcusinglisteners;

/**
 *
 * @author Justin Robertson
 */
public interface ViewEventListener {
    
    public void onViewEventHappened(ViewEvent e);
    
}
