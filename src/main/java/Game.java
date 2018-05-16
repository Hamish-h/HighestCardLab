import java.util.HashMap;

public class Game {
    private  HashMap<String, Card> players;
    private Deck deck;

    public Game(HashMap players, Deck deck){
        players = new HashMap();
        deck = new Deck();
    }
}
