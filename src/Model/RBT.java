package Model;

import structure5.RedBlackSearchTree;

/**
 * The type Rbt.
 *
 * @param <T> the type parameter
 */
public class RBT<T extends Comparable<T>> implements TreeStructure<T> {

    private RedBlackSearchTree<T> myInternalTree;

    /**
     * Instantiates a new Rbt.
     */
    public RBT() {
        myInternalTree = new RedBlackSearchTree<T>();
    }

    @Override
    public void add(T value) {
        myInternalTree.add(value);
    }

    @Override
    public T get(T key) {
        return myInternalTree.get(key);
    }

    @Override
    public T remove(T key) {
        return myInternalTree.remove(key);
    }

    @Override
    public int count() {
        return myInternalTree.size();
    }

    @Override
    public boolean isEmpty() {
        return myInternalTree.isEmpty();
    }

    /**
     * Get internal tree red black search tree.
     *
     * @return the red black search tree
     */
    public RedBlackSearchTree<T> getInternalTree(){
        return myInternalTree;
    }
}
