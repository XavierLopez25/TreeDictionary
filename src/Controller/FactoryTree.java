package Controller;

import Model.*;


/**
 * The type Factory tree.
 */
public class FactoryTree {

    private TreeStructure<Word> resultado;

    private WordComparator<Word> comparator = new WordComparator<Word>();

    /**
     * Get instance tree structure.
     *
     * @param type the type
     * @return tree structure
     */
    public TreeStructure<Word> getInstance(String type){

        switch (type) {
            case "RBT":
                resultado = new RBT<Word>();
                break;

            case "SplayTree":
                resultado = new SPT<Word>();
                break;

            case "AVLTree":
                resultado = new AVLTree<Word>();
                break;

            default:
                break;
        }
        return resultado;

    }
}
