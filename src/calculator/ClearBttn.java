package calculator;

public class ClearBttn extends InputBttn {
    public ClearBttn(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(InputEvent listener) {
        listener.onClearInputEvent();
    }
}
