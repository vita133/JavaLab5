package org.example.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    public final Object[] elements;

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

    @Override
    public String toString() {
        return "Sentence{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
