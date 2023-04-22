package Model;

import java.util.Comparator;

/**
 * The type Word comparator.
 *
 * @param <T> the type parameter
 */
public class WordComparator<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Word pal1 = (Word)o1;
        Word pal2 = (Word)o2;
        return pal1.getEnglish().compareTo(pal2.getEnglish());
    }

}