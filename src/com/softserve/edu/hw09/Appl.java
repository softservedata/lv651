package com.softserve.edu.hw09;

public class Appl {

	public static void main(String[] args) {
		Wrapper<Integer> first = new Wrapper<>(1);
		Wrapper<String> second = new Wrapper<>("Я є врапер");
		Wrapper<Boolean> third = new Wrapper<>(false);

		System.out.println(first.getValue() + second.getValue() + third.getValue());

	}
}
