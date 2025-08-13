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

