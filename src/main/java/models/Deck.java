package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public java.util.List<Card> cards = new ArrayList<>();

    public Deck() {
        cards.add(new Card(2, Suit.Clubs));
        cards.add(new Card(3, Suit.Clubs));
        cards.add(new Card(4, Suit.Clubs));
        cards.add(new Card(5, Suit.Clubs));
        cards.add(new Card(6, Suit.Clubs));
        cards.add(new Card(7, Suit.Clubs));
        cards.add(new Card(8, Suit.Clubs));
        cards.add(new Card(9, Suit.Clubs));
        cards.add(new Card(10, Suit.Clubs));
        cards.add(new Card(11, Suit.Clubs));
        cards.add(new Card(12, Suit.Clubs));
        cards.add(new Card(13, Suit.Clubs));
        cards.add(new Card(14, Suit.Clubs));

        cards.add(new Card(2, Suit.Hearts));
        cards.add(new Card(3, Suit.Hearts));
        cards.add(new Card(4, Suit.Hearts));
        cards.add(new Card(5, Suit.Hearts));
        cards.add(new Card(6, Suit.Hearts));
        cards.add(new Card(7, Suit.Hearts));
        cards.add(new Card(8, Suit.Hearts));
        cards.add(new Card(9, Suit.Hearts));
        cards.add(new Card(10, Suit.Hearts));
        cards.add(new Card(11, Suit.Hearts));
        cards.add(new Card(12, Suit.Hearts));
        cards.add(new Card(13, Suit.Hearts));
        cards.add(new Card(14, Suit.Hearts));

        cards.add(new Card(2, Suit.Diamonds));
        cards.add(new Card(3, Suit.Diamonds));
        cards.add(new Card(4, Suit.Diamonds));
        cards.add(new Card(5, Suit.Diamonds));
        cards.add(new Card(6, Suit.Diamonds));
        cards.add(new Card(7, Suit.Diamonds));
        cards.add(new Card(8, Suit.Diamonds));
        cards.add(new Card(9, Suit.Diamonds));
        cards.add(new Card(10, Suit.Diamonds));
        cards.add(new Card(11, Suit.Diamonds));
        cards.add(new Card(12, Suit.Diamonds));
        cards.add(new Card(13, Suit.Diamonds));
        cards.add(new Card(14, Suit.Diamonds));

        cards.add(new Card(2, Suit.Spades));
        cards.add(new Card(3, Suit.Spades));
        cards.add(new Card(4, Suit.Spades));
        cards.add(new Card(5, Suit.Spades));
        cards.add(new Card(6, Suit.Spades));
        cards.add(new Card(7, Suit.Spades));
        cards.add(new Card(8, Suit.Spades));
        cards.add(new Card(9, Suit.Spades));
        cards.add(new Card(10, Suit.Spades));
        cards.add(new Card(11, Suit.Spades));
        cards.add(new Card(12, Suit.Spades));
        cards.add(new Card(13, Suit.Spades));
        cards.add(new Card(14, Suit.Spades));
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    public ArrayList<Card> dealFour() {
        ArrayList<Card> four = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (cards.size() > 0) {
                four.add(cards.get(i));
                cards.remove(i);
            }
        }
        return four;
    }
}
