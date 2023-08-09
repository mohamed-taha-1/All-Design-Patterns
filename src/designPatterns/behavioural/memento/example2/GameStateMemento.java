package designPatterns.behavioural.memento.example2;

public class GameStateMemento {

	private final int level;
    private final int score;

    public GameStateMemento(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
