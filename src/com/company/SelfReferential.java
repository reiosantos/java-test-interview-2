package com.company;

class SelfReferential {

    private int findOccurrence(int[] array, int n) {
        int count = 0;
        for (int i : array) {
            if (i == n) count++;
        }
        return count;
    }

    int isSelfReferential(int[] array) {

        for (int i=0; i < array.length; i++){
            if (array[i] == findOccurrence(array, i)) {
                continue;
            }
            return 0;
        }
        return 1;
    }
}
