// Name : saleem aminu saeed  | PRN : 23070126163 | Batch : 2023-27, AIML A2

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creates an instance of the UserInput class to handle user inputs.
        UserInput userInput = new UserInput();
        // Creates an instance of the Calculator class to perform operations.
        Calculator calculator = new Calculator();

        // Starts an infinite loop to repeatedly show the menu and process user inputs until exit.
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Fibonacci");
            System.out.println("6. Sum of Array");
            System.out.println("7. Mean of Array");
            System.out.println("8. Variance of Array");
            System.out.println("9. Standard Deviation of Array");
            System.out.println("10. Exit");

            // Gets the user's choice of operation from the menu.
            int choice = userInput.getOperationChoice();

            // Uses a switch-case to execute the chosen operation.
            switch (choice) {
                case 1: // Addition
                    // Prompts the user to enter two numbers and performs addition.
                    double[] addNumbers = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(addNumbers[0], addNumbers[1]));
                    break;
                case 2: // Subtraction
                    // Prompts the user to enter two numbers and performs subtraction.
                    double[] subNumbers = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(subNumbers[0], subNumbers[1]));
                    break;
                case 3: // Multiplication
                    // Prompts the user to enter two numbers and performs multiplication.
                    double[] mulNumbers = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(mulNumbers[0], mulNumbers[1]));
                    break;
                case 4: // Division
                    // Prompts the user to enter two numbers and performs division.
                    double[] divNumbers = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.divide(divNumbers[0], divNumbers[1]));
                    break;
                case 5: // Fibonacci
                    // Prompts the user to enter a number and calculates its Fibonacci value.
                    int n = userInput.getSingleNumber();
                    System.out.println("Fibonacci number: " + calculator.fibonacci(n));
                    break;
                case 6: // Sum of Array
                    // Prompts the user to enter an array and calculates its sum.
                    double[] array = userInput.getArrayInput();
                    System.out.println("Sum: " + calculator.sumArray(array));
                    break;
                case 7: // Mean of Array
                    // Prompts the user to enter an array and calculates its mean.
                    array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.meanArray(array));
                    break;
                case 8: // Variance of Array
                    // Prompts the user to enter an array and calculates its variance.
                    array = userInput.getArrayInput();
                    System.out.println("Variance: " + calculator.varianceArray(array));
                    break;
                case 9: // Standard Deviation of Array
                    // Prompts the user to enter an array and calculates its standard deviation.
                    array = userInput.getArrayInput();
                    System.out.println("Standard Deviation: " + calculator.stdDevArray(array));
                    break;
                case 10: // Exit
                    // Exits the program when the user chooses this option.
                    System.out.println("Exiting...");
                    return;
                default:
                    // Handles invalid menu choices.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
