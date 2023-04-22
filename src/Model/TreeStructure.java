package Model;

/**
 * The interface Tree structure.
 *
 * @param <T> the type parameter
 */
public interface TreeStructure<T> {

    /**
     * Add.
     *
     * @param value the value
     */
    void add(T value);

    /**
     * Get t.
     *
     * @param key the key
     * @return the t
     */
    T get(T key);

    /**
     * Remove t.
     *
     * @param key the key
     * @return the t
     */
    T remove(T key);

    /**
     * Count int.
     *
     * @return the int
     */
    int count();

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean isEmpty();

}
