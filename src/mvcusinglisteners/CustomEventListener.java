/*
 * You may not have seen a Java interface before but it's quite simple.
 * All it says is that if, as a class, you want to call yourself a 
 * CustomEventListener, then you have to implement a methods called 
 * onEventHappened.
 */
package mvcusinglisteners;

/**
 *
 * @author justin
 */
public interface CustomEventListener {
    
    public void onEventHappened(CustomEvent e);
    
}
