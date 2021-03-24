package de.mw.devschool.wordcount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class WordCounter {
    private final Set<String> stopWords;

    public WordCounter() {
        this(new HashSet<>());
    }

    public WordCounter(Set<String> stopWords) {
        this.stopWords = stopWords;
    }


    long countWords(String text) {
        return Arrays.stream(text.split(" "))
                .filter(Predicate.not(stopWords::contains))
                .count();
    }
}
