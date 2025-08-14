@Tag
Feature: Calculator operations

  Scenario Outline: Addition operation
    Given a calculator
    When I add <first_operand> and <second_operand>
    Then the result should be <expected_result>

    Examples:
      | first_operand | second_operand | expected_result |
      | 5.0           | 3.0            | 8.0             |
      | -2.5          | 4.7            | 2.2             |
      | 0.0           | 0.0            | 0.0             |
      | -10.0         | -5.0           | -15.0           |
      | 100.5         | 200.3          | 300.8           |

  Scenario Outline: Multiplication operation
    Given a calculator
    When I multiply <first_operand> and <second_operand>
    Then the result should be <expected_result>

    Examples:
      | first_operand | second_operand | expected_result |
      | 5.0           | 3.0            | 15.0            |
      | -2.0          | 4.0            | -8.0            |
      | 0.0           | 100.0          | 0.0             |
      | -3.0          | -7.0           | 21.0            |
      | 2.5           | 4.0            | 10.0            |

  Scenario Outline: Subtraction operation
    Given a calculator
    When I subtract <second_operand> from <first_operand>
    Then the result should be <expected_result>

    Examples:
      | first_operand | second_operand | expected_result |
      | 8.0           | 3.0            | 5.0             |
      | 4.7           | 2.5            | 2.2             |
      | 0.0           | 0.0            | 0.0             |
      | -5.0          | -10.0          | 5.0             |
      | 200.3         | 100.5          | 99.8            |

  Scenario Outline: Division operation
    Given a calculator
    When I divide <first_operand> by <second_operand>
    Then the result should be <expected_result>

    Examples:
      | first_operand | second_operand | expected_result |
      | 15.0          | 3.0            | 5.0             |
      | 10.0          | 2.0            | 5.0             |
      | 0.0           | 5.0            | 0.0             |
      | -8.0          | 2.0            | -4.0            |
      | 7.5           | 2.5            | 3.0             |

  Scenario Outline: Division by zero
    Given a calculator
    When I divide <first_operand> by zero
    Then the operation should fail with error message

    Examples:
      | first_operand |
      | 10.0          |
      | -5.0          |
      | 0.0           |
