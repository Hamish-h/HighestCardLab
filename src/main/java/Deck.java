import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card>deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<>();
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                deckOfCards.add(card);
            }
        }
    }

    public int cardCount(){
        return this.deckOfCards.size();
    }

    public void getCard(){
        Collections.shuffle(deckOfCards);
        deckOfCards.remove(0);
    }
}
