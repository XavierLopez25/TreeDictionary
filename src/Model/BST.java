package Model;

import structure5.BinarySearchTree;

public class BST<T extends Comparable<T>> implements TreeStructure<T> {

    private BinarySearchTree<T> myInternalTree;

    public BST() {
        myInternalTree = new BinarySearchTree<T>();
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

    public BinarySearchTree<T> getInternalTree(){
        return myInternalTree;
    }
}

