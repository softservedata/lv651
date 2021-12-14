package com.softserve.edu10in;

class Entity {

	private static class Counter {
		private void setCount() {
			count = count + 1;
		}
	}

	// ---------------------------------------------

	private static int count = 0;
	private static Counter counter;

	static {
		System.out.println("Static Block Done");
		counter = new Counter();
	}

	public Entity() {
		// new Counter().setCount();
		System.out.println("Constructor Entity() Done");
		counter.setCount();
	}

	public static int getCount() {
		return count;
	}

}
