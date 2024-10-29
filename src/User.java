public class User {
    private String username;
    private int score;
    private int level;

    public User(String username) {
        this.username = username;
        this.score = 0;
        this.level = 1;
    }

    public void increaseScore(int points) {
        score += points;
    }

    public void decreaseScore(int points) {
        score -= points;
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public int getScore() { return score; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
}
