import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }

    public int compareTo(Hand hand) {
        int thisHand = this.hand.stream()
                    .mapToInt(Card::getValue)
                    .sum();

        int thatHand = hand.hand.stream()
                    .mapToInt(Card::getValue)
                    .sum();

        return thisHand - thatHand;
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
