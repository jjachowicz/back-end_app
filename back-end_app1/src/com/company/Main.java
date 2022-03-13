package com.company;
//import java.lang.*;

public class Main {

    public static void main(String[] args) {

        int[] array = {4, 5, 7, 11, 15, 15, 21, 40, 45};
        int index = searchIndex(array, 11); // we want to find index for 11
        System.out.println(index);
    }

    public static int searchIndex(int[] array, int value)
    {
        int index = 0;
        int limit = array.length - 1;

        while (index <= limit)
        {
            int point = (int)Math.ceil((index + limit) / 2.0);
            int entry = array[point];

            if (value > entry)
            {
                index = point + 1;
            }
            if (value < entry)
            {
                limit = point - 1;
            }
            return point; // value == entry
        }

        return -1;
    }

}
