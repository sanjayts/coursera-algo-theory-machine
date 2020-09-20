package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.concurrent.TimeUnit;

public class VerifyCommon {

    public static void testHarness(String[] wordList, SearchInterface fn) {
        int wordCount = wordList.length;
        long start = System.nanoTime();
        for (int i = 0; i < wordCount * 10; i++) {
            String randomKey = wordList[StdRandom.uniform(wordCount)];
            // Never true since we are picking they key from the word list
            if (fn.search(randomKey, wordList) == -1) {
                StdOut.println(randomKey);
            }
        }
        long timeInNanos = System.nanoTime() - start;
        StdOut.println("Time taken is " + TimeUnit.NANOSECONDS.toSeconds(timeInNanos) + " seconds");
    }

}
