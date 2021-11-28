package HW05.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask3 {
    public static void main(String[] args) throws IOException {
        /*
        Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the name of the country to get continent or first letter.");
        System.out.println("Type 'Exit' for exit the program.");
        Continent continent;
        do {
            String str = br.readLine();
            if (str.equals("Exit")) {
                break;
            }

            continent =  Country.getContinentByName(str.toUpperCase());
            if (continent==Continent.UNDEFINED){
                System.out.println("Sorry, for country '" + str + "' continent unknown!");
                String listCountry = Country.printList(str.toUpperCase());
                if (listCountry.length()!=0){
                    System.out.print("There is some countries which begins by '" + str +"' :" + listCountry + "\n");
                }
            } else {
                System.out.println("Your country '" + str + "' is in " + continent);
            }
        } while (true);
    }
}
