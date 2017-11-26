package com.bryancommentz.android.cs245concentration;

import android.util.Log;

/**
 * Created by Bryan on 11/25/2017.
 */

public class CardBank {
    private static CardBank sCardBank;
    private Card[] mCards;

    private CardBank(){}

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

    public void newSetOfCards(int numberOfCards){
        if((numberOfCards % 4) != 0 ){
            //error
        }
        if(numberOfCards < 4){
            //error
        }
        mCards = new Card[numberOfCards];
        Log.d("CardBank", "newSetOfCards()");
        if(numberOfCards > 3){
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
        if(numberOfCards > 7){
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
        if(numberOfCards > 11){
            Card card9 = new Card(R.drawable.cat);
            Card card10= new Card(R.drawable.cat);
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
        if(numberOfCards > 15){
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
        if(numberOfCards > 19){
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

    public Card getCardAt(int index){
        return mCards[index];
    }
}
