package com.softserve.edu.hw10.regex;


import java.util.*;

public class HW1 {

    public static void main(String[] args) {

        System.out.println (" Enter in the console sentence of five words.: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);

        List<String> myList = new ArrayList<String>(Arrays.asList(text.split(" ")));
        System.out.println(myList);

    getLongestWord(myList);
    reverseWord(myList.get(3));


    }

    private static void  getLongestWord (List<String> list){
        String longestWord = list.get(0);
        for(String str: list){
            if(str.length() > longestWord.length()) {
                longestWord = str;
            }
        }
        System.out.println("Longest word is:  "
                +  longestWord + "  ("
                + longestWord.length() + " letters)"  );
    }

    private static void  reverseWord (String str){

        char[] word = str.toCharArray();
        for (int i = word.length-1; i>=0; i-- )
            System.out.print(word[i]);
    }
}
