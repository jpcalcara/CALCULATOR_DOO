package calculator;

public interface XArithmetics {
    public void addNumber(String number);
    public void addDecimal();
    public void setOperation(Operation operation);
    public void clear();
    public XNumber calculate();
    public String getOperation();
    public String getOperand();
}
