package com.softserve.edu.hw10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT1 {

	public static void main(String[] args) {
		//String pattern = "[A-Za-z]+";
		String pattern = ".*";
		String text = "London is the capital";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		if (m.matches())
			System.out.println("OK");
		else
			System.out.println("False");
		
		m.reset();
		
		while(m.find()) {
			System.out.println(text.substring(m.start(),m.end()) +"*");
		}

	}

}
