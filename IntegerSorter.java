import java.util.List;

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
     * @param integers List of integers to sort.
     * @since 1.0.0
     */
    void sort(List<Integer> integers);
}

