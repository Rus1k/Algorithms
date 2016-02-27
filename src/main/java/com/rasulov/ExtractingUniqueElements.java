package com.rasulov;
//  Write, efficient code for extracting unique elements from a sorted list of array. e.g.
//  (1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9) -> (1, 3, 5, 9).

import java.util.ArrayList;
import java.util.List;

public class ExtractingUniqueElements {

    public List extractingUniqueElements(int[] array) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                result.add(array[i]);
                continue;
            }

            if (array[i] == array[i - 1]) {
                continue;
            } else {
                result.add(array[i]);
            }
        }
        return result;
    }
}
