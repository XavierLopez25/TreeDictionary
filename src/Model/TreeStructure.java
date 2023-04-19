package Model;

public interface TreeStructure<T> {

    void add(T value);

    T get(T key);

    T remove(T key);

    int count();

    boolean isEmpty();

}
