package designPatterns.structural.facade.exampl1;

public class Projector {
	void on() {
		System.out.println("Projector is ON");
	}

	void off() {
		System.out.println("Projector is OFF");
	}

	void setInput(DVDPlayer dvdPlayer) {
		System.out.println("Projector is connected to DVD Player");
	}
}
