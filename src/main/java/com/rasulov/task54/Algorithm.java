package com.rasulov.task54;

import java.util.HashSet;
import java.util.Set;

// Given an array of length N containing integers between 1 and N, determine if it contains any duplicates.

public class Algorithm {

    public static boolean checkingForDuplicate(int[] array) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array.length) {
                throw new ValueBoundException();
            } else if (array[i] < 1) {
                throw new NegativeMeaningException();
            }
            set.add(array[i]);
            if (set.size() < i + 1) {
                break;
            }
        }
        if (set.size() < array.length) {
            System.out.println("have duplicate");
            return true;
        } else {
            System.out.println("haven't duplicate");
            return false;
        }
    }
}