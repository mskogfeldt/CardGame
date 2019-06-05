import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> deckOfCards = new ArrayList<>();
    public Card dealACard(){
        return deckOfCards.remove(0);

    }

    public void generateDeck(){
    for (int i = 2; i < 15; i++){
        deckOfCards.add(new Hearts(i));
        deckOfCards.add(new Spades(i));
        deckOfCards.add(new Dimonds(i));
        deckOfCards.add(new Clubs(i));
        }

    }

}
