package org.example.classes;

public class Word {
    public final Letter[] letters;

    public Word(String word) {
        Letter[] letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        this.letters = letters;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter.value);
        }
        return stringBuilder.toString();
    }
}
