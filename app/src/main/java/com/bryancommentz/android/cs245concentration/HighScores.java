package com.bryancommentz.android.cs245concentration;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/***************************************************************
 * file: HighScores.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/29/2017
 *
 * purpose: This queries the database for the 5 highest high
 * scores and displayes them.
 *
 * This is a child of GameBoardFragment but only so it
 * will fit in the fragment manager.
 *
 ****************************************************************/

public class HighScores extends GameBoardFragment {
    private TextView[] scores;
    private SQLiteDatabase mDatabase;

    //queries the for the 5 highest high scores.
    @NonNull
    private ScoreCursorWrapper query(){
        mDatabase = new ScoreDbHelper(this.getActivity()).getReadableDatabase();
        Cursor c =  mDatabase.query(
                ScoreDbSchema.ScoreTable.NAME,
                null,
                null,
                null,
                null,
                null,
                ScoreDbSchema.ScoreTable.Cols.SCORE + " DESC",
                "5");

        return new ScoreCursorWrapper(c);
    }

    //When this object is created query the database and populate TextViews accordingly
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_highscore_list, container, false);

        scores = new TextView[5];
        scores[0] = v.findViewById(R.id.highscore_1);
        scores[1] = v.findViewById(R.id.highscore_2);
        scores[2] = v.findViewById(R.id.highscore_3);
        scores[3] = v.findViewById(R.id.highscore_4);
        scores[4] = v.findViewById(R.id.highscore_5);

        ScoreCursorWrapper scw = query();

        try{
            int x = 0;
            scw.moveToFirst();
            while(!scw.isAfterLast()){
                scores[x].setText(Integer.toString(x+1) + ": " + scw.getScore());
                x++;
                scw.moveToNext();
            }
        } finally {
            scw.close();
        }

        return v;
    }
}
