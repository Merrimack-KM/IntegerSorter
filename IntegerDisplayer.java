import java.util.List;

/**
 * Interface for displaying integers.
 *
 * <p><strong>SOLID Principle - Interface Segregation:</strong>
 * Provides a specific interface for displaying integers.</p>
 */
public interface IntegerDisplayer {

    /**
     * Displays the list of integers.
     *
     * @param integers The list of integers to display.
     * @since 1.0.0
     */
    void display(List<Integer> integers);
}

