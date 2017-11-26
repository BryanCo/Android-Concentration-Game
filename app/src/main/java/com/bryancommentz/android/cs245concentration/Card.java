package com.bryancommentz.android.cs245concentration;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Bryan on 11/25/2017.
 */

public class Card extends Observable implements Observer {
    private int mImage = R.drawable.cardback;
    private int mCardWord;
    private boolean mIsMatch = false;

    public Card(int mCardWord){
        this.mCardWord = mCardWord;
    }

    public void tryAgainFlip(){
        mImage = R.drawable.cardback;
    }

    public int getImage() {
        Log.d("Card()", "getImage()");
        return mImage;
    }

    public boolean isMatch() {
        return mIsMatch;
    }

    public void setMatch(boolean match) {
        mIsMatch = match;
    }

    public void isClicked(){
        mImage = mCardWord;
        setChanged();
        notifyObservers();
    }

    public void endGameFlip(){
        mImage = mCardWord;
    }

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
