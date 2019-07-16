package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

public abstract class Button implements Elements {
    protected JButton button;
    
    public Button(String label) {
        this.button = new JButton(label);
        this.button.setText(label);
        this.button.setBackground(Color.LIGHT_GRAY);
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                onButtonClicked();
            }
        });
    }
    

    
    @Override
    public JComponent getComponent() {
        return this.button;
    }
    
    protected abstract void onButtonClicked();
}
