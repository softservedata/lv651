package com.softserve.edu.hwOOP1;

public abstract class Bird {

	/*
	 * Develop abstract class Bird with attributes feathers and layEggs and an
	 * abstarct method fly().   Develop classes FlyingBird and NonFlyingBird. Create
	 * class Eagle, Swallow, Penguin and Chicken. Create array Bird and add
	 * different birds to it. Call fly() method for all of it. Output the
	 * information about each type of created bird.
	 */

	protected String feathers;
	protected String layEggs;

	public abstract String fly();
}
