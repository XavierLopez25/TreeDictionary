package JUnit;

import Controller.FactoryTree;
import Model.RBT;
import Model.TreeStructure;
import Model.Word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Rbt test.
 */
class RBT_Test {

    /**
     * Add and get rb tree test.
     */
    @Test
    void addAndGetRBTreeTest() {
        FactoryTree factory = new FactoryTree();
        TreeStructure<Word> RBTTest = factory.getInstance("RBT");

        RBTTest.add(new Word("study", "estudiar"));
        RBTTest.add(new Word("drinking", "tomando"));
        RBTTest.add(new Word("bird", "ave"));

        Word wordToSearch = RBTTest.get(new Word("study", ""));
        assertEquals("estudiar", wordToSearch.getSpanish());

        wordToSearch = RBTTest.get(new Word("drinking", ""));
        assertEquals("tomando", wordToSearch.getSpanish());

        wordToSearch = RBTTest.get(new Word("bird", ""));
        assertEquals("ave", wordToSearch.getSpanish());
    }

}
