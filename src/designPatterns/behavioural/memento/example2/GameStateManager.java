package designPatterns.behavioural.memento.example2;

import java.util.ArrayList;
import java.util.List;

public class GameStateManager {

	private List<GameStateMemento> states = new ArrayList<>();

	public void saveState(GameStateMemento state) {
		states.add(state);
	}

	public GameStateMemento getLastSavedState() {
		if (!states.isEmpty()) {
			return states.get(states.size() - 1);
		}
		return null;
	}

}
