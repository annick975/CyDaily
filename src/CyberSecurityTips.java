import java.util.List;
import java.util.Random;

public class CyberSecurityTips {
    private List<String> tipsList;

    public CyberSecurityTips(List<String> tipsList) {
        this.tipsList = tipsList;
    }

    public void displayRandomTip() {
        Random random = new Random();
        int index = random.nextInt(tipsList.size());
        System.out.println("Cybersecurity Tip: " + tipsList.get(index));
    }
}
