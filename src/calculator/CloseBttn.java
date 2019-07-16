package calculator;

public class CloseBttn extends InputBttn {
    public CloseBttn(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(InputEvent listener) {
        listener.onQuitInputEvent();
    }
}
