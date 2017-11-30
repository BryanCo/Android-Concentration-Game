package com.bryancommentz.android.cs245concentration;

/***************************************************************
 * file: ScoreDbSchema.java
 * author: Bryan Commentz
 *
 * assignment: program 2 Android Project
 * date last modified: 11/20/2017
 *
 * purpose: This defines the design of the database.
 *
 ****************************************************************/

public class ScoreDbSchema {
    public static final class ScoreTable {
        public static final String NAME = "scores";

        public static final class Cols {
            public static final String UUID = "name";
            public static final String SCORE = "score";
        }
    }
}
