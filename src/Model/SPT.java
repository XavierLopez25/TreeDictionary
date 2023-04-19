package Model;

import structure5.SplayTree;

import java.util.Comparator;

public class SPT<T extends Comparable<T>> implements TreeStructure<T> {

    private SplayTree<T> miInternalTree;

    public SPT() {
        miInternalTree = new SplayTree<T>();
    }

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

    public SplayTree<T> getInternalTree(){
        return miInternalTree;
    }

}
