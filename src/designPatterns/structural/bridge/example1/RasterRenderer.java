package designPatterns.structural.bridge.example1;

// Concrete Implementation
public class RasterRenderer implements Renderer {
	@Override
	public void renderCircle() {
		System.out.println("Drawing a circle with raster renderer");
	}

	@Override
	public void renderSquare() {
		System.out.println("Drawing a square with raster renderer");
	}
}
