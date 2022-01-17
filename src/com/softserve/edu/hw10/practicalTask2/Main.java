package com.software.edu.hw10.practicalTask2;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(785,"Petro");
        employeeMap.put(134,"Dmitro");
        employeeMap.put(752,"Ira");
        employeeMap.put(104,"Clay");
        employeeMap.put(752,"Kate");
        employeeMap.put(603,"Vika");
        employeeMap.put(785,"Lily");
        employeeMap.put(134,"Ivan");

        System.out.println("Employee ID and Name"+ employeeMap);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nPlease, enter your ID: ");
        int id = Integer.parseInt(br.readLine());

        if(employeeMap.containsKey(id)){
            System.out.println("ID is: "+ id +"\nBelongs to: "+ employeeMap.get(id) );
        }
        else System.out.println("Sorry, We can't find this ID");



        System.out.print("\nPlease, enter your name: ");
        String name = br.readLine();
        String userName = null;
        int userid = -1;
        for (Map.Entry<Integer, String> mapEmp : employeeMap.entrySet()) {
            if (mapEmp.getValue().equals(name)) {
                userName = name;
                userid = mapEmp.getKey();
            }
        }

        if (userName != null) {
            System.out.println("User name is: " + userName + "\nUser ID is: " + userid);
        } else {
            System.out.println("Sorry, We can't find user");
        }

    }
}
