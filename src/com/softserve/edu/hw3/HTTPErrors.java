package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPErrors {
    public enum httpError {
        400("BadRequest"), 401("Unauthorized"), 403("Forbidden"), 404("NotFound");
        private String name;

        private httpError(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter error number: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Name of error: " + n1);
    }
}
