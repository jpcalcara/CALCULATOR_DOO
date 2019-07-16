package calculator;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class UI implements XUI {
    protected Label operation;
    protected Label result;
    
    public UI(InputEvent listener) {
        JFrame calculatorUI = new JFrame("Calculadora");
        calculatorUI.setLocation(400, 200);
        calculatorUI.setVisible(true);

        Layout layoutBuilder = new Layout(calculatorUI.getContentPane(), 4, 7);
        
        createDisplays(layoutBuilder);
        createOperations(layoutBuilder, listener);
        createNumbers(layoutBuilder, listener);
        
        layoutBuilder.generateLayout();
        
        calculatorUI.setLayout(layoutBuilder.getLayout());
        calculatorUI.pack();
      
    }
    @Override
    public void display(String label) {
        this.result.setText(label);     
    }
    @Override
    public void displayOperation(String label) {
        this.operation.setText(label); 
    }
    
    @Override
    public void clear() {
        this.result.setText("");
        this.operation.setText("");
    }
    
    private void createDisplays(Layout builder) {
        this.operation = new UILabel();
        builder.addLayoutElement(this.operation.getComponent(), 3, 2);
        
        this.result = new UILabel();
        builder.addLayoutElement(this.result.getComponent(), 3, 1);
        
    }
    private void createOperations(Layout builder, InputEvent listener) {
        
        InputBttn T2Button = new ClearBttn("SCI/STD");//NO DESARROLLADO AUN
        T2Button.addListener(listener);
        builder.addLayoutElement(T2Button.getComponent(), 0, 2);
        
        InputBttn TButton = new ClearBttn("History");//NO DESARROLLADO AUN
        TButton.addListener(listener);
        builder.addLayoutElement(TButton.getComponent(), 1, 2);

        InputBttn offButton = new CloseBttn("X");
        offButton.addListener(listener);
        builder.addLayoutElement(offButton.getComponent(), 3, 2);
        
        InputBttn clearButton = new ClearBttn("C");
        clearButton.addListener(listener);
        builder.addLayoutElement(clearButton.getComponent(), 2, 2);
        
        InputBttn divisionButton = new OperationBttn("/", new Division());
        divisionButton.addListener(listener);
        builder.addLayoutElement(divisionButton.getComponent(), 3, 3);
        
        InputBttn multiplicationButton = new OperationBttn("*", new Multiplication());
        multiplicationButton.addListener(listener);
        builder.addLayoutElement(multiplicationButton.getComponent(), 3, 4);
        
        InputBttn substractionButton = new OperationBttn("-", new Substraction());
        substractionButton.addListener(listener);
        builder.addLayoutElement(substractionButton.getComponent(), 3, 5);
        
        InputBttn additionButton = new OperationBttn("+", new Addition());
        additionButton.addListener(listener);
        builder.addLayoutElement(additionButton.getComponent(), 3, 6);
        
        InputBttn resultButton = new ResultBttn("=");
        resultButton.addListener(listener);
        builder.addLayoutElement(resultButton.getComponent(), 2, 6);
    }
    
    private void createNumbers(Layout builder, InputEvent listener) {
        InputBttn decimalButton = new DecimalBttn(",");
        decimalButton.addListener(listener);
        builder.addLayoutElement(decimalButton.getComponent(), 1, 6);
        
        int buttonColumn = 0;
        int buttonRow = 5;
        InputBttn[] numbersButtons = new InputBttn[10];
        numbersButtons[0] = new NumberBttn("0");
        numbersButtons[0].addListener(listener);
        builder.addLayoutElement(numbersButtons[0].getComponent(), 0, 6);
        for (Integer i = 1; i < numbersButtons.length; i++)
        {
            numbersButtons[i] = new NumberBttn(i.toString());
            numbersButtons[i].addListener(listener);
            builder.addLayoutElement(numbersButtons[i].getComponent(), buttonColumn, buttonRow);
            buttonColumn++;
            if (buttonColumn > 2) {
                buttonColumn = 0;
                buttonRow--;
            }
        }
    }
}