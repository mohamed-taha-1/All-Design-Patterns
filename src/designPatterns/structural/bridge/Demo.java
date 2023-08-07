package designPatterns.structural.bridge;

import designPatterns.structural.bridge.example1.Circle;
import designPatterns.structural.bridge.example1.RasterRenderer;
import designPatterns.structural.bridge.example1.Renderer;
import designPatterns.structural.bridge.example1.Shape;
import designPatterns.structural.bridge.example1.Square;
import designPatterns.structural.bridge.example1.VectorRenderer;
import designPatterns.structural.bridge.example2.BasicRemote;
import designPatterns.structural.bridge.example2.RemoteControl;
import designPatterns.structural.bridge.example2.SmartRemote;
import designPatterns.structural.bridge.example2.TV;
import designPatterns.structural.bridge.example2.tvImpl.LCD_TV;
import designPatterns.structural.bridge.example2.tvImpl.LED_TV;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> Used in object-oriented programming to declare an abstraction from its
		 * implementation. so that the two can vary independent.
		 * 
		 * 
		 * <T> if there are multiple concrete classes for our interface and you want to
		 * use those implementations carefully.through abstract class that act as a key
		 * switcher between those implementations for the interface.
		 * 
		 * 
		 * 
		 * 
		 **/

		// Create rendering types
		Renderer rasterRenderer = new RasterRenderer();
		Renderer vectorRenderer = new VectorRenderer();

		// Create shapes with different rendering types
		Shape circleWithRaster = new Circle(rasterRenderer);
		Shape circleWithVector = new Circle(vectorRenderer);

		Shape squareWithRaster = new Square(rasterRenderer);

		// Draw the shapes
		System.out.println("Drawing shapes with different rendering types:");
		circleWithRaster.draw(); // Output: Drawing a circle with raster renderer
		circleWithVector.draw(); // Output: Drawing a circle with vector renderer
		squareWithRaster.draw(); // Output: Drawing a square with vector renderer

		System.out.println("\n\n*******\n");

		// Example-2
		TV lcdTv = new LCD_TV();
		TV ledTv = new LED_TV();

		RemoteControl basicRemoteControl_LCD = new BasicRemote(lcdTv);
		RemoteControl smartRemoteControl_LCD = new SmartRemote(lcdTv);

		RemoteControl basicRemoteControl_LED = new BasicRemote(ledTv);
		RemoteControl smartRemoteControl_LED = new SmartRemote(ledTv);

		// --
		// Use remotes to control TVs
		System.out.println("Using remotes to control different LCD_TVs:");
		basicRemoteControl_LCD.powerOn(); // Output: BasicRemote: Power ON, LCD TV is ON
		basicRemoteControl_LCD.powerOff(); // Output: BasicRemote: Power OFF, LCD TV is OFF
		// smart for LCD_TV
		smartRemoteControl_LCD.powerOn(); // Output: samrtRemote: Power ON, LCD TV is ON
		smartRemoteControl_LCD.powerOff(); // Output: smartRemote: Power OFF, LCD TV is OFF
		
		System.out.println("\n Using remotes to control different LED_TVs:");
		basicRemoteControl_LED.powerOn(); // Output: BasicRemote: Power ON, LED TV is ON
		basicRemoteControl_LED.powerOff(); // Output: BasicRemote: Power OFF, LED TV is OFF
		// smart for LCD_TV
		smartRemoteControl_LED.powerOn(); // Output: SmartRemote: Power ON, LED TV is ON
		smartRemoteControl_LED.powerOff(); // Output: SmartRemote: Power OFF, LED TV is OFF

	}

}
