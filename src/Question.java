public abstract class Question {
    protected String questionText;
    protected int points;
    protected String correctAnswer;

    public Question(String questionText, int points, String correctAnswer) {
        this.questionText = questionText;
        this.points = points;
        this.correctAnswer = correctAnswer;
    }

    public abstract void askQuestion();
    public abstract boolean checkAnswer(String userAnswer);

    // Getters
    public String getQuestionText() { return questionText; }
    public int getPoints() { return points; }
    public String getCorrectAnswer() { return correctAnswer; }
}
