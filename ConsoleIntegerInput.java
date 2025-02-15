import java.util.Scanner;
import java.util.Stack;

/**
 * Implementation of IntegerInput that reads integers from the console.
 *
 * <p><strong>SOLID Principles:</strong></p>
 * <ul>
 *   <li><strong>Single Responsibility Principle:</strong>
 *       This class is responsible solely for reading integers from the console.</li>
 *   <li><strong>Dependency Inversion Principle:</strong>
 *       Depends on the abstraction IntegerInput rather than a concrete class.</li>
 * </ul>
 */
public class ConsoleIntegerInput implements IntegerInput {

    /** 
     * Default Constructor.
     */
    public ConsoleIntegerInput(){
        // Unused
    }

    /**
     * Reads integers from the console as a single line with spaces.
     *
     * @return A stack of integers entered by the user.
     * @since 1.1.0
     * 
     */
    @Override
    public Stack<Integer> readIntegers() {
        // Uses the Stack Util to not reinvent or reimplement the Stack Data Structure
        Stack<Integer> integers = new Stack<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all integers on one line separated by spaces:\n>> ");
        String inputLine = scanner.nextLine().trim(); // Removes new line without reimplementation
        String[] inputIntegers = inputLine.split("\\s+"); // Splits based up space separator

        // 
        for (String inputInteger : inputIntegers) {
            if (isValidInteger(inputInteger)) {
                integers.push(Integer.parseInt(inputInteger)); // Using built-in .push() method of Stack class.
            } else {
                System.out.println("'" + inputInteger + "' is not an integer... Ignoring.");
            }
        }

        scanner.close();
        return integers;
    }

    /**
     * Validates if the input string is a valid integer. 
     * A utility class for the data validation may be appropriate in the future.
     * 
     * @param input The input string.
     * @return True if the input string can be converted to an integer.
     * @throws NumberFormatException if the input is invalid.
     * @since 1.0.0
     */
    private boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}