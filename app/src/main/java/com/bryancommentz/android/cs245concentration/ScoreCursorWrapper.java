package com.bryancommentz.android.cs245concentration;

import android.database.Cursor;
import android.database.CursorWrapper;

/***************************************************************
 * file: ScoreCursorWrapper.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: This wrapper creates nicely formatted strings from
 * cursor object returned from a query.
 *
 ****************************************************************/

public class ScoreCursorWrapper extends CursorWrapper {
    public ScoreCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    //make a Cursor entry into a nice string
    public String getScore(){
        String name = getString(getColumnIndex(ScoreDbSchema.ScoreTable.Cols.UUID));
        String score = getString(getColumnIndex(ScoreDbSchema.ScoreTable.Cols.SCORE));

        return name + " ... " + score;
    }
}
