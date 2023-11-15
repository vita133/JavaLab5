package org.example.classes;

public class PunctuationMark {
    public final String value;

    public PunctuationMark(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
