package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import project.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorStepDefs {
    
    private Calculator calculator;
    private double result;
    
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
    
    @Then("the result should be {double}")
    public void theResultShouldBe(double expectedResult) {
        assertEquals(expectedResult, result, 0.01);
    }
}
