package com.softserve.hw10buildstat;

public class Car {

	public static class CarBuilder {
		private Car car;

		private CarBuilder(Car car) {
			this.car = car;
		}
		
		public CarBuilder setModelMercedes() {
			car.model = "Mercedes";
			return this;
		}

		public CarBuilder setModelBMWx5() {
			car.model = "BMWx5";
			return this;
		}

		public CarBuilder setModelHonda() {
			car.model = "Honda";
			return this;
		}
		
		public CarBuilder setColorRed() {
			car.color = "Red";
			return this;
		}

		public CarBuilder setColorBlack() {
			car.color = "Black";
			return this;
		}

		public CarBuilder setColorWhite() {
			car.color = "White";
			return this;
		}
		
		public CarBuilder setEnginePetrol() {
			car.engine = "Petrol";
			return this;
		}

		public CarBuilder setEngineDisel() {
			car.engine = "Disel";
			return this;
		}
		
		public CarBuilder setGearManual() {
			car.gear = "Manual";
			return this;
		}

		public CarBuilder setGearAutomat() {
			car.gear = "Automat";
			return this;
		}
		
		public CarBuilder setLightHalogen() {
			car.light = "Halogen";
			return this;
		}

		public CarBuilder setLightXenon() {
			car.light = "Xenon";
			return this;
		}

		public CarBuilder setLightLed() {
			car.light = "Led";
			return this;
		}

		public Car build() {
			return this.car;
		}
}
	// - - - - - - - - - -

		private String model; // = null
		private String color;
		private String engine;
		private String gear;
		private String light;

		private Car() {
			model = "";
			color = "";
			engine = "";
			gear = "";
			light = "";
		}
		
		public static CarBuilder builder() {
			return new CarBuilder(new Car());
		}
		
		// getters

		public String getModel() {
			return model;
		}

		public String getColor() {
			return color;
		}

		public String getEngine() {
			return engine;
		}

		public String getGear() {
			return gear;
		}

		public String getLight() {
			return light;
		}

		@Override
		public String toString() {
			return "Car [model=" + model 
					+ ", color=" + color 
					+ ", engine=" + engine 
					+ ", gear=" + gear 
					+ ", light=" + light
					+ "]";
		}

}
