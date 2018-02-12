
package mvcusinglisteners;

/**
 * The controller has references to the view and the model.
 * It implements the listener interfaces of both the view and model
 * so that it can be notified of events that they fire.
 * It registers itself as a listener with each of the model and 
 * the view in its own constructor.
 * When it receives notification of an event from the view, it
 * uses its reference to the model to tell the model to update.
 * When it receives notification of an event from the model, it
 * uses its reference to the view to tell the view to update.
 * 
 * @author Justin Robertson
 */
public class Controller implements ViewEventListener, ModelEventListener {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        model.setModelEventListener(this);
        view.setViewEventListener(this);
    }
    
    public void onViewEventHappened(ViewEvent e) {
        // The model fired its event
        model.update(e.getMessage());
    }

    public void onModelEventHappened(ModelEvent e) {
        // The model fired its event
        view.update(e.getMessage());
    }    
}
