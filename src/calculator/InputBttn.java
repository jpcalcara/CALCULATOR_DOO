package calculator;

import java.util.ArrayList;

public abstract class InputBttn extends Button {
    protected ArrayList<InputEvent> listeners;
    
  
    public InputBttn(String label) {
        super(label);
        this.listeners = new ArrayList<>();
    }
    
    public void addListener(InputEvent listener) {
        this.listeners.add(listener);
    }
    
    @Override
    protected void onButtonClicked() {
        for (int i = 0; i < this.listeners.size(); i++) {
            callListenerFunction(this.listeners.get(i));
        }
    }
    
    protected abstract void callListenerFunction(InputEvent listener);
}
