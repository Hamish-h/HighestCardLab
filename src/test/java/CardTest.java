import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void cardHasValue(){
        assertEquals(10, card.getValueFromEnum());
    }
}
