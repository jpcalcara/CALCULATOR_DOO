package calculator;

public interface XNumber {
    public void addNumber(String number);
    public void addDecimal();
    public void setValue(float value);
    public float getValue();

    public String toString();
  
    public boolean equals(Object other);
}
