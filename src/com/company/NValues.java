package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class NValues {

    private Integer[] convertToObject(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i<array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    private int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }

    boolean hasNValues(int[] array, int n) {

        Set<Integer> array1 = new HashSet<>(Arrays.asList(convertToObject(array)));
        int[] second = toInt(array1);

        return second.length == n;
    }
}
