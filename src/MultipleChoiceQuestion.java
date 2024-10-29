import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> choices;

    public MultipleChoiceQuestion(String questionText, int points, String correctAnswer, List<String> choices) {
        super(questionText, points, correctAnswer);
        this.choices = choices;
    }

    @Override
    public void askQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
