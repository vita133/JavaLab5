package org.example.classes;

/**
 * The {@code PunctuationMark} class represents a punctuation mark.
 * Each instance of this class holds a string representing the value of the punctuation mark.
 */
public class PunctuationMark {
    /**
     * The string value of the punctuation mark.
     */
    public final String value;

    /**
     * Constructs a {@code PunctuationMark} object with the specified value.
     *
     * @param value the string representing the punctuation mark
     */
    public PunctuationMark(String value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the punctuation mark.
     *
     * @return a string representation of the punctuation mark
     */
    @Override
    public String toString() {
        return value;
    }
}
