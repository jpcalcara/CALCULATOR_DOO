package calculator;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UILabel implements Label{
    protected JLabel label;
    
    public UILabel() {
        this.label = new JLabel("");
        this.label.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    
    public UILabel(String label) {
        this.label = new JLabel(label);
        this.label.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    
    @Override
    public JComponent getComponent() {
        return this.label;
    }
    
    @Override
    public void setText(String text) {
        this.label.setText(text);
    }
    
    @Override
    public String getText() {
        return this.label.getText();
    }
}
