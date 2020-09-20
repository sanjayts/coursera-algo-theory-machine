package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class WhiteFilter {

    public static void main(String[] args) {
        In in = new In(args[0]);
        String[] whitelist = in.readAllStrings();

        while(!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (search(key, whitelist) != -1) {
                System.out.println(key);
            }
        }
    }

    public static int search(String needle, String[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
