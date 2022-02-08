package com.software.edu.hw15;
import java.io.*;

public class Debug {
    public static void main(String[] args) {
        
        int countCharacters = 0;
        String testWord = "";
        String character = "";
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");

        try{
        testWord = br.readLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//        System.out.println("Input character");
//
//        try {
//        character = br.readLine();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        for (int i = 0; i < testWord.length(); i++) {
            character = testWord.substring(1, 1);
            if (character.equals(character)) countCharacters++;
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word:  " + testWord);
    }
}
