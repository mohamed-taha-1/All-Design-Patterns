package designPatterns.structural.facade.exampl1;

public class Speakers {
	void on() {
		System.out.println("Speakers are ON");
	}

	void off() {
		System.out.println("Speakers are OFF");
	}

	void setVolume(int volume) {
		System.out.println("Speakers volume set to " + volume);
	}
}
