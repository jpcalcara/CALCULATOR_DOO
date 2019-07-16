package calculator;

public class Substraction extends Binary {

    protected XNumber evaluate(XNumber left, XNumber right) {
        return new Number(left.getValue() - right.getValue());
    }

    protected String getOperationDescription() {
        return "-";
    }
}
