import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;
    Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.EIGHT);
        player = new Player("Hamish", card);
        deck = new Deck();
    }

    @Test
    public void canGetName(){
        assertEquals("Hamish", player.getName());
    }

    @Test
    public void canGetCard(){
        assertEquals(card, player.getCard());
    }


}
