package com.maxgenericsproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MaxTestInput<E extends Comparable<E>> {
    E[] array;

    public MaxTestInput(E[] array) {
        this.array = array;
    }

    public E testMaximum() {
        return MaximumUsingGenerics.findMax(array);
    }
}

public class MaximumUsingGenerics {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Program");

        //Max of three Integers
        Integer[] intArray = new Integer[]{13, 65, 47, 66};
        MaxTestInput<Integer> intInput = new MaxTestInput<>(intArray);
        System.out.println("Maximum integer " + Arrays.toString(intArray) + ": " + intInput.testMaximum());

        //Max of three Floats
        Float[] floatArray = new Float[]{6.5f, 4.3f, 8.8f, 5.5f};
        MaxTestInput<Float> floatInput = new MaxTestInput<>(floatArray);
        System.out.println("Maximum float of " + Arrays.toString(floatArray) + ": " + floatInput.testMaximum());

        //Max of three Strings
        String[] stringArray = new String[]{"Chennai", "Kolkata", "Delhi", "Tamil Nadu"};
        MaxTestInput<String> stringInput = new MaxTestInput<>(stringArray);
        System.out.println("Maximum string of " + Arrays.toString(stringArray) + ": " + stringInput.testMaximum());
    }

    protected static <E extends Comparable<E>> E findMax(E[] array) {
        List<E> sortedInputList = Arrays.stream(array).sorted().collect(Collectors.toList());
        return sortedInputList.get(sortedInputList.size()-1);
    }
}
