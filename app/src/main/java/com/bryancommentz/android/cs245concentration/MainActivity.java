package com.bryancommentz.android.cs245concentration;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    private Button try_again;
    private Button new_game;
    private Button end_game;
    private FragmentManager fm;
    private GameBoardFragmentX20 mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate()");
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        mFragment = (GameBoardFragmentX20) fm.findFragmentById(R.id.fragment_container);

        if(mFragment == null){
            mFragment = new GameBoardFragmentX20();
            fm.beginTransaction().add(R.id.fragment_container, mFragment).commit();
        }

        try_again = (Button) findViewById(R.id.try_again);
        try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragment.tryAgain();
            }
        });

        new_game = (Button) findViewById(R.id.new_game);
        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragment = new GameBoardFragmentX20();
                fm.beginTransaction().add(R.id.fragment_container, mFragment).commit();
            }
        });

        end_game = (Button) findViewById(R.id.end_game);
        end_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity()", "end_game()");
                mFragment.endGame();
            }
        });
    }
}
