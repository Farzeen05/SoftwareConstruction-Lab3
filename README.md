# Lab 3 – JUnit Unit Testing

## Objective
This lab introduces unit testing in Java using the JUnit framework within NetBeans IDE.
It covers writing and executing JUnit test cases for five classes: temperature conversion,
bank account operations, string utility (palindrome check), timer utility, and a shopping cart.

## What Was Implemented
- **Temperature Converter:** Celsius/Fahrenheit/Kelvin conversions
- **Bank Account:** deposit/withdraw with exception handling for invalid amounts and overdrafts
- **String Utility:** palindrome checker (case-insensitive, handles null/empty input)
- **Timer Utility:** elapsed-time calculation with boundary and invalid-input handling
- **Shopping Cart:** add/remove/clear items

Each class has a corresponding JUnit 5 test class covering normal, boundary, and exception cases.

## How to Run
1. Clone this repository.
2. Open the project in NetBeans (Maven project).
3. Right-click the project → **Test** to run all JUnit tests.
4. View results in the Test Results panel (green = pass, red = fail).
