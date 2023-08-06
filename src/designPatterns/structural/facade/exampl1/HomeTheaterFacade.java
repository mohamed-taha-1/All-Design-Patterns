package designPatterns.structural.facade.exampl1;

public class HomeTheaterFacade {

	private DVDPlayer dvdPlayer;
	private Projector projector;
	private Amplifier amplifier;
	private Speakers speakers;

	public HomeTheaterFacade() {
		dvdPlayer = new DVDPlayer();
		projector = new Projector();
		amplifier = new Amplifier();
		speakers = new Speakers();
	}

	// Simplified methods for clients to interact with the home theater system
	public void watchMovie() {
		projector.on();
		projector.setInput(dvdPlayer);
		amplifier.on();
		amplifier.setDVDPlayer(dvdPlayer);
		amplifier.setSurroundSound();
		speakers.on();
		speakers.setVolume(15);
		dvdPlayer.on();
		dvdPlayer.play();
	}

	public void endMovie() {
		dvdPlayer.stop();
		dvdPlayer.off();
		speakers.off();
		amplifier.off();
		projector.off();
	}

}
