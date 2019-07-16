package calculator;

public abstract class Binary implements Operation {
    @Override
    public XNumber evaluate(XNumber[] numbers) {
        if (numbers.length >= getOperandsNeeded()) {
            return evaluate(numbers[0], numbers[1]);
        }
        if (numbers.length > 0) {
            return numbers[0];
        }
        return new Number(0);
    }
    
    protected abstract XNumber evaluate(XNumber left, XNumber right);
    
    @Override
    public String getOperationDescription(XNumber[] numbers) {
        String operationDescription = "";
        if (numbers.length > 0) {
            operationDescription += numbers[0].toString() + " " + getOperationDescription() + " ";
            if (numbers.length > 1) {
                operationDescription += numbers[1];
            }
        }
        return operationDescription;
    }
    
    protected abstract String getOperationDescription();
    
    @Override
    public int getOperandsNeeded() {
        return 2;
    }
}
