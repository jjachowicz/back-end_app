package com.company;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = { 2, 3, 2, 6, 5, 7, 6};

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < myArray.length; i++)
            set.add(myArray[i]);

        System.out.print(set);


    }
}
