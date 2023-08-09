package designPatterns.behavioural.mediator.example1;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlCenter implements AirTrafficControl {
	private List<Aircraft> aircraftList = new ArrayList<>();

	@Override
	public void registerAircraft(Aircraft aircraft) {
		aircraftList.add(aircraft);
	}

	@Override
	public void sendWarning(Aircraft aircraft, String warning) {
		for (Aircraft otherAircraft : aircraftList) {
			if (otherAircraft != aircraft) {
				otherAircraft.receiveWarning(warning);
			}
		}
	}

}
