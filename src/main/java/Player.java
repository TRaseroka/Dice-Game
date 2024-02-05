public class Player {
    private String name;
    private int score = 0;

    public Player(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public void addScore(int points) {
        score += points;
    }

    public void subtractScore(int points) {
        score -= points;
    }
}
