package Model;

public class Player {
    private String user;
    private int score;

    {
        score = 0;
    }

    public Player(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }
}
