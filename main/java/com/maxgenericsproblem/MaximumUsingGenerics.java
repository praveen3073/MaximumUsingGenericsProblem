package com.maxgenericsproblem;

import java.util.Scanner;

public class MaximumUsingGenerics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Test Maximum Program");

        //Max of three Integers
        System.out.println("Input 3 integers: ");
        Integer[] intArray = new Integer[3];
        for (int i = 0; i < 3; i++) {
            intArray[i] = in.nextInt();
        }
        System.out.println("Maximum interger: " + findMaxInteger(intArray));

        //Max of three Floats
        System.out.println("Input 3 floats: ");
        Float[] floatArray = new Float[3];
        for (int i = 0; i < 3; i++) {
            floatArray[i] = in.nextFloat();
        }
        System.out.println("Maximum float: " + findMaxFloat(floatArray));

        //Max of three Strings
        System.out.println("Input 3 strings: ");
        String[] stringArray = new String[3];
        for (int i = 0; i < 3; i++) {
            stringArray[i] = in.nextLine();
        }
        System.out.println("Maximum string: " + findMaxString(stringArray));
    }

    protected static Integer findMaxInteger(Integer[] intArray) {
        Integer max = intArray[0].compareTo(intArray[1]) > 0 ? intArray[0] : intArray[1];
        return max.compareTo(intArray[2]) > 0 ? max : intArray[2];
    }

    protected static Float findMaxFloat(Float[] floatArray) {
        Float max = floatArray[0].compareTo(floatArray[1]) > 0 ? floatArray[0] : floatArray[1];
        return max.compareTo(floatArray[2]) > 0 ? max : floatArray[2];
    }

    protected static String findMaxString(String[] stringArray) {
        String max = stringArray[0].compareTo(stringArray[1]) > 0 ? stringArray[0] : stringArray[1];
        return max.compareTo(stringArray[2]) > 0 ? max : stringArray[2];
    }
}
