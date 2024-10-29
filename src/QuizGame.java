import java.util.List;

public class QuizGame extends Game {
    private List<Question> questions;

    public QuizGame(String title, String description, int level, List<Question> questions) {
        super(title, description, level);
        this.questions = questions;
    }

    @Override
    public void startGame() {
        System.out.println("Starting Quiz Game: " + title);
        for (Question question : questions) {
            question.askQuestion();
        }
    }

    @Override
    public void endGame() {
        System.out.println("Ending Quiz Game: " + title);
    }

    public void calculateScore(User user) {
        for (Question question : questions) {
            if (question.checkAnswer("userAnswer")) { // replace with actual user input
                user.increaseScore(question.getPoints());
            }
        }
    }
}
