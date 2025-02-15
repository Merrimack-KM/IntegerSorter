import java.util.List;

/**
 * Running Commands: 
 * <code>javac *.java</code>
 * <code>java MainProgram</code>
 * <i>Input a single line of integers or anything you want separated by a space on the CLI</i>
 * <code>javadoc -d doc *.java</code>
 * 
 * Main application class that orchestrates reading, sorting, and displaying integers.
 *
 * <p><strong>SOLID Principles:</strong></p>
 * <ul>
 *   <li><strong>Dependency Inversion Principle:</strong>
 *       Depends on abstractions (IntegerInput, IntegerSorter, IntegerDisplayer) rather than concrete implementations,
 *       allowing for flexibility and ease of extension.</li>
 *   <li><strong>Single Responsibility Principle:</strong>
 *       Coordinates the high-level workflow of the application without getting involved in the details of input,
 *       sorting, or display.</li>
 * </ul>
 * 
 * <p><strong> Explicit Elaboration of Code Reuse:</strong></p>
 * <ul>
 *   <li>Utilization of built-in Data Structures such as List and LinkedList.</li>
 *   <li>Utilization of built-in methods such as Collection.sort() for the LinkedList sorting algorithm.</li>
 *   <li>Other reiterations available in the code base.</li>
 * </ul>
 * 
 * @author Kevin Maguire
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */
public class MainProgram {
    /**
     * Default constructor.  Documentation is a requirement of Javadoc. 
     */
    public MainProgram(){
        // Unused
    }

    /**
     * Executes the program.
     * @param args None.
     * @since 1.0.0
     */
    public static void main(String[] args) {
        // Create instances of the input, sorter, and displayer Class Objects.
        IntegerInput userInput = new ConsoleIntegerInput();
        IntegerSorter listSorter = new AscendingOrderSorter();
        IntegerDisplayer displayOutput = new ConsoleIntegerDisplayer();

        // Read integers into a List
        List<Integer> integers = userInput.readIntegers();

        // Check if integers were entered
        if (integers.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        // Sort the Linked List Object
        listSorter.sort(integers);

        // Display the Linked List Object in a CLI-friendly format
        displayOutput.display(integers);
    }
}