package calculator;

public class ResultBttn extends InputBttn {
    public ResultBttn(String label) {
        super(label);
    }
    protected void callListenerFunction(InputEvent listener) {
        listener.onEqualsInputEvent();
    }
}
