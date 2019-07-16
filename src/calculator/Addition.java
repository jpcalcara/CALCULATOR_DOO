package calculator;

public class Addition extends Binary {
    @Override
    protected XNumber evaluate(XNumber left, XNumber right) {
        return new Number(left.getValue() + right.getValue());
    }

    @Override
    protected String getOperationDescription() {
        return "+";
    }
}
