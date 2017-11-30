package com.bryancommentz.android.cs245concentration;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * This class was provided by the instuctor
 */

public class AudioPlayer {
    private MediaPlayer mPlayer;
    private static AudioPlayer sAudioPlayer;

    private AudioPlayer(){
    }

    public static AudioPlayer get(){
        if(sAudioPlayer == null){
            synchronized (AudioPlayer.class){
                if(sAudioPlayer == null){
                    sAudioPlayer = new AudioPlayer();
                }
            }
        }
        return sAudioPlayer;
    }


    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
    public void play(Context c) {
        mPlayer = MediaPlayer.create(
                c, R.raw.menuloop);
        mPlayer.setLooping(true);
        mPlayer.start();
    }
}
