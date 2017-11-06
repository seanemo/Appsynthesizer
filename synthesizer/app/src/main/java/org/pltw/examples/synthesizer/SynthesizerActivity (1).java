package org.pltw.examples.synthesizer;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.media.MediaPlayer;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button mFButton;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpA;
    private MediaPlayer mpHE;
    private MediaPlayer mpHFS;
    private MediaPlayer mpD;
    private MediaPlayer mpCS;
    private MediaPlayer mpB;
    private MediaPlayer mpGS;
    private MediaPlayer mpFS;
    private MediaPlayer mpDS;
    private MediaPlayer mpG;
    private final int WHOLE_NOTE = 1000;

    private final int QUARTER_NOTE = 500;//actually half
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        mEButton = (Button)findViewById(R.id.eButton);
        mFButton = (Button)findViewById(R.id.fButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
    }
    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
    private void playNote(MediaPlayer note, int time) {
        try {
            note.seekTo(0);
            note.start();
            delayPlaying(time);
            note.pause();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "E Button Clicked");
        mpE.start();

    }
    public void onButton2Click(View v){
        mpF.seekTo(0);
        Log.i(TAG, "F Button Clicked");
        mpF.start();
    }
    public void onChallenge1Click(View v) {//Matthew
        Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
        try {/*This is not the same as challenge 1,
            notes are changed(I assumed that it was Major
            E scale so I changed some of the notes. Major E has
            F sharp, G sharp, C sharp, and D sharp. But the
            challenge only asked for F sharp and C sharp.*/
            playNote(mpE, QUARTER_NOTE);
            playNote(mpFS, QUARTER_NOTE);
            playNote(mpGS, QUARTER_NOTE);
            playNote(mpA, QUARTER_NOTE);
            playNote(mpB, QUARTER_NOTE);
            playNote(mpCS, QUARTER_NOTE);
            playNote(mpDS, QUARTER_NOTE);
            playNote(mpHE, QUARTER_NOTE);
            delayPlaying(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge5Click(View v) {//Harsha
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        try {
            playNote(mpA, QUARTER_NOTE);
            playNote(mpA, QUARTER_NOTE);;
            playNote(mpHE, QUARTER_NOTE);
            playNote(mpHE, QUARTER_NOTE);
            playNote(mpHFS, QUARTER_NOTE);
            playNote(mpHFS, QUARTER_NOTE);
            playNote(mpHE, QUARTER_NOTE);
            playNote(mpD, QUARTER_NOTE);
            playNote(mpD, QUARTER_NOTE);
            playNote(mpCS, QUARTER_NOTE);
            playNote(mpCS, QUARTER_NOTE);
            playNote(mpB, QUARTER_NOTE);
            playNote(mpB, QUARTER_NOTE);
            playNote(mpA, QUARTER_NOTE);
            delayPlaying(10);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge12Click(View v) {//Adrian
        Log.e("SynthesizerActivity", "Challenge 12 Button clicked");
        try {
            for(int i = 0; i < 2; ++i) {
                playNote(mpA, QUARTER_NOTE);
                playNote(mpGS, QUARTER_NOTE);
                playNote(mpA, QUARTER_NOTE);
                playNote(mpGS, QUARTER_NOTE);
                playNote(mpA, QUARTER_NOTE);
                playNote(mpE, QUARTER_NOTE);
                playNote(mpA, QUARTER_NOTE);
                playNote(mpD, 3500);
                playNote(mpA, QUARTER_NOTE);
                playNote(mpCS, QUARTER_NOTE);
            }
            playNote(mpA, QUARTER_NOTE);
            playNote(mpGS, QUARTER_NOTE);
            playNote(mpA, WHOLE_NOTE);
            playNote(mpGS, QUARTER_NOTE);
            playNote(mpA, WHOLE_NOTE);
            playNote(mpD, QUARTER_NOTE);
            playNote(mpGS, QUARTER_NOTE);
            playNote(mpD, QUARTER_NOTE);
            mpE.start();
            mpA.start();
            delayPlaying(850);
            mpA.pause();
            mpE.pause();
            playNote(mpCS, QUARTER_NOTE);
            mpGS.start();
            mpB.start();
            delayPlaying(850);
            mpB.pause();
            mpGS.pause();
            playNote(mpA, QUARTER_NOTE);
            playNote(mpGS, QUARTER_NOTE);
            playNote(mpA, QUARTER_NOTE);
            playNote(mpE, QUARTER_NOTE);
            playNote(mpA, QUARTER_NOTE);
            playNote(mpB, QUARTER_NOTE);
            playNote(mpCS, WHOLE_NOTE);
            playNote(mpCS, QUARTER_NOTE);
            playNote(mpD, QUARTER_NOTE);
            playNote(mpE, WHOLE_NOTE);
            playNote(mpD, QUARTER_NOTE);
            playNote(mpCS, QUARTER_NOTE);
            playNote(mpB, 1100);
            delayPlaying(10);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge9Clicked (View v) {
        Log.e("SynthesizerActivity", "Challenge 9 Button clicked");
        android.media.MediaPlayer a[] = {mpA,mpA,mpHE,mpHE,mpHFS, mpHFS, mpHE, mpD, mpD, mpCS, mpCS, mpB, mpB, mpA,mpHE,mpHE,mpD,mpD,mpCS,mpCS,mpB,mpHE,mpHE,mpD,mpD,mpCS,mpCS,mpB,mpA,mpA,mpHE,mpHE,mpHFS, mpHFS, mpHE, mpD, mpD, mpCS, mpCS, mpB, mpB, mpA};

        try{

            for (int i = 0; i < a.length; i++) {
                playNote(a[i], QUARTER_NOTE);

            }
            delayPlaying(10);

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
