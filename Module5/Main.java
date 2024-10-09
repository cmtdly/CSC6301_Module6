package CSC6301.Module5;
import java.util.Scanner;
import java.util.Stack;

/**
 * The {@code Main} class implements a program that reads integers from user input
 * and stores them into a Stack. The Stack is maintained in sorted order, from
 * smallest to largest, as new integers are inserted.
 *
 * <p>This is a modification of a previous version that used a LinkedList. The
 * implementation now uses a Stack, which operates on a Last-In-First-Out (LIFO)
 * basis.</p>
 *
 * <p>The program terminates when the user inputs -1. After that, the sorted Stack
 * is printed to the console.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 *     Enter integers to store in the Stack. Enter -1 to stop:
 *     5
 *     1
 *     3
 *     7
 *     -1
 *     Sorted Stack: [1, 3, 5, 7]
 * </pre>
 * 
 * @author John Wetzel
 * @version 1.1
 * @since 1.0
 */
public class Main {
    
    /**
     * Default constructor for the Main class.
     * This constructor is intentionally empty. Nothing special is needed here.
     */
    public Main() {
        // Default constructor
    }

    /**
     * The main method that drives the program execution. It reads integers from
     * the user and stores them into a Stack in sorted order. The program continues
     * to read inputs until the user enters -1.
     * 
     * <p>Numbers are inserted into the Stack such that the smallest number is at
     * the bottom and the largest is at the top, following Stack's LIFO behavior.</p>
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>(); /* The Stack that will store numbers in sorted order */
        Scanner input = new Scanner(System.in); /* Scanner for reading user input, reuse from v 1.0*/

        // Prompt the user to input integers, reuse from v 1.0
        System.out.println("Enter integers to store in the Stack. Enter -1 to stop:");
        
        // Loop to continuously accept input until -1 is entered
        while (true) {
            int num = input.nextInt(); // Reading integer input, reuse from v 1.0
            if (num == -1) {
                break; // Stop input when -1 is entered
            }
            
            // Temporary stack to hold elements while sorting during insertion. Reuse from Java Collections Framework.
            Stack<Integer> tempStack = new Stack<>();

            /**
             * Sorting and Insertion Logic:
             * This loop shifts elements from the original stack to the temporary stack
             * until we find the correct position for the new number (num). The insertion
             * point is where the stack's top element is greater than or equal to 'num'.
             */
            while (!numbers.isEmpty() && numbers.peek() < num) {
                tempStack.push(numbers.pop()); // Move smaller elements to the temporary stack
            }

            // Insert the new number into the original stack
            numbers.push(num);

            // Move all the elements back from the temporary stack to the original stack
            while (!tempStack.isEmpty()) {
                numbers.push(tempStack.pop()); // Restore the previous elements in sorted order
            }
        }

        input.close(); // Close the scanner to avoid leakage, reuse from v 1.0

        // Print the final sorted Stack
        System.out.println("Sorted Stack: " + numbers);
    }
}
