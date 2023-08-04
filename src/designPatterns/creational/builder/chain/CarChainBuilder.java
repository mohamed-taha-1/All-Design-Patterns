package designPatterns.creational.builder.chain;

import designPatterns.creational.builder.traditional.CarBuilder;

public class CarChainBuilder {

	private String brand;
	private String model;
	private String color;

	// Constructor (private to enforce using the builder)
	private CarChainBuilder() {
	}

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

	public static Builder newBuilder() {
		return new CarChainBuilder().new Builder();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	}

	public class Builder {

		private Builder() {
		}

		public Builder setBrand(String brand) {
			CarChainBuilder.this.brand = brand;
			return this;
		}

		public Builder setModel(String model) {
			CarChainBuilder.this.model = model;
			return this;
		}

		public Builder setColor(String color) {
			CarChainBuilder.this.color = color;
			return this;
		}

		public CarChainBuilder build() {
			return CarChainBuilder.this;
		}

	}
}
