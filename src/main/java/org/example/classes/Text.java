package org.example.classes;

import java.util.Arrays;

/**
 * The {@code Text} class represents a collection of sentences in a text.
 * Each instance of this class holds an array of sentences.
 */
public class Text {
    /**
     * The array of sentences in the text.
     */
    public final Sentence[] sentences;

    /**
     * Constructs a {@code Text} object with the specified string representing the sentences.
     * Parses the input string into an array of sentences.
     *
     * @param sentences the string representing the sentences
     */
    public Text(String sentences) {
        String[] sentencesArray = sentences.split("(?<=[.!?])");

        this.sentences = new Sentence[sentencesArray.length];

        for (int i = 0; i < sentencesArray.length; i++) {
            this.sentences[i] = new Sentence(sentencesArray[i]);
        }
    }

    /**
     * Returns a string representation of the text.
     *
     * @return a string representation of the text
     */
    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                '}';
    }
}
