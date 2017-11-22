package com.bryancommentz.android.cs245concentration;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class GameBoardFragment extends Fragment {
    private String[] mCards;
    private ImageButton mCard_1;
    private ImageButton mCard_2;
    private ImageButton mCard_3;
    private ImageButton mCard_4;
    private ImageButton mCard_5;
    private ImageButton mCard_6;
    private ImageButton mCard_7;
    private ImageButton mCard_8;
    private ImageButton mCard_9;
    private ImageButton mCard_10;
    private ImageButton mCard_11;
    private ImageButton mCard_12;
    private ImageButton mCard_13;
    private ImageButton mCard_14;
    private ImageButton mCard_15;
    private ImageButton mCard_16;
    private ImageButton mCard_17;
    private ImageButton mCard_18;
    private ImageButton mCard_19;
    private ImageButton mCard_20;

    public void tryAgain(){
        mCard_1.setBackgroundResource(R.drawable.cardback);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gameboard,container, false);
        mCard_1 = (ImageButton) v.findViewById(R.id.card_1);
        mCard_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_1.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_2 = (ImageButton) v.findViewById(R.id.card_2);
        mCard_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_2.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_3 = (ImageButton) v.findViewById(R.id.card_3);
        mCard_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_3.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_4 = (ImageButton) v.findViewById(R.id.card_4);
        mCard_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_4.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_5 = (ImageButton) v.findViewById(R.id.card_5);
        mCard_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_5.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_6 = (ImageButton) v.findViewById(R.id.card_6);
        mCard_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_6.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_7 = (ImageButton) v.findViewById(R.id.card_7);
        mCard_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_7.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_8 = (ImageButton) v.findViewById(R.id.card_8);
        mCard_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_8.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_9 = (ImageButton) v.findViewById(R.id.card_9);
        mCard_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_9.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_10 = (ImageButton) v.findViewById(R.id.card_10);
        mCard_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_10.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_11 = (ImageButton) v.findViewById(R.id.card_11);
        mCard_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_11.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_12 = (ImageButton) v.findViewById(R.id.card_12);
        mCard_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_12.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_13 = (ImageButton) v.findViewById(R.id.card_13);
        mCard_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_13.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_14 = (ImageButton) v.findViewById(R.id.card_14);
        mCard_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_14.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_15 = (ImageButton) v.findViewById(R.id.card_15);
        mCard_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_15.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_16 = (ImageButton) v.findViewById(R.id.card_16);
        mCard_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_16.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_17 = (ImageButton) v.findViewById(R.id.card_17);
        mCard_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_17.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_18 = (ImageButton) v.findViewById(R.id.card_18);
        mCard_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_18.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_19 = (ImageButton) v.findViewById(R.id.card_19);
        mCard_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_19.setBackgroundResource(R.drawable.hampster);
            }
        });

        mCard_20 = (ImageButton) v.findViewById(R.id.card_20);
        mCard_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCard_20.setBackgroundResource(R.drawable.hampster);
            }
        });

        return v;

    }


}
