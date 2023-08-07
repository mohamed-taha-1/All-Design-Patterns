package designPatterns.structural.bridge.example1;

public class VectorRenderer implements Renderer {
	@Override
	public void renderCircle() {
		System.out.println("Drawing a circle with vector renderer");
	}

	@Override
	public void renderSquare() {
		System.out.println("Drawing a square with vector renderer");
	}
}
