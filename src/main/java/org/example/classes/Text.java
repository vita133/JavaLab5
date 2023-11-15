package org.example.classes;

import java.util.Arrays;

public class Text {
    public final Sentence[] sentences;

    public Text(String sentences) {
        String[] sentencesArray = sentences.split("(?<=[.!?])");

        this.sentences = new Sentence[sentencesArray.length];

        for (int i = 0; i < sentencesArray.length; i++) {
            this.sentences[i] = new Sentence(sentencesArray[i]);
        }
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                '}';
    }
}
