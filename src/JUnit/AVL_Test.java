package JUnit;

import Controller.FactoryTree;
import Model.AVLTree;
import Model.TreeStructure;
import Model.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Avl test.
 */
class AVL_Test {
    /**
     * Add and get avl tree test.
     */
    @Test
    void addAndGetAVLTreeTest() {

        FactoryTree factory = new FactoryTree();
        TreeStructure<Word> AVLTest = factory.getInstance("AVLTree");

        AVLTest.add(new Word("study", "estudiar"));
        AVLTest.add(new Word("drinking", "tomando"));
        AVLTest.add(new Word("bird", "ave"));

        Word wordToSearch = AVLTest.get(new Word("study", ""));
        assertEquals("estudiar", wordToSearch.getSpanish());

        wordToSearch = AVLTest.get(new Word("drinking", ""));
        assertEquals("tomando", wordToSearch.getSpanish());

        wordToSearch = AVLTest.get(new Word("bird", ""));
        assertEquals("ave", wordToSearch.getSpanish());
    }
}