package com.bryancommentz.android.cs245concentration;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/***************************************************************
 * file: Card.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: Card is a class that is an observer and observable
 * and is the logical model of a card. In CardBank this card needs
 * to be paired with another card. This card will observe if its
 * partner is flipped and keep track if it is part of a match.
 *
 ****************************************************************/

public class Card extends Observable implements Observer {
    private int mImage = R.drawable.cardback;
    private int mCardWord;
    private boolean mIsMatch = false;

    //The constructor
    public Card(int mCardWord){
        this.mCardWord = mCardWord;
    }

    //flips the card back over when try again is clicked
    public void tryAgainFlip(){
        mImage = R.drawable.cardback;
    }

    //returns the current image of the card.
    public int getImage() {
        Log.d("Card()", "getImage()");
        return mImage;
    }

    //returns mIsMatch
    public boolean isMatch() {
        return mIsMatch;
    }

    //sets the value of mIsMatch
    public void setMatch(boolean match) {
        mIsMatch = match;
    }

    //when card is clicked
    public void isClicked(){
        mImage = mCardWord;
        setChanged();
        notifyObservers();
    }

    //show word side of card.
    public void endGameFlip(){
        mImage = mCardWord;
    }

    //when its partner is flipped over this card observes and notes it is pard of a match
    //and it is this cards responsibiity to set its partner's mIsMatch to true.
    @Override
    public void update(Observable observable, Object o) {
        Card c = (Card) observable;
        if(c.getImage() == mImage){
            Log.d("Card()", "updated()");
            mIsMatch = true;
            c.setMatch(true);
        }
    }
}
