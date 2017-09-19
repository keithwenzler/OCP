public class Card {

    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Card)) {
            return false;
        }
        Card card = (Card)object;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    public int hashCode() {
        return rank.hashCode();
    }

}
