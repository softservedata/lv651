package com.softserve.hw10build;

public class AppCarBuilder {
	public static void main(String[] args) {
		Car car = Car.builder()
				.setBMWx5()
				.setRed()
				.setPetrol()
				.setAutomat()
				.setHalogen()
				.build();
		System.out.println("car = " + car);
	}
}
