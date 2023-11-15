package org.example;

import org.example.classes.Sentence;
import org.example.classes.Letter;
import org.example.classes.Word;
import org.example.classes.Text;
import java.util.HashMap;
import java.util.Map;

/**
 * The {@code SentencesCounter} class provides methods for counting occurrences of specific words
 * in a given text.
 */
public class SentencesCounter {

    /**
     * Counts the occurrences of specified words in the given text.
     * Displays the input text, processes it to count occurrences of each specified word,
     * and prints the results.
     *
     * @param text          the input text
     * @param wordsToCount  an array of words to count occurrences
     * @throws IllegalArgumentException if the input text or wordsToCount is null
     */
    public static void countSentencesContainsWords(String text, String[] wordsToCount) {
        if (text == null || wordsToCount == null) {
            throw new IllegalArgumentException("Вхідні дані не можуть бути null.");
        }

        Map<Word, Integer> wordCountMap = new HashMap<>();
        Text textObject = new Text(text);

        System.out.printf("Вхідний текст:\n%s\n", textObject);

        for (String word : wordsToCount) {
            if (word == null || word.trim().isEmpty()) {
                throw new IllegalArgumentException("Слово не може бути null або пустим.");
            }
            wordCountMap.put(new Word(word), 0);
        }

        for (Sentence sentence : textObject.sentences) {
            for (Word word : wordCountMap.keySet()) {
                for (Object element : sentence.elements) {
                    if (element instanceof Word) {
                        Word sentenceWord = (Word) element;
                        if (areWordsEqual(sentenceWord, word)) {
                            int wordCount = wordCountMap.get(word);
                            wordCountMap.put(word, wordCount + 1);
                        }
                    }
                }
            }
        }

        printResults(wordCountMap);
    }

    /**
     * Compares two words for equality, ignoring case.
     *
     * @param word1 the first word
     * @param word2 the second word
     * @return true if the words are equal, ignoring case; false otherwise
     */
    private static boolean areWordsEqual(Word word1, Word word2) {
        Letter[] letters1 = word1.letters;
        Letter[] letters2 = word2.letters;

        if (letters1.length != letters2.length) {
            return false;
        }

        for (int i = 0; i < letters1.length; i++) {
            if (Character.toLowerCase(letters1[i].value) != Character.toLowerCase(letters2[i].value)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Prints the results of word occurrences in sentences.
     *
     * @param wordCountMap a map containing words and their occurrences
     */
    private static void printResults(Map<Word, Integer> wordCountMap) {
        for (Map.Entry<Word, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' міститься в " + entry.getValue() + " реченнях.");
        }
    }
}
