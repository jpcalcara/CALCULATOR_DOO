package calculator;

import javax.swing.SwingConstants;

public class Calculator implements InputEvent {
    protected XUI uiModule;
    protected XArithmetics arithmeticsModule;

    public Calculator()
    {
        this.uiModule = new UI(this);
        this.arithmeticsModule = new Arithmetics();
    }

    @Override
    public void onNumberInputEvent(String number) {
        this.arithmeticsModule.addNumber(number);
        this.uiModule.display(this.arithmeticsModule.getOperand());
    }

    @Override
    public void onDecimalInputEvent() {
        this.arithmeticsModule.addDecimal();
        this.uiModule.display(this.arithmeticsModule.getOperand());
    }

    @Override
    public void onOperaitonInputEvent(Operation operation) {
        this.arithmeticsModule.setOperation(operation);
        this.uiModule.displayOperation(this.arithmeticsModule.getOperation());
        this.uiModule.display("");
    }

    @Override
    public void onQuitInputEvent() {
        System.exit(0);
    }

    @Override
    public void onClearInputEvent() {
        this.arithmeticsModule.clear();
        this.uiModule.clear();
    }

    @Override
    public void onEqualsInputEvent() {
        this.uiModule.displayOperation("");
        String result = this.arithmeticsModule.calculate().toString();
        this.uiModule.display(result);
 
    }
}
