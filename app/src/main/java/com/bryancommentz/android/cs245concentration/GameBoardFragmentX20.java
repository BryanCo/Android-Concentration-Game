package com.bryancommentz.android.cs245concentration;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/***************************************************************
 * file: GameBoardFragment20.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: This is the 20 card child of GameBoardFragment
 *
 ****************************************************************/

public class GameBoardFragmentX20 extends GameBoardFragment {

    //This is the constructor
    public GameBoardFragmentX20(){
        Log.d("GameBoardFragmentX20", "Constructor Run");
        iScore = 0;
        iCardsFlipped = 0;
        iNumberOfCards = 20;
        mCard = new ImageButton[iNumberOfCards];
    }

    //create a view with 20 cards
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gameboardx20,container, false);
        mScoreBoard = (TextView) v.findViewById(R.id.scoreView);
        mScoreBoard.setText("Score: " + String.valueOf(iScore));
        int index;

        index = 1;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_1);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(1);
            }
        });

        index = 2;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_2);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(2);
            }
        });

        index = 3;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_3);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(3);
            }
        });

        index = 4;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_4);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(4);
            }
        });

        index = 5;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_5);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(5);
            }
        });

        index = 6;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_6);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(6);
            }
        });

        index = 7;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_7);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(7);
            }
        });

        index = 8;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_8);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(8);
            }
        });

        index = 9;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_9);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(9);
            }
        });

        index = 10;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_10);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(10);
            }
        });

        index = 11;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_11);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(11);
            }
        });

        index = 12;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_12);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(12);
            }
        });

        index = 13;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_13);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(13);
            }
        });

        index = 14;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_14);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(14);
            }
        });

        index = 15;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_15);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(15);
            }
        });

        index = 16;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_16);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(16);
            }
        });

        index = 17;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_17);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(17);
            }
        });

        index = 18;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_18);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(18);
            }
        });

        index = 19;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_19);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(19);
            }
        });

        index = 20;
        mCard[getCardIndex(index)] = (ImageButton) v.findViewById(R.id.card_20);
        mCard[getCardIndex(index)].setBackgroundResource(
                mCardBank.getCardAt(getCardIndex(index)).getImage());
        mCard[getCardIndex(index)].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard(20);
            }
        });

        return v;

    }
}
