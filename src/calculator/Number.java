package calculator;

import java.util.Objects;

public class Number implements XNumber {
    protected String number;
    
    public Number() {
        this.number = "0";
    }
    
    public Number(String value) {
        this.number = value;
    }
    
    public Number(float value) {
        setValue(value);
    }
    
    @Override
    public void addNumber(String number) {
        if (this.number == "0") {
            this.number = number;
        }
        else {
            this.number += number;
        }
    }
    
    @Override
    public void addDecimal() {
        if (!this.number.contains(".")) {
            this.number += ".";
        }
    }
    
    @Override
    public void setValue(float value) {
        this.number = Float.toString(value);
        this.number = this.number.replace(".0", "");
    }
    
    @Override
    public float getValue() {
        return Float.parseFloat(this.number);
    }
    
    @Override
    public String toString() {
        return this.number;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof XNumber)) return false;
        XNumber otherNumber = (XNumber) other;
        return otherNumber.getValue() == getValue();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.number);
        return hash;
    }
}
