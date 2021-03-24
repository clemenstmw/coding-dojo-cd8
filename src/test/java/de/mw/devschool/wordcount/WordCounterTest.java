package de.mw.devschool.wordcount;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void testAppCountsWordsCorrectly() {
        // GIVEN
        WordCounter underTest = new WordCounter();

        // WHEN
        final long count = underTest.countWords("This String has five words");

        // THEN
        assertEquals(count, 5);
    }

    @Test
    public void testAppCountsWordsCorrectlyWithStopWords() {
        // GIVEN
        Set<String> stopWords = Set.of("a");
        WordCounter underTest = new WordCounter(stopWords);

        // WHEN
        final long count = underTest.countWords("This is a story");

        // THEN
        assertEquals(count, 3);
    }
}
