
package calculator;

public class DecimalBttn extends InputBttn {
    public DecimalBttn(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(InputEvent listener) {
        listener.onDecimalInputEvent();
    }
}
