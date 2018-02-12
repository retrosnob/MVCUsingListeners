
package mvcusinglisteners;

/**
 * The Model is the logic for application.
 * In a real application, the model would deal with persistent
 * and in-memory storage.
 * It has no references to any other part of the application.
 * It has an update method that allows the controller to tell it
 * to update.
 * It can fire events that the controller will respond to.
 * @author Justin Robertson
 */
public class Model {
    
    ModelEventListener listener;
    
    void setModelEventListener(ModelEventListener listener) {
        this.listener = listener;
    }
    
    void fireModelEventHappened() {
        if (listener != null) {
            listener.onModelEventHappened(new ModelEvent("Message from the Model"));
        }
    }
    
    void update(String message) {
        System.out.println("Model received: " + message);
        fireModelEventHappened();
    }
}
