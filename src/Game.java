public class Game {
    public Game(){


    }
    public Player evalCards(Player player1, Player player2){
        Card tempcard1 = player1.playCardFromHand(0);
        Card tempcard2 = player2.playCardFromHand(0);
        if (tempcard1.getValue() > tempcard2.getValue()) return player1;
        if (tempcard2.getValue() > tempcard1.getValue()) return player2;
        if (tempcard1.getValue() == tempcard2.getValue()) return player1 + player2;
    }
}
