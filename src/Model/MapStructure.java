package Model;

/**
 * Interfaz MapStructure
 * @param <K> Valor de la llave.
 * @param <V> Valor.
 */
public interface MapStructure <K,V> {
    /**
     * Método Add.
     * @param key Llave a agregar.
     * @param value Valor a agregar.
     */
    void add(K key, V value);

    /**
     * Método Get
     * @param key Llave con valor a obtener.
     * @return Llave y valor.
     */
    V get(K key);

    /**
     * Método Remove.
     * @param key Llave con valor a obtener.
     */
    void remove(K key);

    /**
     * Método Count.
     * @return Cantidad de elementos en HashMap.
     */
    int count();

    /**
     * Método IsEmpty
     * @return True si está vacío y False si no está vacío (HashMap).
     */
    boolean isEmpty();
}
