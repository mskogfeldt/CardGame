public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player();
        Player player2 = new Player();
        Deck deck1 = new Deck();
        deck1.generateDeck();
        player1.addCardToHand(deck1.dealACard());
        player2.addCardToHand(deck1.dealACard());

    }
}
