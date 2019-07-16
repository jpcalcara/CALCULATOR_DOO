package calculator;

import java.util.ArrayList;

public class Expression implements XExpression {
    protected ArrayList<XNumber> operands;
    protected Operation operation;
    protected boolean isCompleted;
    
    public Expression() {
        this.operands = new ArrayList<>();
        this.isCompleted = false;
    }
    
    @Override
    public boolean isCompleted() {
        return this.isCompleted;
    }
    
    @Override
    public void setCompleted() {
        this.isCompleted = true;
    }
    
    @Override
    public void addOperand(XNumber number) {
        this.operands.add(number);
    }

    @Override
    public void setOperation(Operation operation) {
        if (this.operands.size() > 0) {
            this.operation = operation;
        }
    }

    @Override
    public XNumber evaluate() {
        if (this.operation != null) {
            return this.operation.evaluate(operandsAsArray());
        }
        if (this.operands.size() > 0) {
            return this.operands.get(0);
        }
        return new Number();
    }

    @Override
    public String getDescription() {
        if (this.operation != null) {
            return this.operation.getOperationDescription(operandsAsArray());
        }
        return "";
    }
    
    private XNumber[] operandsAsArray() {
        XNumber[] operandsArray = new XNumber[this.operands.size()];
        operandsArray = this.operands.toArray(operandsArray);
        return operandsArray;
    }
}
