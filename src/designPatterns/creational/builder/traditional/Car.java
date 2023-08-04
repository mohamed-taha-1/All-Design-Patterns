package designPatterns.creational.builder.traditional;

public class Car {

	
	 private String brand;
	    private String model;
	    private String color;
	    
	    // Constructor (private to enforce using the builder)
	    Car() {}

		public String getBrand() {
			return brand;
		}

		public String getModel() {
			return model;
		}

		public String getColor() {
			return color;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Car [brand=" + brand + ", model=" + model + ", color=" + color + "]";
		}
	    
	    
	    
}
