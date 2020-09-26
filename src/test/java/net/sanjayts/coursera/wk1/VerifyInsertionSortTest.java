package net.sanjayts.coursera.wk1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class VerifyInsertionSortTest {

    @ParameterizedTest
    @CsvFileSource(numLinesToSkip = 1, resources = "/sort_test_input.csv")
    void insertionSort(String input, String expected) {
        String[] wordList = input.split(",");
        String[] expectedWordList = expected.split(",");
        VerifyInsertionSort.insertionSort(wordList);
        Assertions.assertArrayEquals(expectedWordList, wordList);
    }

}
