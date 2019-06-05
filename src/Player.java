import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand = new ArrayList<>();
    int guess;
    int points;
    int stick;

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public Card playCardFromHand(int index){
        return hand.remove(index);
    }


}
20