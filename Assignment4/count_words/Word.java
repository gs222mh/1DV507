package GS222MH_assign4.count_words;

public class Word implements Comparable<Word> {
    private String word;

    public Word(String str) {
        this.word = str;
    }

    public String toString() {
        return word;
    }

    public int hashCode() {
        int value = 0;
        for (int i = 0; i < word.length(); i++) {
            value = value + word.charAt(i);
        }
        return value;
    }

    public boolean equals(Object other) {
        String word2 = other.toString().toLowerCase();
        String word1 = word.toLowerCase();
        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Word w) {
        String word2 = w.toString().toLowerCase();
        String word1 = word.toLowerCase();
        if (word1.compareTo(word2) == 0)
            return 0;
        else if (word1.compareTo(word2) > 0)
            return 1;
        else
            return -1;
    }
}
