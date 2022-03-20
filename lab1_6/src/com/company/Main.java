package com.company;

public class Main {

    public static void main(String[] args) {
	    var text = "line 1pline 2";
        var lines = text.split("p");
        for ( String line : lines) {
            for (int i = 1; i< lines.length; i++) {
                System.out.println(i + " " + line);
            }
        }
    }
}
