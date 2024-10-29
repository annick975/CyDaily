public abstract class Game {
    protected String title;
    protected String description;
    protected int level;

    public Game(String title, String description, int level) {
        this.title = title;
        this.description = description;
        this.level = level;
    }

    public abstract void startGame();
    public abstract void endGame();

    public void displayRules() {
        System.out.println("Game Rules: [Insert specific rules here]");
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getLevel() { return level; }
}
