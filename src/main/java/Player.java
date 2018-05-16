public class Player {
    private String name;
    private Card card;

    public Player(String name, Card card){
        this.name = name;
        this.card = card;
    }

    public String getName(){
        return this.name;
    }

    public Card getCard() {
        return this.card;
    }
}
