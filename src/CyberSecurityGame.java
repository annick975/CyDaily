import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CyberSecurityGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize User
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        User player = new User(username);

        // Initialize Questions
        List<String> choices1 = List.of("A: Phishing is a scam by which an email user is duped into revealing personal information",
                "B: Phishing is a method of communication",
                "C: Phishing is a type of hardware",
                "D: Phishing is a tool used for programming");
        Question q1 = new MultipleChoiceQuestion("What is phishing?", 10, "A", choices1);

        Question q2 = new TrueFalseQuestion("Is it safe to share passwords?", 5, "False");

        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);

        // Initialize Quiz Game
        QuizGame quizGame = new QuizGame("Cybersecurity Basics", "Learn the basics of cybersecurity", 1, questions);

        // Initialize Leaderboard
        Leaderboard leaderboard = new Leaderboard();

        // Initialize Cybersecurity Tips
        List<String> tipsList = List.of(
                "Use strong, unique passwords for each account.",
                "Always verify email senders before clicking links.",
                "Avoid downloading attachments from unknown sources."
        );
        CyberSecurityTips tips = new CyberSecurityTips(tipsList);

        // Start Game
        quizGame.displayRules();
        quizGame.startGame();

        // Ask Questions and Capture User Input
        for (Question question : questions) {
            question.askQuestion();

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                player.increaseScore(question.getPoints());
            } else {
                System.out.println("Incorrect.");
                player.decreaseScore(1); // Optional: Decrease score on wrong answer
            }
        }

        // End Game and Display Final Score
        quizGame.calculateScore(player);
        quizGame.endGame();
        System.out.println(player.getUsername() + "'s final score: " + player.getScore());

        // Add player to the leaderboard and display it
        leaderboard.addUser(player);
        leaderboard.displayLeaderboard();

        // Display a random cybersecurity tip
        tips.displayRandomTip();

        scanner.close(); // Close the scanner
    }
}
