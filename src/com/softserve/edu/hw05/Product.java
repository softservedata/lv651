package com.softserve.edu.hw05;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double quantity;

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
        int a = sc.nextInt();
    System.out.print("Enter b: ");
        int b = sc.nextInt();
    System.out.print("Enter c: ");
        int c = sc.nextInt();

    if (a%2 == 0) {
            System.out.println("Число " + a + " парне");}

    else if (b%2 == 0) {
            System.out.println("Число " + b + " парне");}

    else if (c%2 == 0) {
            System.out.println("Число " + c + " парне");}

    else {
            System.out.println("Парних чисел немає");}

        Scanner sd= new Scanner(System.in);
        System.out.print("Put number day of week to translate this day: ");
            int day = sd.nextInt();

        if (day == 1){
            System.out.println("понеділок, poniedzialek,  montag");
        }
        else if (day == 2){
            System.out.println("вівторок, wtorek, dienstag");
        }
        else if (day == 3){
            System.out.println("середа, sroda, mittwoch");
        }
        else if (day == 4){
            System.out.println("четвер, czwartek, donnerstag");
        }
        else if (day == 5){
            System.out.println("п'ятниця, piątek, freitag");
        }
        else if (day == 6){
            System.out.println("субота, sobota, samstag");
        }
        else if (day == 7){
            System.out.println("неділя, niedziela, sonntag");
        }

    }
    /*public enum Continent {
        Africa, South_America, North_America, Eurasia, Australia;

        Scanner sc = new Scanner(System.in);

        public Continent nextContinent() {
            if (this == Continent.Africa) return Continent.Africa;
            if (this == Continent.South_America) return Continent.South_America;
            if (this == Continent.North_America) return Continent.North_America;
            if (this == Continent.Eurasia) return Continent.Eurasia;
            if (this == Continent.Australia) return Continent.Australia;
            return Continent.Africa;


            String name = ;
            Continent continent = Continent.valueOf(name);

            String country = sc.nextLine();

            switch (country) {
                case "USA": case "Kaneda": case "Mexico":
                    //continent = Continent.South_America;
                    System.out.println(" "+ Continent.South_America);
                    break;
                case "Brazil": case "Chilli": case "Argentine":
                    //continent = Continent.North_America;
                    System.out.println(" "+ Continent.North_America);
                    break;
                case "South african republic": case "Nigeria": case "Egypt":
                    // continent = Continent.Africa;
                    System.out.println(" "+ Continent.Africa);
                    break;
                case "Germany": case "Ukraine": case "China":
                    //continent = Continent.Eurasia;
                    System.out.println(" "+ Continent.Eurasia);
                    break;
                case "Australia":
                    //continent = Continent.Australia;
                    System.out.println(" "+ Continent.Australia);
                    break;
                default:
                    System.out.println("No this country");
            }
        }
    }*/
}


