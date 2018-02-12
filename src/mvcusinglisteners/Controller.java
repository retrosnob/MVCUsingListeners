
package mvcusinglisteners;

/**
 *
 * @author justin
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
