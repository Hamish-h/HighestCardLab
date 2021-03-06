import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canCountCards(){
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canGetCardFromDeck(){
        deck.getCard();
        assertEquals(51, deck.cardCount());
    }
}
