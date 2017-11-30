package com.bryancommentz.android.cs245concentration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.bryancommentz.android.cs245concentration.ScoreDbSchema.ScoreTable.NAME;

/***************************************************************
 * file: ScoreDbHelper.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: Creates a connection to the SQLite DB.
 *
 ****************************************************************/

public class ScoreDbHelper extends SQLiteOpenHelper{
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "scoreBase.db";

    public ScoreDbHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    //If no database has been created, create one
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + NAME + "(" +
                " _id integer primary key autoincrement, " +
                ScoreDbSchema.ScoreTable.Cols.UUID + ", " +
                ScoreDbSchema.ScoreTable.Cols.SCORE + ")" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
