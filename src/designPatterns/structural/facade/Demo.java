package designPatterns.structural.facade;

import designPatterns.structural.facade.exampl1.HomeTheaterFacade;
import designPatterns.structural.facade.example2.ShoppingCartFacade;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> provides a unified and simplified interface to a complex subsystem or set
		 * of interfaces.
		 * 
		 * <T> It acts as a higher-level interface that makes it easier for clients to
		 * interact with the underlying system by hiding its complexity.
		 * 
		 * <T> improve usability and reduce the dependency on complex subsystems.
		 * 
		 * <P> The Facade Pattern is commonly used in large software systems,
		 * libraries, or frameworks to simplify complex interactions and provide a
		 * cleaner, more intuitive API for the clients.
		 * 
		 **/
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();

        System.out.println("\n\n****");
        // Simulate some actions in between...
        homeTheater.endMovie();
        
        System.out.println("\n\n\n******");
        
        //Example-2
        ShoppingCartFacade shoppingCart = new ShoppingCartFacade();
        shoppingCart.addToCart("Laptop");
        shoppingCart.addToCart("Headphones");
        
        shoppingCart.checkout(1500.0);
        
        
	}

}
