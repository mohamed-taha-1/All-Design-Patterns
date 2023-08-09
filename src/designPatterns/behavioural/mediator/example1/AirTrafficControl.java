package designPatterns.behavioural.mediator.example1;

public interface AirTrafficControl {
	void registerAircraft(Aircraft aircraft);
    void sendWarning(Aircraft aircraft, String warning);

}
