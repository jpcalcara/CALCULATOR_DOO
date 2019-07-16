package calculator;

public interface Operation {
    public XNumber evaluate(XNumber[] numbers);
    public String getOperationDescription(XNumber[] numbers);
    public int getOperandsNeeded();
}
