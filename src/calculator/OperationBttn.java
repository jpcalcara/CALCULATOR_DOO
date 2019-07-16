package calculator;


public class OperationBttn extends InputBttn {
    protected Operation operation;
    
    public OperationBttn(String label) {
        super(label);
    }
    
    public OperationBttn(String label, Operation operation) {
        super(label);
        this.operation = operation;
    }
    
    @Override
    protected void callListenerFunction(InputEvent listener) {
        listener.onOperaitonInputEvent(this.operation);
    }
}
