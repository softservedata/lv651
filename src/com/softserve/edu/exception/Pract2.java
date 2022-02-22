package com.softserve.edu.exception;

public class Pract2 {
	/*
	 * Create a class Plant, which includes fields int size, Color color and Type
	 * type, and constructor where these fields are initialized. Color and type are
	 * Enum. Override the method toString( ). Create classes ColorException and
	 * TypeException and describe there all possible colors and types of plants. In
	 * the method main create an array of five plants. Check to work your
	 * exceptions.
	 */

	public void main(String[] args) throws ColorException, TypeException {
		try {
			Plant pl = new Plant("rose", "blue", 5);
			System.out.println(pl);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage() + "\n");
		}
}

	public enum Color {
		WHITE, BLACK, RED
	}

	public enum Type {
		GRASS, FLOWERS, TREES
	}

	public class ColorException extends Exception {
		public ColorException(String s) {
			super(s);
		}
	}

	public class TypeException extends Exception {
		public TypeException(String s) {
			super(s);
		}
	}

	public class Plant {
		private Type type;
		private Color color;
		private int size;

		public Plant(String type, String color, int size) throws ColorException, TypeException {
			Color c = colorStrToEnum(color);
			Type t = typeStrToEnum(type);
			this.size = size;
			this.type = t;
			this.color = c;
		}

		private Color colorStrToEnum(String color) throws ColorException {
			switch (color.toLowerCase()) {
			case "black":
				return Color.BLACK;
			case "red":
				return Color.RED;
			case "white":
				return Color.WHITE;
			default:
				throw new ColorException("Input only color black, red or white");
			}
		}

		private Type typeStrToEnum(String type) throws TypeException {
			switch (type.toLowerCase()) {
			case "grass":
				return Type.GRASS;
			case "flowers":
				return Type.FLOWERS;
			case "trees":
				return Type.TREES;
			default:
				throw new TypeException("Input only color grass, flowers or trees");
			}

		}

		@Override
		public String toString() {
			return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
		}
}
}