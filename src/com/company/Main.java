package com.company;


import java.io.FileInputStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\justj\\IdeaProjects\\lab1_1\\src\\example.txt");
        try {
            int i;
            while((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } finally {
            inputStream.close();
        }

        //some comments to compare

    }
}
