package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class StringGenerator {

    public static String random(int expectedLength, String alpha) {
        final char[] outChars = new char[expectedLength];
        for (int i = 0; i < expectedLength; i++) {
            outChars[i] = alpha.charAt(StdRandom.uniform(alpha.length()));
        }
        return new String(outChars);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int expectedLength = Integer.parseInt(args[1]);
        String alpha = args[2];
        for (int i = 0; i < n; i++) {
            StdOut.print(random(expectedLength, alpha));
            if (i < n - 1) {
                StdOut.println();
            }
        }
    }

}
