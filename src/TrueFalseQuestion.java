public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, int points, String correctAnswer) {
        super(questionText, points, correctAnswer);
    }

    @Override
    public void askQuestion() {
        System.out.println(questionText + " (True/False)");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
