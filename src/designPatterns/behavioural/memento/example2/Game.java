package designPatterns.behavioural.memento.example2;

public class Game {

	private int level = 1;
    private int score = 0;

    public void play(int points) {
        score += points;
        if (score >= 100) {
            level++;
            score = 0;
        }
    }

    public GameStateMemento save() {
        return new GameStateMemento(level, score);
    }

    public void load(GameStateMemento memento) {
        level = memento.getLevel();
        score = memento.getScore();
    }

    public void displayState() {
        System.out.println("Level: " + level + ", Score: " + score);
    }
}
