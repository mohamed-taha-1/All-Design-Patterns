package designPatterns.structural.bridge.example1;

public class Circle extends Shape {
	public Circle(Renderer renderer) {
		super(renderer);
	}

	@Override
	public void draw() {
		renderer.renderCircle();
	}
}