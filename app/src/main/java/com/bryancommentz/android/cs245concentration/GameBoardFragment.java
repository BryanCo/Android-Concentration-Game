package com.bryancommentz.android.cs245concentration;

import android.app.Dialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.bryancommentz.android.cs245concentration.ScoreDbSchema.ScoreTable.Cols.SCORE;
import static com.bryancommentz.android.cs245concentration.ScoreDbSchema.ScoreTable.Cols.UUID;

/***************************************************************
 * file: GameBoardFragment.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: GameBoardFragment is the abstract parent of the
 * controller for the game.  A new instance of one of its child
 * classes is created for each new game.
 *
 ****************************************************************/

public class GameBoardFragment extends Fragment {
    protected static final String SCORE_INDEX = "score";
    protected static final String CARDS_FLIPPED_INDEX = "cards_flipped";
    protected int iScore;
    protected int iNumberOfCards;
    protected TextView mScoreBoard;
    protected ImageButton[] mCard;
    protected CardBank mCardBank;
    protected int iCardsFlipped;

    //This is the constructor
    public GameBoardFragment(){
        Log.d("GameBoardFragment", "Constructor Run");
        this.iScore = 0;
        this.iCardsFlipped = 0;
    }

    //this makes it easier to match the layout cards labeled 1-20
    // with the array indexed 0-19
    protected int getCardIndex(int index){
        return index-1;
    }

    //If card at index is not a match flip it back over
    private void tryAgainCard(int index){
        if(!mCardBank.getCardAt(getCardIndex(index)).isMatch()){
            mCard[getCardIndex(index)].setBackgroundResource(R.drawable.cardback);
            mCardBank.getCardAt(getCardIndex(index)).tryAgainFlip();
        }
    }

    //run through all the cards and flip them back over when "Try Again" is pressed,
    //only if two cards have been flipped over. Subtract 1 from the Score.
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

    //if "End Game" is pressed show all of the cards, set them all to match so the game is over
    public void endGame(){
        Log.d("Fragment", "endGame()");
        for(int i = 1; i <= iNumberOfCards; i++){
            Card c = mCardBank.getCardAt(getCardIndex(i));
            c.endGameFlip();
            c.setMatch(true);
            mCard[getCardIndex(i)].setBackgroundResource(c.getImage());
        }
        iCardsFlipped = 2;
    }

    //detect if all cards are matched (the game is over)
    private boolean allCardsAreMatched(){
        for(int i = 0; i < iNumberOfCards; i++){
            if(!mCardBank.getCardAt(i).isMatch()){
                return false;
            }

        }
        return true;
    }

    //Creates a ContentValue object to store in the database. This is used during add a
    //score to the database.
    private static ContentValues getContentValues(String name, int iScore){
        ContentValues values = new ContentValues();
        values.put(UUID, name);
        values.put(SCORE, iScore);
        return values;

    }

    //addes the score to the database.
    private void addScoreToDb(String name, int iScore){
        SQLiteDatabase mDatabase = new ScoreDbHelper(this.getActivity()).getReadableDatabase();
        ContentValues values = getContentValues(name, iScore);
        mDatabase.insert(ScoreDbSchema.ScoreTable.NAME, null, values);
    }

    //when the game is finished ask the user for their name and add their score to the database
    protected void gameFinished(){
        final Dialog d = new Dialog(this.getActivity());
        d.setContentView(R.layout.dialog_highscore_name);
        final EditText nameBox = (EditText)d.findViewById(R.id.high_score_name);
        d.show();

        final Button btnHighScoreOK = (Button) d.findViewById(R.id.high_score_ok);
        btnHighScoreOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScoreToDb(nameBox.getText().toString(), iScore);
                ((MainActivity)getActivity()).showHighScores();
                d.dismiss();
            }
        });
    }

    //if fewer than 2 cards have been flipped flip the one at index over. if it is a match
    // call gameFinished().
    protected void flipCard(int index){
        if(iCardsFlipped < 2) {
            iCardsFlipped++;
            Card card = mCardBank.getCardAt(getCardIndex(index));
            card.isClicked();
            if(card.isMatch()){
                if(allCardsAreMatched()){
                    gameFinished();
                }
                iCardsFlipped = 0;
                iScore += 2;
                mScoreBoard.setText("Score: " + String.valueOf(iScore));

            }
            mCard[getCardIndex(index)].setBackgroundResource(card.getImage());
        }
    }


    //save score and iCardsFlipped when activity is destroyed.
    //Used to make the game persist correctly when the camera is turned.
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_INDEX, iScore);
        outState.putInt(CARDS_FLIPPED_INDEX, iCardsFlipped);
    }

    //What to do when the activity is created.
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
