package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Time taken during tests on my workstation (run from the project base directory)
 *
 * mvnw install
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 10000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifySS
 * Time taken is 3 seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 20000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifySS
 * Time taken is 15 seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 40000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifySS
 * Time taken is 60  seconds
 *
 * java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.StringGenerator 80000 10 abcdefghijklmnopqrstuvwxyz | java -cp target\coursera-cs-algo-1.0-SNAPSHOT-jar-with-dependencies.jar net.sanjayts.coursera.wk1.VerifySS
 * Time taken is 249 seconds
 *
 */
public class VerifySS {

    public static int search(String key, String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        VerifyCommon.testHarness(StdIn.readAllStrings(), VerifySS::search);
    }

}
