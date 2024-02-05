public class PlayTurn {

    private Dice dice = new Dice();

    private int score = 0;

    public PlayTurn() {

    }

    public void play(Player player) {
        boolean hasExtraTurn = false;
        while (!hasExtraTurn) {
            int result = dice.roll();
            System.out.println(player.getName() + " rolled a " + result);

          if (result == 6) {
                player.addScore(10);
                System.out.println(player.getName()+ " scores 10 points! (Total: " + score + ")");
                hasExtraTurn = true;
              {
                  play(player);// Grant one extra turn
              }
            } else if (result == 3) {
                    player.subtractScore(5);
                System.out.println(player.getName() + " loses 5 points! (Total: " + score + ")");
            }


            break;

        }
    }


}

