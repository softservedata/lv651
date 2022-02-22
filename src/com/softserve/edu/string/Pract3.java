package com.softserve.edu.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*The user name can be 3 to 15 characters 
of the Latin alphabet, numbers, and underscores.
Using regular expressions implement checking 
the user name for validity. Input five names 
in the main method . Output a message to the console
of the validation of each of the entered names.*/


public class Pract3 {

	public static void main(String[] args) {
		String[] usernames = { "Hi" , "My0_password", "Too0000Lo000ng__password", "Ok123_Пароль", "12345" };
		Pattern p = Pattern.compile("[A-Za-z\\d_]{3,15}");
		for (String username: usernames) {
			Matcher m = p.matcher(username);
			if (m.matches()) {
				System.out.println(String.format("Username \"%s\" is valid.", username));
			} else {
				System.out.println(String.format("Username \"%s\" is invalid.", username));				
			}
		}
}
}