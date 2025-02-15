import java.util.Collections;
import java.util.List;

/**
 * Implementation of IntegerSorter that sorts integers in ascending order.
 *
 * <p><strong>SOLID Principles:</strong></p>
 * <ul>
 *   <li><strong>Single Responsibility Principle:</strong>
 *       Responsible solely for sorting integers in ascending order.</li>
 *   <li><strong>Liskov Substitution Principle:</strong>
 *       This class can be used in place of any other integer sorting method without causing problems.</li>
 * </ul>
 */
public class AscendingOrderSorter implements IntegerSorter {

    /**
     * Default Constructor.  Commented to remove Javadoc Warnings.
     */
    public AscendingOrderSorter() {
        // Unused
    }
    /**
     * Sorts the list of integers in ascending order.
     *
     * @param integers The list of integers to sort.
     * @since 1.0.0
     */
    @Override
    public void sort(List<Integer> integers) {
        // Use of Collections.sort method to not reinvent the sorting algorithm
        Collections.sort(integers);
    }
}

