import java.util.Stack;

/**
 * Interface for inputting integers.
 *
 * <p><strong>SOLID Principle - Interface Segregation:</strong>
 * This interface is specific to integer inputs.</p>
 */
public interface IntegerInput {

    /**
     * Reads integers from input.
     * 
     * @return List of integers.
     * @since 1.1.0
     */
    Stack<Integer> readIntegers();
}