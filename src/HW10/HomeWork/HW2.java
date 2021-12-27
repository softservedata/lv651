package HW10.HomeWork;

public class HW2 {
    /*
    Enter a sentence that contains the words between more than one space.
    Convert all spaces, consecutive, one.
    For example, if we introduce the sentence "I    am      learning     Java   Core»,
    we have to get the "I'm learning Java Core»
     */
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java   Core";
        String newSentence = sentence.replaceAll("\\s{2,}", " ");
        System.out.println("Old sentence: '" + sentence + "'");
        System.out.println("New sentence: '"+newSentence+ "'");
    }
}
