package com.bitlogictechnologies.isaacwedsgifty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Mike-berg on 14/04/2017.
 */

public class About extends AppCompatActivity {
    private int exitCount=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_ui);


    }




    //loads part one
    public void loadMenuScreen(){
        Intent moth=new Intent();
        moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.Menu");
        //moth.setClassName(this.getPackageName(), getLocalClassName());
        startActivity(moth);
        finish();
        System.exit(0);

    }


    @Override
    public void onBackPressed() {
//Return to Main Hymn Page
        loadMenuScreen();

    }

}
