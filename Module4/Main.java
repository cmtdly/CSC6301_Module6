
/* Implement a program
that reads Integers and
store it in a LinkedList
from Java Collections
Framework
 */

 import java.util.LinkedList;
 import java.util.ListIterator;
 import java.util.Scanner;
 
 /**
  * This program reads integers from the user and stores them in a LinkedList.
  * The numbers are inserted in the correct order so that the LinkedList remains sorted.
  * The program stops when the user enters -1.
  * The final sorted LinkedList is then printed.
  * @author John Wetzel
  */
 public class Main {
     public static void main(String[] args) {
         LinkedList<Integer> numbers = new LinkedList<>(); /* Code Reuse! from Java Collections Framework */
         Scanner input = new Scanner(System.in);
 
         // Prompt the user to input integers
         System.out.println("Enter integers to store in the LinkedList. Enter -1 to stop:");
         
         while (true) {
             int num = input.nextInt();
             if (num == -1) {
                 break; // Stop when user enters -1
             }
             
             // Use ListIterator to insert the number in the correct position
             ListIterator<Integer> it = numbers.listIterator(); /* Code Reuse! from Java Collections Framework */
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
 