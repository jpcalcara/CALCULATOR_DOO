package calculator;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JComponent;

public class Layout {
    protected GroupLayout layout;
    protected JComponent[][] uiElements;
    protected int columns;
    protected int rows;
    
    public Layout(Container container, int columns, int rows) {
        this.layout = new GroupLayout(container);
        this.layout.setAutoCreateGaps(true);
        this.layout.setAutoCreateContainerGaps(true);
        this.columns = columns;
        this.rows = rows;
        this.uiElements = new JComponent[this.columns][this.rows];
    }
    
    public GroupLayout getLayout() {
        return this.layout;
    }
    
    public void addLayoutElement(JComponent element, int column, int row) {
        this.uiElements[column][row] = element;
    }
    
    public void generateLayout() {
        GroupLayout.ParallelGroup[] columns = new GroupLayout.ParallelGroup[this.columns];
        for (int i = 0; i < this.columns; i++) {
            columns[i] = this.layout.createParallelGroup();
        }
        GroupLayout.ParallelGroup[] rows = new GroupLayout.ParallelGroup[this.rows];
        for (int i = 0; i < this.rows; i++) {
            rows[i] = this.layout.createParallelGroup();
        }
        
        for (int column = 0; column < this.columns; column++) {
            for (int row = 0; row < this.rows; row++) {
                if (this.uiElements[column][row] == null) {
                    continue;
                }
                columns[column].addComponent(this.uiElements[column][row], 70, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE); 
                rows[row].addComponent(this.uiElements[column][row], 55, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
            }
        }
        
        GroupLayout.SequentialGroup horizontalGroup = this.layout.createSequentialGroup();
        for (int column = 0; column < this.columns; column++) {
            horizontalGroup.addGroup(columns[column]);
        }
        GroupLayout.SequentialGroup verticalGroup = this.layout.createSequentialGroup();
        for (int row = 0; row < this.rows; row++) {
            verticalGroup.addGroup(rows[row]);
        }
        
        this.layout.setHorizontalGroup(horizontalGroup);
        this.layout.setVerticalGroup(verticalGroup);
    }
}
