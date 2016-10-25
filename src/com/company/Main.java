package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Declaring and initializing an array.

        "int [] a ..." AND "int a [] ..." are the same.
        Can apply to other data types.

        First method:

        int a [] = new int[400];
        a[0] = 97;
        a[1] = 62;
        a[2] = 85;

        Second method:

        int a[] = {97, 62, 85};
        ^ This is the most popular method.

        Third method:

        int a[] = new int[] {97, 62, 85};
         */



        /*
        Parallel Arrays

        "It operates within [one another]."
         */

        /*
        In numeric arrays, indices of the array are automatically initialized to 0.
        Strings aren't the same. They produce an error, NullPointerException.
         */

        int grades[] = {100, 90, 94, 93, 89, 96};
        int t = 4;
        System.out.println(grades[2]); //Prints out 94
        System.out.println(grades[t]); //Prints out 89

    }
}
