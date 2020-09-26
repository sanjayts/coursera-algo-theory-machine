package net.sanjayts.coursera.wk1;

import edu.princeton.cs.algs4.StdIn;

public class VerifyInsertionSort {

    public static void insertionSort(String[] wordList) {
        for (int i = 1; i < wordList.length; i++) {
            for (int j = i; j > 0; j--) {
                if (wordList[j - 1].compareTo(wordList[j]) > 0) {
                    String tmp = wordList[j - 1];
                    wordList[j - 1] = wordList[j];
                    wordList[j] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] wordList = StdIn.readAllStrings();
        VerifyCommon.harnessForSort(wordList, VerifyInsertionSort::insertionSort);
    }

}
