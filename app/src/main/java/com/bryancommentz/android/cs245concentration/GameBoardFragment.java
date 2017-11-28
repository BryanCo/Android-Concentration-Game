package com.bryancommentz.android.cs245concentration;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameBoardFragment extends Fragment {
    protected static final String SCORE_INDEX = "score";
    protected static final String CARDS_FLIPPED_INDEX = "cards_flipped";
    protected int iScore;
    protected int iNumberOfCards;
    protected TextView mScoreBoard;
    protected ImageButton[] mCard;
    protected CardBank mCardBank;
    protected int iCardsFlipped;

    public GameBoardFragment(){
        Log.d("GameBoardFragmentX20", "Constructor Run");
        this.iScore = 0;
        this.iCardsFlipped = 0;
    }

    protected int getCardIndex(int index){
        return index-1;
    }

    private void tryAgainCard(int index){
        if(!mCardBank.getCardAt(getCardIndex(index)).isMatch()){
            mCard[getCardIndex(index)].setBackgroundResource(R.drawable.cardback);
            mCardBank.getCardAt(getCardIndex(index)).tryAgainFlip();
        }
    }

    public void tryAgain(){
        if(iCardsFlipped == 2){
            if(iScore >= 1){
                iScore--;
                mScoreBoard.setText("Score: " + String.valueOf(iScore));
            }
            iCardsFlipped = 0;
            for(int i = 1; i <= iNumberOfCards; i++){
                tryAgainCard(i);
            }
        }

    }

    public void endGame(){
        Log.d("Fragment", "endGame()");
        for(int i = 1; i <= iNumberOfCards; i++){
            Card c = mCardBank.getCardAt(getCardIndex(i));
            c.endGameFlip();
            c.setMatch(true);
            mCard[getCardIndex(i)].setBackgroundResource(c.getImage());
        }
    }

    private boolean allCardsAreMatched(){
        for(int i = 0; i < iNumberOfCards; i++){
            if(!mCardBank.getCardAt(i).isMatch()){
                return false;
            }

        }
        return true;
    }

    protected void flipCard(int index){
        if(iCardsFlipped < 2) {
            iCardsFlipped++;
            Card card = mCardBank.getCardAt(getCardIndex(index));
            card.isClicked();
            if(card.isMatch()){
                if(allCardsAreMatched()){
                    //end game
                }
                iCardsFlipped = 0;
                iScore += 2;
                mScoreBoard.setText("Score: " + String.valueOf(iScore));

            }
            mCard[getCardIndex(index)].setBackgroundResource(card.getImage());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_INDEX, iScore);
        outState.putInt(CARDS_FLIPPED_INDEX, iCardsFlipped);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCardBank = CardBank.get();
        if(savedInstanceState != null){
            iScore = savedInstanceState.getInt(SCORE_INDEX, 0);
            iCardsFlipped = savedInstanceState.getInt(CARDS_FLIPPED_INDEX, 0);
        }
    }

}
