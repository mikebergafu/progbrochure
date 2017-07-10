package com.bitlogictechnologies.isaacwedsgifty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private Timer t;
    private int TimeCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        autoScreenLoader();
    }



    //Timer automatically loads hymn plate after 5sec
    public void autoScreenLoader(){
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        // you can set it to a textView to show it to the user to see the time passing while he is writing
                        TimeCounter++;
                        loadScreen();
                    }
                });

            }
        }, 1000, 1000); // 1000 means start from 1 sec, and the second 1000 is do the loop each 1 sec.
    }


    //loads the hymn plate after 2 sec
    public void loadScreen(){
        if(TimeCounter > 0){
            Intent moth=new Intent();
            moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.Menu");
            //moth.setClassName(this.getPackageName(), getLocalClassName());
            startActivity(moth);
            t.cancel();
            finish();
            System.exit(0);
        }
    }
}
