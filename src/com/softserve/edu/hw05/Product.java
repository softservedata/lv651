package com.softserve.edu.hw05;

public class Product {

	/*
	 * Create class Product with fields name, price and quantity. Create four
	 * instances of type Product. Display the name and quantity of the most
	 * expensive item. Display the name of the items, which has the biggest
	 * quantity.
	 */
	private String name;
	private double price;
	private int quantity;

	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
