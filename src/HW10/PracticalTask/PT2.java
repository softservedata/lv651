package HW10.PracticalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PT2 {
    /*
    Enter surname, name and patronymic on the console as a variable of type String.
    Output on the console:
        surnames and initials
        name
        name, middle name and last name
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter surname, name and patronymic");
        String fullName = scanner.nextLine();           //Zap   Serg   Ivan
        ArrayList<String> name = new ArrayList<>(Arrays.asList(fullName.split(" ")));
        clearElem(name);

        if (name.size()<3) {
            System.out.println("not enough parameters");
            System.exit(0);
        }

        System.out.println(name);
        System.out.println("1: " + getName(name, FormatName.SURNAME_INITIALS));
        System.out.println("2: " + getName(name, FormatName.NAME));
        System.out.println("3: " + getName(name, FormatName.NAME_MIDDLENAME_LASTNAME));
    }

    private static void clearElem(ArrayList<String> name) {
        name.removeIf(x -> x.equals(""));
        for (int i = 0; i < name.size(); i++) {
            name.set(i,name.get(i).trim().toLowerCase());
        }
    }

    private static String getName(ArrayList<String> name, FormatName fName) {
        String result="";
        switch (fName){
            case NAME:
                result= formatName(name.get(1));
                break;
            case SURNAME_INITIALS:
                result= formatName(name.get(0))+ " " + getInitial(name.get(1)) + ". " + getInitial(name.get(2)) + ".";
                break;
            case NAME_MIDDLENAME_LASTNAME:
                result= formatName(name.get(1)) + " " + formatName(name.get(2)) + " " + formatName(name.get(0));
        }
        return result;
    }

    private static String formatName(String s) {
        return s.substring(0,1).toUpperCase(Locale.ROOT) + s.substring(1);
    }

    private static String getInitial(String s) {
        return s.substring(0,1).toUpperCase(Locale.ROOT);
    }


    enum FormatName {SURNAME_INITIALS, NAME, NAME_MIDDLENAME_LASTNAME,}
}
