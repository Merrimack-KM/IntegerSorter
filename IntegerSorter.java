import java.util.Stack;

/**
 * Interface for sorting integers.
 *
 * <p><strong>SOLID Principle - Open/Closed Principle:</strong>
 * This interface allows for extending sorting without modifying the current code.</p>
 */
public interface IntegerSorter {

    /**
     * Sorts the input list of integers.
     * 
     * @param integers Stack of integers to sort.
     * @since 1.1.0
     */
    void sort(Stack<Integer> integers);
}