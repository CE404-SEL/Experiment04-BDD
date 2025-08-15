package project;

public class Calculator {
    
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
    
    public double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
    
    public double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }
    
    public double divide(double firstOperand, double secondOperand) {
        if (secondOperand == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return firstOperand / secondOperand;
    }
}
