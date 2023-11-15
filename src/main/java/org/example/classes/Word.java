package org.example.classes;

/**
 * The {@code Word} class represents a sequence of letters forming a word.
 * Each instance of this class holds an array of {@link Letter} objects,
 * representing the individual letters in the word.
 */
public class Word {
    /**
     * An array of {@code Letter} objects representing the letters in the word.
     */
    public final Letter[] letters;

    /**
     * Constructs a {@code Word} object with the specified string.
     *
     * @param word the string representing the word
     */
    public Word(String word) {
        Letter[] letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        this.letters = letters;
    }

    /**
     * Returns a string representation of the word by concatenating its letters.
     *
     * @return a string representation of the word
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter.value);
        }
        return stringBuilder.toString();
    }
}
