package com.softserve.edu.hw05;

public class ProductAppl {
	/*
	 * Create class Product with fields name, price and quantity. Create four
	 * instances of type Product. Display the name and quantity of the most
	 * expensive item. Display the name of the items, which has the biggest
	 * quantity.
	 */

	public static void main(String[] args) {
		Product product1 = new Product("chocolate", 25, 10);
		Product product2 = new Product("wine", 350, 2);
		Product product3 = new Product("apples", 45, 20);
		Product product4 = new Product("candy", 205, 30);

		Product product_expensive = product1;

		if (product2.getPrice() > product_expensive.getPrice()) {
			product_expensive = product2;
		}
		if (product3.getPrice() > product_expensive.getPrice()) {
			product_expensive = product3;
		}
		if (product4.getPrice() > product_expensive.getPrice()) {
			product_expensive = product4;
		}
		System.out.println("The most expensive product is " + product_expensive.getName() + ".");

		//
		
		Product biggest_quantity = product1;

		if (product2.getQuantity() > biggest_quantity.getQuantity()) {
			biggest_quantity = product2;
		}
		if (product3.getQuantity() > biggest_quantity.getQuantity()) {
			biggest_quantity = product3;
		}
		if (product4.getQuantity() > biggest_quantity.getQuantity()) {
			biggest_quantity = product4;
		}
		System.out.println("The biggest quantity are " + biggest_quantity.getQuantity() + ". It's "
				+ biggest_quantity.getName() + ".");
	}
}