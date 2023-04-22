package Model;

/**
 * The type Word.
 */
public class Word implements Comparable<Word> {

    private String spanish;
    private String english;

    /**
     * Instantiates a new Word.
     *
     * @param _english the english
     * @param _spanish the spanish
     */
    public Word(String _english, String _spanish) {
        setSpanish(_spanish.toString());
        setEnglish(_english.toString());
    }

    /**
     * Gets spanish.
     *
     * @return the spanish
     */
    public String getSpanish() {
        return spanish;
    }


    /**
     * Sets spanish.
     *
     * @param spanish the spanish to set
     */
    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }


    /**
     * Gets english.
     *
     * @return the english
     */
    public String getEnglish() {
        return english;
    }


    /**
     * Sets english.
     *
     * @param english the english to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }



    @Override
    public int compareTo(Word palabra) {
        return english.compareTo(palabra.getEnglish());
    }
}
