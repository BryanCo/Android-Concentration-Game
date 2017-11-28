package com.bryancommentz.android.cs245concentration;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
    private Button try_again;
    private Button new_game;
    private Button end_game;
    private FragmentManager fm;
    private GameBoardFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate()");
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        mFragment = (GameBoardFragment) fm.findFragmentById(R.id.fragment_container);

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
                final Dialog d = new Dialog(MainActivity.this);
                d.setContentView(R.layout.activity_new_game_dialog);
                final TextView display = (TextView) d.findViewById(R.id.display);
                d.show();

                final Button lessCards = (Button) d.findViewById(R.id.less_cards);
                lessCards.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int iTempNumOfCards = Integer.parseInt((String)display.getText());
                        if(iTempNumOfCards > 4) {
                            display.setText(String.valueOf(iTempNumOfCards - 4));
                        }
                    }
                });

                final Button moreCards = (Button) d.findViewById(R.id.more_cards);
                moreCards.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int iTempNumOfCards = Integer.parseInt((String)display.getText());
                        if(iTempNumOfCards < 20) {
                            display.setText(String.valueOf(iTempNumOfCards + 4));
                        }
                    }
                });

                final Button start = (Button) d.findViewById(R.id.btn_start);
                start.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CardBank.get().newSetOfCards(Integer.parseInt((String)display.getText()));
                        switch(Integer.parseInt((String)display.getText())){
                            case 4: mFragment = new GameBoardFragmentX4();
                            break;
                            case 8: mFragment = new GameBoardFragmentX8();
                            break;
                            case 12: mFragment = new GameBoardFragmentX12();
                            break;
                            case 16: mFragment = new GameBoardFragmentX16();
                            break;
                            case 20: mFragment = new GameBoardFragmentX20();
                            break;
                        }
                        fm.beginTransaction().replace(R.id.fragment_container, mFragment).commit();
                        d.dismiss();
                    }
                });


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
