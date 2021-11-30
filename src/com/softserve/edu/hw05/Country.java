package com.software.edu.hw05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class Country {
    public enum Continents {
        ASIA, AFRICA, EUROPE, SOUTH_AMERICA, NORTH_AMERICA, ANTARCTICA, AUSTRALIA
    }

    public  static void findContients() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nTask №3\nHello,\nEnter the name of country: ");
        String country = br.readLine();

        switch (country.toUpperCase(Locale.ROOT)){
            case "JAPANESE":
            case "CHINE":
            case "INDIA":
                System.out.println("Continent is " + Continents.ASIA);
                break;

            case "FRANCE":
            case "GERMANY":
            case "ITALY":
                System.out.println("Continent is " + Continents.EUROPE);
                break;

            case "EGYPT":
            case "KENYA":
            case "CONGO":
                System.out.println("Continent is" + Continents.AFRICA);
                break;

            case "THE USE":
            case "CANADA":
            case "MEXICO":
                System.out.println("Continent is" + Continents.NORTH_AMERICA);
                break;

            case "ARGENTINA":
            case "BRAZIL":
            case "COLOMBIA":
                System.out.println("Continent is" + Continents.SOUTH_AMERICA);
                break;

            case "AUSTRALIA":
            case "NEW ZEALAND":
            case "PAPUA NEW GUINEA":
                System.out.println("Continent is" + Continents.AUSTRALIA);
                break;

            case "ANTARCTICA":
                System.out.println("Continent is" + Continents.ANTARCTICA);

            default:
                System.out.println("Sorry,but I don't have this counrty on my list");
        }


    }
}
