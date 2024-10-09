# CSC6301_Module6
Module 6 assignment submission for CSC6301 Software Design &amp; Documentation

# LinkedList and Stack Integer Storage Program

## Description

This repository contains two implementations of a program that reads integers from user input and stores them in different data structures provided by the Java Collections Framework:

1. **LinkedList Version**: Stores integers in a sorted `LinkedList`.
2. **Stack Version**: Stores integers in a sorted `Stack`.

Both versions maintain the numbers in sorted order and terminate when the user inputs `-1`. Afterward, the sorted numbers are printed to the console.

### Features:

- **LinkedList Version**: Uses a `LinkedList` to store integers in sorted order.
- **Stack Version**: Uses a `Stack` to store integers while maintaining sorted order.
- Both versions stop taking input when the user enters `-1`.
- The final sorted list or stack is printed at the end.

## Files

1. **LinkedList Version**: `Main.java`
2. **Stack Version**: `Main.java` (located in the `CSC6301.Module5` package)

### LinkedList Version

This version uses a `LinkedList` to store integers, inserting them into the correct position using a `ListIterator` to ensure the list remains sorted.

#### Example Usage:
```
Enter integers to store in the LinkedList. Enter -1 to stop:
5
2
9
3
-1
Sorted LinkedList: [2, 3, 5, 9]
```

### Stack Version

This version modifies the original implementation to use a `Stack`. It maintains sorted order by temporarily moving elements to another stack during insertion, ensuring that the smallest number is at the bottom and the largest at the top (in accordance with the LIFO nature of stacks).

#### Example Usage:
```
Enter integers to store in the Stack. Enter -1 to stop:
5
1
3
7
-1
Sorted Stack: [1, 3, 5, 7]
```

## Usage

1. Clone or download the repository.
2. Open the project in your preferred IDE.
3. Navigate to the corresponding package (e.g., `CSC6301.Module5` for the Stack version).
4. Run the `Main` class.
5. Enter integers when prompted and terminate input by entering `-1`.
6. View the sorted list (LinkedList version) or stack (Stack version) printed to the console.

## Code Overview

### LinkedList Version

```java
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Implementation details provided in the LinkedList version
```

### Stack Version

```java
package CSC6301.Module5;

import java.util.Scanner;
import java.util.Stack;

// Implementation details provided in the Stack version
```

## Technologies Used

- **Java**: Core language used for both versions.
- **Java Collections Framework**: Utilizes `LinkedList`, `ListIterator`, and `Stack` classes for efficient storage and sorting.

## Author

John Wetzel

## License

This project is licensed under the MIT License.
