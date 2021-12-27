package HW10.PracticalTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT3 {
    /*
    The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
    Using regular expressions implement checking the user name for validity.
    Input five names in the main method .
    Output a message to the console of the validation of each of the entered names.
    */
    public static void main(String[] args) {
//        String regex1="java"; // шаблон строки ”java”;
//        String regex2="\\d{3}"; // шаблон строки из трех цифровых символов;
//        String regex="\\w{3,15}";

        String[] names = {"Ivanov Ivan Ivanovich",
                "Samanta Boris Fox",
                "Simpson Van_Dam",
                "Simpson Van-Dam",
                "Simpson Van Dam",
                "SIMPSON",
                "SIMPSON02",
                "simpSon    vaN"
        };
        for (String name : names) {
//            System.out.println(name + " -(" + name.length() + " симв.) - " + (testExpr(name)?"":"не")+ " підходить.");
            System.out.printf("%25s -(%2d симв.) - %2s підходить.\n", name, name.length(), (testExpr(name) ? "" : "не"));
        }
    }

    private static boolean testExpr(String name) {
        String regex = "[A-Za-z0-9\\s_]{3,15}";
        //String regex="[A-Za-z0-9\\s]+";
        //String regex="[A-Za-z\\s]+";
        //String regex="\\w+\\s+";
        //String regex="[a-z]+";
        //String regex="[A-Za-z]+";           //[A-Za-z]+[0-9]
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.matches();
    }


}
