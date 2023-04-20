package Model;

public class Word implements Comparable<Word> {

    private String spanish;
    private String english;

    public Word(String _english, String _spanish) {
        setSpanish(_spanish.toString());
        setEnglish(_english.toString());
    }

    /**
     * @return the spanish
     */
    public String getSpanish() {
        return spanish;
    }



    /**
     * @param spanish the spanish to set
     */
    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }



    /**
     * @return the english
     */
    public String getEnglish() {
        return english;
    }



    /**
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
