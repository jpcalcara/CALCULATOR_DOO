package calculator;

public class NumberBttn extends InputBttn {
    public NumberBttn(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(InputEvent listener) {
        listener.onNumberInputEvent(this.button.getText());
    }
}
