package com.bryancommentz.android.cs245concentration;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    private Button try_again;
    private GameBoardFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        mFragment = (GameBoardFragment) fm.findFragmentById(R.id.fragment_container);

        if(mFragment == null){
            mFragment = new GameBoardFragment();
            fm.beginTransaction().add(R.id.fragment_container, mFragment).commit();
        }

        try_again = (Button) findViewById(R.id.try_again);
        try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragment.tryAgain();
            }
        });

    }
}
