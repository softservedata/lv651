package HW10.HomeWork;

import java.util.*;

public class HW1 {
    /*
    Enter in the console sentence of five words.
        - display the longest word in the sentence
        - determine the number of its letters
        - bring the second word in reverse order
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please? enter the sentence of five words:");
        //String s = scanner.nextLine();
        String s = "the  longest word    inn the  sentence";
        s = s.replaceAll("\\s{2,}", " ");
        List<String> sentence = Arrays.asList(s.split(" "));
        System.out.println(sentence);
        System.out.println("1. The longest word is :" + getLongestWord(sentence));
        System.out.println("2. The number of letters :" + getNumberOfLetters(sentence));
        System.out.println("3. Reversed second word :" + getReverseWord(sentence.get(1)));
    }

    private static String getReverseWord(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    private static int getNumberOfLetters(List<String> sentence) {
        Set<Character> allLetters = new HashSet<>();                //Set all letters of sentence
        for (String s : sentence) {
            char[] word = s.toLowerCase().toCharArray();
            Set<Character> wordSet = new HashSet<Character>();      //set letters of word
            for (int i = 0; i < word.length; i++) {
                wordSet.add(word[i]);
            }
            allLetters.addAll(wordSet);
        }
        System.out.println("Set of letters:"+ allLetters);
        return allLetters.size();
    }

    private static String getLongestWord(List<String> sentence) {
        int i = 0;
        int maxLen = 0, curLen = 0;
        int longestWordIndex = 0;
        for (String s : sentence) {
            curLen = s.length();
            if (curLen > maxLen) {
                maxLen = curLen;
                longestWordIndex = i;
            }
            i++;
        }
        return sentence.get(longestWordIndex);
    }
}
