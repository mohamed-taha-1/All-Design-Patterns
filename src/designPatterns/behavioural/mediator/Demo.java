package designPatterns.behavioural.mediator;

import designPatterns.behavioural.mediator.example1.AirTrafficControl;
import designPatterns.behavioural.mediator.example1.AirTrafficControlCenter;
import designPatterns.behavioural.mediator.example1.Aircraft;
import designPatterns.behavioural.mediator.example1.Airplane;
import designPatterns.behavioural.mediator.example2.ChatMediator;
import designPatterns.behavioural.mediator.example2.ChatRoom;
import designPatterns.behavioural.mediator.example2.ChatUser;
import designPatterns.behavioural.mediator.example2.User;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> promotes loose coupling between multiple objects by centralizing their
		 * communication through a mediator object.
		 *
		 * <T> This pattern is used to manage and facilitate communication between
		 * objects that interact with each other, without them needing to have direct
		 * references to each other.
		 * 
		 * 
		 * 
		 * <P> Used to avoid the complexities and tight coupling that can arise when
		 * objects communicate directly with each other. Instead, the Mediator acts as
		 * an intermediary, providing a common interface for communication and allowing
		 * objects to interact in a more decoupled manner.
		 *
		 **/

		AirTrafficControl atc = new AirTrafficControlCenter();

		Aircraft airplane1 = new Airplane(atc);
		Aircraft airplane2 = new Airplane(atc);
		Aircraft airplane3 = new Airplane(atc);

		atc.registerAircraft(airplane1);
		atc.registerAircraft(airplane2);
		atc.registerAircraft(airplane3);

		airplane1.sendWarning("Weather alert"); // Output: Airplane received warning: Weather alert
												// Airplane received warning: Weather alert

		// ---------------------------Example-2 ----------------------------------

		System.out.println("\n******************************************\n");
		ChatMediator chatMediator = new ChatRoom();

		User user1 = new ChatUser("User 1", chatMediator);
		User user2 = new ChatUser("User 2", chatMediator);
		User user3 = new ChatUser("User 3", chatMediator);

		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);

		user1.sendMessage("Hello everyone!"); // Output: User 2 received message: Hello everyone!
												// User 3 received message: Hello everyone!

	}

}
