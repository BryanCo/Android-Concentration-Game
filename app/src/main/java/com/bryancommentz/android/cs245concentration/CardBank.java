package com.bryancommentz.android.cs245concentration;

import android.util.Log;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/***************************************************************
 * file: CardBank.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: CardBank is a singlton that generated and holds a
 * set of paired cards. It constitutes the persistant model for
 * GameBoardFragment (which constitutes the controller layer).
 *
 ****************************************************************/

public class CardBank {
    private static CardBank sCardBank;
    private Card[] mCards;

    //This is a singleton so it has a private constructor
    private CardBank(){
        newSetOfCards(20);
    }

    //This is a singleton so it needs a get method to return itself
    // or create itself if not done so already.
    //It uses a synchronized to ensure two of itself are not made.
    public static CardBank get(){
        if(sCardBank == null){
            synchronized (CardBank.class){
                if(sCardBank == null){
                    Log.d("CardBank","CardBank created()");
                    sCardBank = new CardBank();

                }
            }

        }
        return sCardBank;
    }

    //when a new set of cards are needed this singleton still persists
    //so it generates a new set.
    public void newSetOfCards(int numberOfCards){
        if((numberOfCards % 4) == 0 && numberOfCards >= 4) {
            mCards = new Card[numberOfCards];
            Log.d("CardBank", "newSetOfCards()");
            if (numberOfCards > 3) {
                Card card1 = new Card(R.drawable.hampster);
                Card card2 = new Card(R.drawable.hampster);
                Card card3 = new Card(R.drawable.rat);
                Card card4 = new Card(R.drawable.rat);
                card1.addObserver(card2);
                card2.addObserver(card1);
                card3.addObserver(card4);
                card4.addObserver(card3);
                mCards[0] = card1;
                mCards[1] = card2;
                mCards[2] = card3;
                mCards[3] = card4;
                Log.d("CardBank", "newSetOfCards(4)");
            }
            if (numberOfCards > 7) {
                Card card5 = new Card(R.drawable.fish);
                Card card6 = new Card(R.drawable.fish);
                Card card7 = new Card(R.drawable.penguin);
                Card card8 = new Card(R.drawable.penguin);
                card5.addObserver(card6);
                card6.addObserver(card5);
                card7.addObserver(card8);
                card8.addObserver(card7);
                mCards[4] = card5;
                mCards[5] = card6;
                mCards[6] = card7;
                mCards[7] = card8;
                Log.d("CardBank", "newSetOfCards(8)");
            }
            if (numberOfCards > 11) {
                Card card9 = new Card(R.drawable.cat);
                Card card10 = new Card(R.drawable.cat);
                Card card11 = new Card(R.drawable.dog);
                Card card12 = new Card(R.drawable.dog);
                card9.addObserver(card10);
                card10.addObserver(card9);
                card11.addObserver(card12);
                card12.addObserver(card11);
                mCards[8] = card9;
                mCards[9] = card10;
                mCards[10] = card11;
                mCards[11] = card12;
                Log.d("CardBank", "newSetOfCards(12)");
            }
            if (numberOfCards > 15) {
                Card card13 = new Card(R.drawable.hippo);
                Card card14 = new Card(R.drawable.hippo);
                Card card15 = new Card(R.drawable.koala);
                Card card16 = new Card(R.drawable.koala);
                card13.addObserver(card14);
                card14.addObserver(card13);
                card15.addObserver(card16);
                card16.addObserver(card15);
                mCards[12] = card13;
                mCards[13] = card14;
                mCards[14] = card15;
                mCards[15] = card16;
                Log.d("CardBank", "newSetOfCards(16)");
            }
            if (numberOfCards > 19) {
                Card card17 = new Card(R.drawable.lion);
                Card card18 = new Card(R.drawable.lion);
                Card card19 = new Card(R.drawable.panda);
                Card card20 = new Card(R.drawable.panda);
                card17.addObserver(card18);
                card18.addObserver(card17);
                card19.addObserver(card20);
                card20.addObserver(card19);
                mCards[16] = card17;
                mCards[17] = card18;
                mCards[18] = card19;
                mCards[19] = card20;
                Log.d("CardBank", "newSetOfCards(20)");
            }
        }
        Random rnd = new Random();
        for (int i = mCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            Card a = mCards[index];
            mCards[index] = mCards[i];
            mCards[i] = a;
        }

    }

    //Returns a specific card the CardBank is holding.
    public Card getCardAt(int index){
        return mCards[index];
    }
}
