import java.util.List;

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
     * Default Constructor. Comments to remove Javadoc warnings.
     */
    public ConsoleIntegerDisplayer() {
        // Unused
    }

    /**
     * Displays the list of integers to the console.
     *
     * @param integers of integers to display.
     * @since 1.0.0
     */
    @Override
    public void display(List<Integer> integers) {
        // Currently, no need for empty check due to MainProgram
        // Iterate over Linked List to create the output string.
        String output = "Head -> ";
        for (int i = 0; i < integers.size(); i++) {
            output += "[" + integers.get(i) + "]";
            if (i < integers.size() - 1) {
                output += " <-> ";
            }
        }
        output += " <- Tail";

        // Output Sorted LinkedList
        System.out.println(output);
    }
}