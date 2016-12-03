package com.rasulov.task54;

// Given an array of length N containing integers between 1 and N, determine if it contains any duplicates.

public class AlgorithmWithoutSet {
    public static boolean checkingForDuplicate(int[] array) {

        boolean result = validation(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean checkingForDuplicateBetterPerformance(int[] array) {
        boolean result = validation(array);
        for (int i = 0; i < array.length; i++) {

            if (array[Math.abs(array[i]) - 1] < 0) {
                return true;
            }
            array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];
        }

        return result;
    }

    private static boolean validation(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > array.length) {
                throw new ValueBoundException();
            } else if (array[i] < 1) {
                throw new NegativeMeaningException();
            }
        }
        return result;
    }
}