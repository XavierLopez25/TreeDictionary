package Model;

import structure5.SplayTree;

import java.util.Comparator;

/**
 * The type Spt.
 *
 * @param <T> the type parameter
 */
public class SPT<T extends Comparable<T>> implements TreeStructure<T> {

    private SplayTree<T> miInternalTree;

    /**
     * Instantiates a new Spt.
     */
    public SPT() {
        miInternalTree = new SplayTree<T>();
    }

    /**
     * Instantiates a new Spt.
     *
     * @param comparador the comparador
     */
    public SPT(Comparator<T> comparador) {
        miInternalTree = new SplayTree<T>(comparador);
    }

    @Override
    public void add(T value) {
        miInternalTree.add(value);

    }

    @Override
    public T get(T key) {
        return miInternalTree.get(key);
    }

    @Override
    public T remove(T key) {
        return miInternalTree.remove(key);
    }

    @Override
    public int count() {
        return miInternalTree.size();
    }

    @Override
    public boolean isEmpty() {
        return miInternalTree.isEmpty();
    }

    /**
     * Get internal tree splay tree.
     *
     * @return the splay tree
     */
    public SplayTree<T> getInternalTree(){
        return miInternalTree;
    }

}
