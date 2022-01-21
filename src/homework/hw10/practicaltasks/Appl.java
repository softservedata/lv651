package homework.hw10.practicaltasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Enter the two variables of type String. Determine whether the first variable substring
        second. For example, if you typed «IT» and «IT Academy» you must receive true.
        */

        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.print("str1 substring str2: ");
        System.out.println(str2.toLowerCase(Locale.ROOT).contains(str1.toLowerCase(Locale.ROOT)));

        /*
        Enter surname, name and patronymic on the console as a variable of type String.
        Output on the console:
         - surnames and initials
         - name
         - name, middle name and last name
        */

        System.out.println("Enter surname, name and patronymic: ");
        String fullName = scanner.nextLine();
        String[] fullNameParts = fullName.split(" ");
        if (fullNameParts.length != 3) {
            System.out.println("You need to write 'Surname Name Patronymic'");
        } else {
            System.out.println(" - surnames and initials: " + fullNameParts[0] + " " + fullNameParts[1].charAt(0) + "." + fullNameParts[2].charAt(0) + ".");
            System.out.println(" - name: " + fullNameParts[1]);
            System.out.println(" - name, middle name and last name: " + fullNameParts[1] + " " + fullNameParts[2] + " " + fullNameParts[0]);
        }

        /*
        The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        Using regular expressions implement checking the user name for validity. Input five names
        in the main method . Output a message to the console of the validation of each of the entered
        names.
        */

        List<String> validatedNames = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            if (checkWithRegExp(name.toLowerCase(Locale.ROOT))) {
                System.out.println("The name is validated");
                validatedNames.add(name);
            } else {
                System.out.println("The name is not validated");
            }
        }
        System.out.println("\nValidated names: " + validatedNames);

        scanner.close();
    }
}
