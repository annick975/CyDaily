import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    private List<User> topUsers;

    public Leaderboard() {
        topUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        topUsers.add(user);
    }

    public void displayLeaderboard() {
        System.out.println("Leaderboard:");
        for (User user : topUsers) {
            System.out.println(user.getUsername() + " - Score: " + user.getScore());
        }
    }
}
