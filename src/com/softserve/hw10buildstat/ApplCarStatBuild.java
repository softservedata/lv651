package com.softserve.hw10buildstat;

public class ApplCarStatBuild {
	public static void main(String[] args) {
		Car car = Car.builder()
				.setModelBMWx5()
				.setColorWhite()
				.setEnginePetrol()
				.setGearManual()
				.setLightHalogen()
				.build();
		System.out.println("car = " + car);
	}
}
