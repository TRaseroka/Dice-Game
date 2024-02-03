public class PlayTurn<player> {
    Dice dice = new Dice();

    int player=0;

    public PlayTurn(int player1)
    {
        player=player1;
    }

    public void play()
    {

        int result= dice.roll();
        if (result==6)
        {
            play();
        }else
        {
            System.out.println("Better luck in next round,player:"+player+"its your turn ");
        }
    }




}
