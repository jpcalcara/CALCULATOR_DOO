package calculator;

public interface XExpression {
    public boolean isCompleted();
    public void setCompleted();
    public void addOperand(XNumber number);
    public void setOperation(Operation operation);
    public XNumber evaluate();
    public String getDescription();
}
