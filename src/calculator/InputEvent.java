package calculator;

public interface InputEvent {
    public void onNumberInputEvent(String number);
    public void onDecimalInputEvent();
    public void onOperaitonInputEvent(Operation operation);
    public void onEqualsInputEvent();
    public void onQuitInputEvent();
    public void onClearInputEvent();
}
