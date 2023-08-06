package designPatterns.structural.facade.exampl1;

public class DVDPlayer {
	void on() {
		System.out.println("DVD Player is ON");
	}

	void off() {
		System.out.println("DVD Player is OFF");
	}

	void play() {
		System.out.println("DVD Player is playing");
	}

	void stop() {
		System.out.println("DVD Player is stopped");
	}
}
