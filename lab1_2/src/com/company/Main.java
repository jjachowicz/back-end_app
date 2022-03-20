package com.company;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\justj\\IdeaProjects\\lab1_2\\src\\example.txt");
            System.out.print("Enter some text: ");
            String text = scanner.nextLine();
            byte myArray[] = text.getBytes();
            fileOutput.write(myArray);
            fileOutput.close();
            System.out.println("success...");
        } catch (Exception e){System.out.println(e);}
    }
}
