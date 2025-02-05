// Name : Daniel John Jacob | PRN : 23070126027 | Batch : 2023-27, AIML A2

// UserInput.java
import java.util.Scanner;

// Handles all user input-related functionality.
public class UserInput {
    // Initializes a Scanner object to read input from the console.
    private Scanner scanner = new Scanner(System.in);

    // Prompts the user to select an operation from the menu and returns their choice.
    public int getOperationChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Prompts the user to enter two numbers and returns them as an array.
    public double[] getTwoNumbers() {
        double[] numbers = new double[2];
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    // Prompts the user to enter a single number and returns it.
    public int getSingleNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Prompts the user to enter an array of numbers and returns it.
    public double[] getArrayInput() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}


//https://github.com/MrLoSt1805/Assignment_1_CalculatorAndFibonacci.git
