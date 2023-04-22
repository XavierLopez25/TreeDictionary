package JUnit;

import Controller.FactoryTree;
import Model.SPT;
import Model.TreeStructure;
import Model.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Spt test.
 */
class SPT_Test {

    /**
     * Add and get splay tree test.
     */
    @Test
    void addAndGetSplayTreeTest() {
        FactoryTree factory = new FactoryTree();
        TreeStructure<Word> SPTTest = factory.getInstance("SplayTree");

        SPTTest.add(new Word("study", "estudiar"));
        SPTTest.add(new Word("drinking", "tomando"));
        SPTTest.add(new Word("bird", "ave"));

        Word wordToSearch = SPTTest.get(new Word("study", ""));
        assertEquals("estudiar", wordToSearch.getSpanish());

        wordToSearch = SPTTest.get(new Word("drinking", ""));
        assertEquals("tomando", wordToSearch.getSpanish());

        wordToSearch = SPTTest.get(new Word("bird", ""));
        assertEquals("ave", wordToSearch.getSpanish());
    }


}
