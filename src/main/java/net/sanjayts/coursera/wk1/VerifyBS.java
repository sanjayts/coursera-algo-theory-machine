package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Time taken during tests on my workstation (run from the project base directory)
 *
 * mvnw install
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 20000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifyBS
 * Time taken is 2 seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 40000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifyBS
 * Time taken is 4 seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 80000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifyBS
 * Time taken is 11 seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 1600000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifyBS
 * Time taken is 28 seconds
 *
 */
public class VerifyBS {

    private static int search(String key, String[] wordList, int lo, int hi) {
        if (hi <= lo) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        int cmp = key.compareTo(wordList[mid]);
        if (cmp == 0) {
            return mid;
        } else if (cmp > 0) {
            return search(key, wordList, mid + 1, hi);
        } else {
            return search(key, wordList, lo, mid);
        }
    }

    public static int binarySearch(String key, String[] wordList) {
        return search(key, wordList, 0, wordList.length);
    }

    public static void main(String[] args) {
        String[] wordList = StdIn.readAllStrings();
        Arrays.sort(wordList, Comparator.naturalOrder());
        VerifyCommon.harnessForSearch(wordList, VerifyBS::binarySearch);
    }

}
