
package mvcusinglisteners;

/**
 *
 * @author justin
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
