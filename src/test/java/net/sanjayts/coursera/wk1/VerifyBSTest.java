package net.sanjayts.coursera.wk1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerifyBSTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/binary_search.csv", numLinesToSkip = 1)
    void binarySearch_shouldCorrectlySearchKey(Integer expectedIdx, String key, String words) {
        String[] wordList = words.split(",");
        Integer idx = VerifyBS.binarySearch(key, wordList);
        assertEquals(expectedIdx, idx, "Binary search failed for key " + key + " and wordList " + Arrays.toString(wordList));
    }

}
