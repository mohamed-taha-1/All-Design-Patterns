package designPatterns.behavioural.mediator.example1;

public abstract class Aircraft {
	
	 protected AirTrafficControl atc;

	    public Aircraft(AirTrafficControl atc) {
	        this.atc = atc;
	    }

	    public abstract void sendWarning(String warning);
	    public abstract void receiveWarning(String warning);

}
