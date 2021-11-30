package com.software.edu.hw05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Conditions {
    public static void main(String[] args) throws IOException {
        System.out.println("Practical tasks");
        oddNumb();
        dayOfTheWeek();
        contryContinents();
        products();
        System.out.println("\nHome Work");
        floatNum();
        maxMun();
        httpError();
        dogs();
    }
    public static void oddNumb() throws IOException {
        int count =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nTask №1\nPut number 1 = ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Put number 2 = ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Put number 3 = ");
        int c = Integer.parseInt(br.readLine());

        if(a % 2 == 1){
            count ++;
            System.out.println("Number "+ a +" is odd ");
        }
        else {
            System.out.println("Number "+ a +" isn't odd ");
        }

        if(b % 2 == 1){
            count ++;
            System.out.println("Number "+ b +" is odd ");
        }
        else {
            System.out.println("Number "+ b +" isn't odd ");
        }

        if(c % 2 == 1){
            count ++;
            System.out.println("Number "+ c +" is odd ");
        }
        else {
            System.out.println("Number "+ c +" isn't odd ");
        }

        System.out.println("In general, "+ count +" numbers is odd");
    }

    public static void dayOfTheWeek() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nTask №2\nHello,\nEnter the day of the week: ");
        int num = Integer.parseInt(br.readLine());
        switch (num){
            case 1:
                System.out.println("Monday(eng),\nПонедельник(rus),\nПонеділок(ukr)");
                break;
            case 2:
                System.out.println("Tuesday(eng),\nВторник(rus),\nВівторок(ukr)");
                break;
            case 3:
                System.out.println("Wednesday(eng),\nСреда(rus),\nСереда(ukr)");
                break;
            case 4:
                System.out.println("Thursday(eng),\nЧетверг(rus),\nЧетверг(ukr)");
                break;
            case 5:
                System.out.println("Friday(eng),\nПятница(rus),\nП'ятниця(ukr)");
                break;
            case 6:
                System.out.println("Saturday(eng),\nСуббота(rus),\nСубота(ukr)");
                break;
            case 7:
                System.out.println("Sunday(eng),\nВоскресенье(rus),\nНеділя(ukr)");
                break;
            default:
                System.out.println("Sorry, you enter wrong number");
        }
    }

    public static void contryContinents() throws IOException{
        Country.findContients();
    }
    public static void products (){
        Product product1 = new Product("Apple", 50, 10);
        Product product2 = new Product("Banana", 25,5);
        Product product3 = new Product("Orange", 15,40);
        Product product4 = new Product("Avocado", 20,5);

        Product theMostExpensive = product1;

        if(product2.getPrice() > theMostExpensive.getPrice()){
            theMostExpensive = product2;
        }
        if(product3.getPrice() > theMostExpensive.getPrice()){
            theMostExpensive = product3;
        }
        if(product4.getPrice() > theMostExpensive.getPrice()){
            theMostExpensive = product4;
        }
        System.out.println("\nTask № 4");
        System.out.println("The most expensive is "+ theMostExpensive.getName()+ " : "+theMostExpensive.getPrice()+
                "$ \nAnd quantity: "+theMostExpensive.getQuantity());

        Product biggestQuantity = product1;

        if(product2.getQuantity() > biggestQuantity.getQuantity()){
            biggestQuantity = product2;
        }
        if(product3.getQuantity() > biggestQuantity.getQuantity()){
            biggestQuantity = product3;
        }
        if(product4.getQuantity() > biggestQuantity.getQuantity()){
            biggestQuantity = product4;
        }
        System.out.println("The biggest quantity is "+biggestQuantity.getName()+": "+biggestQuantity.getQuantity());
    }

    public  static void floatNum () throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello,\nEnter first float number: ");
        float a = Float.parseFloat(br.readLine());

        System.out.print("Enter second float number: ");
        float b = Float.parseFloat(br.readLine());

        System.out.print("Enter third float number: ");
        float c = Float.parseFloat(br.readLine());

        if (a>= -5 && a <=5){
            System.out.println("Number "+ a+" belong to the range [-5,5]");
        }
        else {
            System.out.println("Number "+ a+" not belong to the range [-5,5]");
        }

        if (b>= -5 && b <=5){
            System.out.println("Number "+ b +" belong to the range [-5,5]");
        }
        else {
            System.out.println("Number "+ b +" not belong to the range [-5,5]");
        }

        if (c>= -5 && c <=5){
            System.out.println("Number "+ c +" belong to the range [-5,5]");
        }
        else {
            System.out.println("Number "+ c +" not belong to the range [-5,5]");
        }
    }

    public static void maxMun() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello,\nEnter first integer number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second integer number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Enter third integer number: ");
        int c = Integer.parseInt(br.readLine());

        int maxNum = a, minNum = a;

        if(a >= b){
            maxNum = a;
            minNum = b;
        }
        else {
            maxNum = b;
            minNum = a;
        }
        if (c>= maxNum){
            maxNum = c;
        }
        else {
            minNum = c;
        }
        System.out.println("Max = "+ maxNum+"\nMin = "+ minNum);
    }

    public static void httpError()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Hello\nEnter the number of HTTP ERROR from 400 to 407:");
        int num = Integer.parseInt(br.readLine());

        switch (num){
            case 400:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.BAD_REQUEST );
                break;

            case 401:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.UNAUTHARIZED );
                break;

            case 402:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.PAYMENT_REQUIRED);
                break;

            case 403:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.FORBIDDEN );
                break;

            case 404:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.NOT_FOUND );
                break;

            case 405:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.NOT_FOUND );
                break;

            case 406:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.METHOD_NOT_ALLOWED);
                break;

            case 407:
                System.out.println("This error number " + num + " is: " +HttpError.Errors.PROXY_AUTHENTICATION_REQUIRED);
                break;
            default:
                System.out.println("Sorry, you enter wrong number");
                break;
        }
    }
    public  static void dogs(){
        Dog dog1 = new Dog("Clay","Bulldog",3);
        Dog dog2 = new Dog("Chip", "Beagle",2);
        Dog dog3 = new Dog("Rex","Cavalier King Charles Spaniel",5);

    if(!dog1.equals(dog2)&& !dog2.equals(dog3) && !dog3.equals(dog1)){
        System.out.println("\nThere aren't dogs with the same name");
    }

    Dog oldestDog = dog1;
    if(dog2.getAge() > oldestDog.getAge()){
        oldestDog = dog2;
    }
    if(dog3.getAge() > oldestDog.getAge()){
        oldestDog = dog3;
    }
        System.out.println("The oldest dog is "+ oldestDog.getName() + ", "+oldestDog.getBreed() +", "+ oldestDog.getAge()+" years old.");
    }

}
