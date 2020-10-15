package com.maxgenericsproblem;

import java.util.Arrays;

public class MaximumUsingGenerics {
    public static void main(String[] args) {
        MaximumUsingGenerics maximumUsingGenerics = new MaximumUsingGenerics();
        System.out.println("Welcome to Test Maximum Program");

        //Max of three Integers
        Integer[] intArray = new Integer[]{13, 65, 47};
        System.out.println("Maximum interger " + Arrays.toString(intArray) + ": " + maximumUsingGenerics.findMax(intArray));

        //Max of three Floats
        Float[] floatArray = new Float[]{6.5f, 4.3f, 8.8f};
        System.out.println("Maximum float of " + Arrays.toString(floatArray) + ": " + maximumUsingGenerics.findMax(floatArray));

        //Max of three Strings
        String[] stringArray = new String[]{"Chennai", "Kolkata", "Delhi"};
        System.out.println("Maximum string of " + Arrays.toString(stringArray) +": " + maximumUsingGenerics.findMax(stringArray));
    }

    protected <E extends Comparable> E findMax(E[] array) {
        E max = array[0].compareTo(array[1]) > 0 ? array[0] : array[1];
        return max.compareTo(array[2]) > 0 ? max : array[2];
    }
}
