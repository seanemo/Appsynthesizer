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
    }

    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
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
        try {
            mpE.start();
            delayPlaying(QUARTER_NOTE);
            mpE.pause();
            mpFS.start();
            delayPlaying(QUARTER_NOTE);
            mpFS.pause();
            mpG.start();
            delayPlaying(QUARTER_NOTE);
            mpG.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpB.start();
            delayPlaying(QUARTER_NOTE);
            mpB.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpHE.start();
            delayPlaying(QUARTER_NOTE);
            mpHE.pause();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge5Click(View v) {//Harsha
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        try {
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpHE.start();
            delayPlaying(QUARTER_NOTE);
            mpHE.pause();
            mpHE.seekTo(0);
            mpHE.start();
            delayPlaying(QUARTER_NOTE);
            mpHE.pause();
            mpHFS.start();
            delayPlaying(QUARTER_NOTE);
            mpHFS.pause();
            mpHFS.seekTo(0);
            mpHFS.start();
            delayPlaying(QUARTER_NOTE);
            mpHFS.pause();
            mpHE.start();
            delayPlaying(QUARTER_NOTE);
            mpHE.pause();

            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpCS.seekTo(0);
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpB.start();
            delayPlaying(QUARTER_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(QUARTER_NOTE);
            mpB.pause();
            mpA.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge12Click(View v) {//Adrian
        Log.e("SynthesizerActivity", "Challenge 12 Button clicked");
        try {
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpE.start();
            delayPlaying(QUARTER_NOTE);
            mpE.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpD.start();
            delayPlaying(3500);
            mpD.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpE.start();
            delayPlaying(QUARTER_NOTE);
            mpE.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpD.start();
            delayPlaying(3500);
            mpD.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpE.start();
            mpA.start();
            delayPlaying(850);
            mpA.pause();
            mpE.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpGS.start();
            mpB.start();
            delayPlaying(850);
            mpB.pause();
            mpGS.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpGS.start();
            delayPlaying(QUARTER_NOTE);
            mpGS.pause();
            mpA.start();
            delayPlaying(1000);
            mpA.pause();
            mpE.start();
            delayPlaying(QUARTER_NOTE);
            mpE.pause();
            mpA.start();
            delayPlaying(QUARTER_NOTE);
            mpA.pause();
            mpB.start();
            delayPlaying(QUARTER_NOTE);
            mpB.pause();
            mpCS.start();
            delayPlaying(900);
            mpCS.pause();
            mpCS.seekTo(0);
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpE.start();
            delayPlaying(900);
            mpE.pause();
            mpD.start();
            delayPlaying(QUARTER_NOTE);
            mpD.pause();
            mpCS.start();
            delayPlaying(QUARTER_NOTE);
            mpCS.pause();
            mpB.start();
            delayPlaying(1100);
            mpB.pause();



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onChallenge9Clicked (View v) {
        Log.e("SynthesizerActivity", "Challenge 9 Button clicked");
        android.media.MediaPlayer a[] = {mpA,mpA,mpHE,mpHE,mpHFS, mpHFS, mpHE, mpD, mpD, mpCS, mpCS, mpB, mpB, mpA,mpHE,mpHE,mpD,mpD,mpCS,mpCS,mpB,mpHE,mpHE,mpD,mpD,mpCS,mpCS,mpB,mpA,mpA,mpHE,mpHE,mpHFS, mpHFS, mpHE, mpD, mpD, mpCS, mpCS, mpB, mpB, mpA};

        try{

            for (int i = 0; i < a.length; i++) {
                a[i].seekTo(0);
                a[i].start();
                delayPlaying(WHOLE_NOTE);
                a[i].pause();

            }



        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
