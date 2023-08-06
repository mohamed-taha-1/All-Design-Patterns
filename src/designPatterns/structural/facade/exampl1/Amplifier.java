package designPatterns.structural.facade.exampl1;

public class Amplifier {

	void on() {
		System.out.println("Amplifier is ON");
	}

	void off() {
		System.out.println("Amplifier is OFF");
	}

	void setDVDPlayer(DVDPlayer dvdPlayer) {
		System.out.println("Amplifier is connected to DVD Player");
	}

	void setSurroundSound() {
		System.out.println("Surround sound is set");
	}
}
