package com.company.edu.hw5;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Head {
    public static void main(String[] args) {
        //Task1
        Scanner sc = new Scanner(System.in);
        /*
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a = sc.nextInt();
        for (int i = 0; i < monthDays.length; i++) {
            if(i==a-1){
                System.out.println("Amount of days:"+monthDays[i]);
            }
        }
*/
        //Task 2
        /*
        int[] numbers={1, -2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count=0,sum=0, product=1;
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]>0)
            {
                count++;
            }
        }
        if(count==10)
        {
            for (int i = 0; i < 5; i++)
            {
                sum=sum+numbers[i];
            }
            System.out.println("Sum of 5 first numbers:"+sum);
        }
        else
        {
            for (int i = 5; i < 10; i++)
            {
                product=product*numbers[i];
            }
            System.out.println("Product of 5 last numbers:"+product);
        }*/
//Task3
        /*
        int[] numbers = new int[5];
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number: ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                break;
            }
            numbers[i] = n;
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        sc.close();
        int min = numbers[0], imin = 0, sum = 0;
        int pos = 0, ipos = 0, count = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>0)
            {
                count++;
                pos=numbers[i];
                ipos=i;
            }
            if(count==2)
            {
                break;
            }
        }
        if(count<2){
            System.out.println("Second positive number doesn`t exist");
        }
        else{
        System.out.println("Second positive value "+pos+" is in "+(ipos+1)+" position");}

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            imin = i;
        }
    }
        System.out.println("Value of min:"+min+"\nPosition of min:"+(imin+1));
for(int i=0; i<numbers.length; i++){
    if(numbers[i]%2==0){
        sum=sum+numbers[i];
    }
}
        System.out.println("Sum of even numbers:"+sum);
    */
        Car car1=new Car("Mitsubishi", 2019, 30);
        Car car2=new Car("Audi", 2020, 27);
        Car car3=new Car("Porshepanamera", 2017, 32);
        Car car4=new Car("BMW", 2018, 35);
        int year=sc.nextInt();
        switch(year){
            case 2017:
                System.out.println("Model of "+year+" year is " + car3.getType());
                break;
            case 2018:
                System.out.println("Model of "+year+" year is " + car4.getType());
                break;
            case 2019:
                System.out.println("Model of "+year+" year is " + car1.getType());
                break;
            case 2020:
                System.out.println("Model of "+year+" year is " + car2.getType());
                break;
            default:
                System.out.println("We dont have models from "+year);
                break;
        }
        Car[] arr=new Car[]{car1, car2, car3, car4};
        Car tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYear() < arr[j].getYear()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.println("There is cars ordered by year: "+"\n"+arr[i].toString() );
        }

            }


}
