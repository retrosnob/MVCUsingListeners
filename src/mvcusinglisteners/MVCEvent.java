
package mvcusinglisteners;

/**
 *
 * @author justin
 */
public class MVCEvent {
    
    private String message;
    
    public MVCEvent(String message) {
        this.setMessage(message);
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message =  message;
    }
    
}
