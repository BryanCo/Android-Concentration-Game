package com.bryancommentz.android.cs245concentration;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class GameBoardFragmentX20 extends Fragment {
    int numberOfCards = 20;
    private ImageButton[] mCard = new ImageButton[numberOfCards];
    private CardBank mCardBank;
    private int iCardsFlipped=0;

    private int getCardIndex(int index){
        return index-1;
    }

    private void tryAgainCard(int index){
        if(!mCardBank.getCardAt(getCardIndex(index)).isMatch()){
            mCard[getCardIndex(index)].setBackgroundResource(R.drawable.cardback);
            mCardBank.getCardAt(getCardIndex(index)).tryAgainFlip();
        }
    }

    public void tryAgain(){
        iCardsFlipped = 0;
        for(int i = 1; i <= numberOfCards; i++){
            tryAgainCard(i);
        }
    }

    public void endGame(){
        Log.d("Fragment", "endGame()");
        for(int i = 1; i <= numberOfCards; i++){
            Card c = mCardBank.getCardAt(getCardIndex(i));
            c.endGameFlip();
            c.setMatch(true);
            mCard[getCardIndex(i)].setBackgroundResource(c.getImage());
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCardBank = CardBank.get();
        mCardBank.newSetOfCards(numberOfCards);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gameboard,container, false);
        mCard[getCardIndex(1)] = (ImageButton) v.findViewById(R.id.card_1);
        mCard[getCardIndex(1)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(1));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(1)].setBackgroundResource(card.getImage());
                }
            }
        });

        mCard[getCardIndex(2)] = (ImageButton) v.findViewById(R.id.card_2);
        mCard[getCardIndex(2)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(2));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(2)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(3)] = (ImageButton) v.findViewById(R.id.card_3);
        mCard[getCardIndex(3)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(3));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(3)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(4)] = (ImageButton) v.findViewById(R.id.card_4);
        mCard[getCardIndex(4)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(4));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(4)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(5)] = (ImageButton) v.findViewById(R.id.card_5);
        mCard[getCardIndex(5)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(5));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(5)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(6)] = (ImageButton) v.findViewById(R.id.card_6);
        mCard[getCardIndex(6)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(6));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(6)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(7)] = (ImageButton) v.findViewById(R.id.card_7);
        mCard[getCardIndex(7)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(7));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(7)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(8)] = (ImageButton) v.findViewById(R.id.card_8);
        mCard[getCardIndex(8)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(8));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(8)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(9)] = (ImageButton) v.findViewById(R.id.card_9);
        mCard[getCardIndex(9)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(9));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(9)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(10)] = (ImageButton) v.findViewById(R.id.card_10);
        mCard[getCardIndex(10)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(10));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(10)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(11)] = (ImageButton) v.findViewById(R.id.card_11);
        mCard[getCardIndex(11)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(11));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(11)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(12)] = (ImageButton) v.findViewById(R.id.card_12);
        mCard[getCardIndex(12)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(12));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(12)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(13)] = (ImageButton) v.findViewById(R.id.card_13);
        mCard[getCardIndex(13)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(13));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(13)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(14)] = (ImageButton) v.findViewById(R.id.card_14);
        mCard[getCardIndex(14)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(14));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(14)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(15)] = (ImageButton) v.findViewById(R.id.card_15);
        mCard[getCardIndex(15)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(15));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(15)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(16)] = (ImageButton) v.findViewById(R.id.card_16);
        mCard[getCardIndex(16)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(16));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(16)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(17)] = (ImageButton) v.findViewById(R.id.card_17);
        mCard[getCardIndex(17)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(17));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(17)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(18)] = (ImageButton) v.findViewById(R.id.card_18);
        mCard[getCardIndex(18)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(18));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(18)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(19)] = (ImageButton) v.findViewById(R.id.card_19);
        mCard[getCardIndex(19)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(19));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(19)].setBackgroundResource(card.getImage());
                }

            }
        });

        mCard[getCardIndex(20)] = (ImageButton) v.findViewById(R.id.card_20);
        mCard[getCardIndex(20)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iCardsFlipped < 2){
                    iCardsFlipped++;
                    Card card = mCardBank.getCardAt(getCardIndex(20));
                    card.isClicked();
                    if(card.isMatch()){
                        iCardsFlipped = 0;
                    }
                    mCard[getCardIndex(20)].setBackgroundResource(card.getImage());
                }

            }
        });

        return v;

    }

}
