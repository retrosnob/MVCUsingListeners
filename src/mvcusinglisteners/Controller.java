/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcusinglisteners;

/**
 *
 * @author justin
 */
public class Controller implements CustomEventListener {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    
    public void onEventHappened(CustomEvent e) {
        // The model fired its event
        view.update(e.getMessage());
    }
    
}
