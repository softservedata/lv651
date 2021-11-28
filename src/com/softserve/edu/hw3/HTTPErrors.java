package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPErrors {
    public enum httpError {
        BadRequest(400),
        Unauthorized(401),
        Forbidden(403),
        NotFound(404);
        
        private final Integer value;

        private httpError(Integer value){
            this.value = value;
        }
        public Integer getValue(){
            return value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter error numbers 400-405: ");
        int input = Integer.parseInt(br.readLine());

        switch (input)  {
            case 400:
                System.out.println("Name of error: " + httpError.BadRequest);
                break;
            case 401:
                System.out.println("Name of error: " + httpError.Unauthorized);
                break;
            case 403:
                System.out.println("Name of error: " + httpError.Forbidden);
                break;
            case 404:
                System.out.println("Name of error: " + httpError.NotFound);
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}
