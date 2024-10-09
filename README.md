# CSC6301_Module6
Module 6 assignment submission for CSC6301 Software Design &amp; Documentation

# LinkedList Integer Storage Program

## Description

This Java program demonstrates how to read integers from the user and store them in a `LinkedList` provided by the Java Collections Framework. The program ensures that the numbers are inserted in a sorted order, and stops taking input when the user enters `-1`. Finally, the sorted list of numbers is printed out.

### Features:

- Reads integers from the user input.
- Uses `LinkedList` from Java's `java.util` package to store integers.
- Inserts integers in a sorted manner using a `ListIterator` to maintain order.
- Continues accepting integers until the user enters `-1`.
- Outputs the sorted `LinkedList` at the end.

## How it Works

1. **LinkedList Setup**: The program uses a `LinkedList<Integer>` to store the integers. It leverages Java's built-in LinkedList class from the Collections Framework.
2. **User Input**: The user is prompted to enter integers. The input process continues until the user enters `-1`.
3. **Sorted Insertion**: The program uses a `ListIterator` to iterate over the existing elements in the `LinkedList`. It ensures that the new integer is inserted at the correct position to maintain the sorted order of the list.
4. **Exit Condition**: When the user enters `-1`, the input process stops, and the program prints the final sorted `LinkedList`.

## Usage

1. Clone or download the repository.
2. Open the project in your preferred IDE.
3. Run the `Main` class.
4. Enter integers when prompted and terminate input by entering `-1`.
5. View the sorted list of integers printed to the console.

### Example:

```
Enter integers to store in the LinkedList. Enter -1 to stop:
5
2
9
3
-1
Sorted LinkedList: [2, 3, 5, 9]
```

## Code Overview

```java
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * This program reads integers from the user and stores them in a LinkedList.
 * The numbers are inserted in the correct order so that the LinkedList remains sorted.
 * The program stops when the user enters -1.
 * The final sorted LinkedList is then printed.
 * @author John
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(); 
        Scanner input = new Scanner(System.in);

        // Prompt the user to input integers
        System.out.println("Enter integers to store in the LinkedList. Enter -1 to stop:");
        
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break; // Stop when user enters -1
            }

            // Use ListIterator to insert the number in the correct position
            ListIterator<Integer> it = numbers.listIterator();
            boolean added = false;
            
            while (it.hasNext()) {
                if (num < it.next()) {
                    it.previous();  // Move back to correct position
                    it.add(num);    // Insert the number
                    added = true;
                    break;
                }
            }
            
            if (!added) {
                // If number is larger than all current elements, add at the end
                numbers.add(num);
            }
        }

        input.close();
        // Print the final LinkedList
        System.out.println("Sorted LinkedList: " + numbers);
    }
}
```

## Technologies Used

- **Java**: Core language used.
- **Java Collections Framework**: Utilizes the `LinkedList` and `ListIterator` from the `java.util` package for efficient storage and insertion.

## Author

John Wetzel

## License

This project is licensed under the MIT License.
