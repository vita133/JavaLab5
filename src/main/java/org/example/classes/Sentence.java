package org.example.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The {@code Sentence} class represents a sentence in a text.
 * Each instance of this class holds an array of elements, where each element can be a word or a punctuation mark.
 *
 */
public class Sentence {
    /**
     * The array of elements in the sentence, where each element can be a word or a punctuation mark.
     */
    public final Object[] elements;

    /**
     * Constructs a {@code Sentence} object with the specified sentence.
     * Parses the sentence into an array of words and punctuation marks.
     *
     * @param sentence the string representing the sentence
     */
    public Sentence(String sentence) {
        String[] wordsAndPunctuation = sentence.split("\\b");

        List<Object> elementsList = new ArrayList<>();

        for (String wordOrPunctuation : wordsAndPunctuation) {
            if (!wordOrPunctuation.trim().isEmpty()) {
                if (wordOrPunctuation.matches("[.,;!?]+")) {
                    elementsList.add(new PunctuationMark(wordOrPunctuation));
                } else {
                    elementsList.add(new Word(wordOrPunctuation));
                }
            }
        }

        elements = elementsList.toArray();
    }

    /**
     * Returns a string representation of the sentence.
     *
     * @return a string representation of the sentence
     */
    @Override
    public String toString() {
        return "Sentence{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
