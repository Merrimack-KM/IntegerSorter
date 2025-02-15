import java.util.Stack;

/**
 * Implementation of IntegerDisplayer that displays the integers to the console.
 *
 * <p><strong>SOLID Principles:</strong></p>
 * <ul>
 *   <li><strong>Single Responsibility Principle:</strong>
 *       Responsible solely for displaying integers to the console.</li>
 *   <li><strong>Dependency Inversion Principle:</strong>
 *       Uses the IntegerDisplayer to enable abstraction.</li>
 * </ul>
 */
public class ConsoleIntegerDisplayer implements IntegerDisplayer {

    /**
     * Default Constructor.
     */
    public ConsoleIntegerDisplayer() {
        // Unused
    }

    /**
     * Displays the list of integers to the console.
     * 
     * @param integers of integers to display.
     * @since 1.1.0
     */
    @Override
    public void display(Stack<Integer> integers) {
        /** Currently, no need for empty check due to MainProgram
         * 
         * If you were looking at the stack, the smallest value is at the bottom.  
         * It is printed in reverse to the user.
        */
        String output = "Stack: Top --> ";
        while (!integers.isEmpty()) { // Pop from the stack until in is empty
            output += "[" + integers.pop() + "] "; //Reusing stack pop methods
        }
        output += "<-- Bottom";

        // Output Sorted Stack from Top to Bottom.
        System.out.println(output);
    }
}