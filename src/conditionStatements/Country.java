package conditionStatements;

import java.util.Scanner;

public class Country {

    public enum Continents {
        ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, EUROPE, AUSTRALIA;
    }

    public static void findContinent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter country name: ");
        String countryName = sc.nextLine();
        countryName = countryName.toUpperCase();

        switch (countryName) {
            case "GERMANY":
            case "FRANCE":
                System.out.println("Continent is: " + Continents.EUROPE);
                break;
            case "CHINA":
            case "INDIA":
                System.out.println("Continent is: " + Continents.ASIA);
                break;
            case "NIGERIA":
            case "ETHIOPIA":
                System.out.println("Continent is: " + Continents.AFRICA);
                break;
            case "CANADA":
            case "UNITED STATES":
                System.out.println("Continent is: " + Continents.NORTH_AMERICA);
                break;
            case "ARGENTINA":
            case "BRAZIL":
                System.out.println("Continent is: " + Continents.SOUTH_AMERICA);
                break;
            case "NEW ZEALAND":
            case "NORWAY":
                System.out.println("Continent is: " + Continents.ANTARCTICA);
                break;
            case "FIJI":
            case "PAPUA NEW GUINEA":
                System.out.println("Continent is: " + Continents.AUSTRALIA);
                break;
            default:
                System.out.println("There is no this country on my list.");
        }
    }
}
