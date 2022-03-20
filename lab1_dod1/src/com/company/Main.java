package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List<String> list2 = new LinkedList<>();

        list2.add("d");
        list2.add("e");
        list2.add("f");
        list2.add("g");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
            iterator.next();
            iterator.remove();
        }

        Iterator<String> iterator2  = list2.iterator();

        while (iterator2.hasNext()) {
            String item = iterator2.next();
            System.out.println(item);
            iterator2.next();
            iterator2.remove();
        }
    }
}
