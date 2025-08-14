package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import project.Calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorStepDefs {
    
    private Calculator calculator;
    private double result;
    private Exception exception;
    
    @Given("a calculator")
    public void aCalculator() {
        calculator = new Calculator();
    }
    
    @When("I add {double} and {double}")
    public void iAddAnd(double firstOperand, double secondOperand) {
        result = calculator.add(firstOperand, secondOperand);
    }
    
    @When("I multiply {double} and {double}")
    public void iMultiplyAnd(double firstOperand, double secondOperand) {
        result = calculator.multiply(firstOperand, secondOperand);
    }
    
    @When("I subtract {double} from {double}")
    public void iSubtractFrom(double secondOperand, double firstOperand) {
        result = calculator.subtract(firstOperand, secondOperand);
    }
    
    @When("I divide {double} by {double}")
    public void iDivideBy(double firstOperand, double secondOperand) {
        try {
            result = calculator.divide(firstOperand, secondOperand);
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @When("I divide {double} by zero")
    public void iDivideByZero(double firstOperand) {
        try {
            result = calculator.divide(firstOperand, 0.0);
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @Then("the result should be {double}")
    public void theResultShouldBe(double expectedResult) {
        assertEquals(expectedResult, result, 0.01);
    }
    
    @Then("the operation should fail with error message")
    public void theOperationShouldFailWithErrorMessage() {
        if (exception == null) {
            fail("Expected an exception to be thrown for division by zero");
        }
    }
}
