// Name : Daniel John Jacob | PRN : 23070126027 | Batch : 2023-27, AIML A2

// Calculator.java
// Handles all calculation-related functionality.
public class Calculator {
    // Adds two numbers and returns the result.
    public double add(double a, double b) {
        return a + b;
    }

    // Subtracts the second number from the first and returns the result.
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers and returns the result.
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides the first number by the second, with a check to prevent division by zero.
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Returns the nth Fibonacci number
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a non-negative number.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, next;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return b; // Return the nth Fibonacci number
    }

    // Prints the Fibonacci series up to the given number (inclusive)
    public void printFibonacciSeries(int n) {
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        while (a <= n) {
            System.out.print(a + " "); // Print the current Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // Calculates the sum of all elements in the array.
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Calculates the mean of the elements in the array.
    public double meanArray(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return sumArray(array) / array.length;
    }

    // Calculates the variance of the elements in the array.
    public double varianceArray(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double mean = meanArray(array);
        double variance = 0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    // Calculates the standard deviation of the elements in the array.
    public double stdDevArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}
