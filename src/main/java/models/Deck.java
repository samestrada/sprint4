package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public java.util.List<Card> cards = new ArrayList<>();

    public Deck() {
        for(int i = 2; i < 15; i++){
            cards.add(new Card(i,Suit.Clubs));
            cards.add(new Card(i,Suit.Hearts));
            cards.add(new Card(i,Suit.Diamonds));
            cards.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    public void X(int x, int y, int z, String b) {
        Random rand = new Random();
        x = rand.nextInt(50) + 1;
        y = rand.nextInt(50) + 1;
//        z = rand.nextInt(50) + 1;
        for (int i = 0; i < 1000; i = i + x) {
            Card c = cards.remove(i);
            cards.add(y, c);
        }
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
