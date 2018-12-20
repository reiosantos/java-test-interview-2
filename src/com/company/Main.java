package com.company;

public class Main {

    public static void main(String[] args) {
        NValues nValues = new NValues();
        int[] array = {1, 2, 2, 1};
        int n = 2;
        System.out.println("hasNValues: " + nValues.hasNValues(array, n));

        EquivalentArrays equivalentArrays = new EquivalentArrays();
        int[] array1 = {};
        int[] array2 = {};
        System.out.println("Equal Arrays: " + equivalentArrays.equivalentArrays(array1, array2));

        SelfReferential selfReferential = new SelfReferential();
        int[] array3 = {2, 0, 0};
        System.out.println("Referential Arrays: " + selfReferential.isSelfReferential(array3));
    }
}
