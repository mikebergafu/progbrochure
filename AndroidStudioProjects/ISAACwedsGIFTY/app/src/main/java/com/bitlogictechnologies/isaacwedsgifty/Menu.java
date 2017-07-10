package com.bitlogictechnologies.isaacwedsgifty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mike-berg on 14/04/2017.
 */

public class Menu extends AppCompatActivity {
    private int exitCount=0;
    TextView btnPart1, btnPart2, btnPart3, btnFunc;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_iu);

        btnPart1=(TextView) findViewById(R.id.btnPart1);
        btnPart2=(TextView) findViewById(R.id.btnPart2);
        btnPart3=(TextView) findViewById(R.id.btnPart3);
        btnFunc=(TextView) findViewById(R.id.btnFunction);
        iv=(ImageView) findViewById(R.id.imageView);

        btnPart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadP1Screen();
            }
        });



        btnPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadP2Screen();
            }
        });

        btnPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadP3Screen();
            }
        });

        btnFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFuncScreen();
            }
        });


        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAboutScreen();
            }
        });
    }


    //loads part one
    public void loadP1Screen(){
            Intent moth=new Intent();
            moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.PartOne");
            //moth.setClassName(this.getPackageName(), getLocalClassName());
            startActivity(moth);
            finish();
            System.exit(0);

    }

    //loads part two
    public void loadP2Screen(){
        Intent moth=new Intent();
        moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.PartTwo");
        //moth.setClassName(this.getPackageName(), getLocalClassName());
        startActivity(moth);
        finish();
        System.exit(0);

    }

    //loads part two
    public void loadP3Screen(){
        Intent moth=new Intent();
        moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.PartThree");
        //moth.setClassName(this.getPackageName(), getLocalClassName());
        startActivity(moth);
        finish();
        System.exit(0);

    }

    //loads part two
    public void loadFuncScreen(){
        Intent moth=new Intent();
        moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.Functionaries");
        //moth.setClassName(this.getPackageName(), getLocalClassName());
        startActivity(moth);
        finish();
        System.exit(0);

    }

    //loads About
    public void loadAboutScreen(){
        Intent moth=new Intent();
        moth.setClassName("com.bitlogictechnologies.isaacwedsgifty", "com.bitlogictechnologies.isaacwedsgifty.About");
        //moth.setClassName(this.getPackageName(), getLocalClassName());
        startActivity(moth);
        finish();
        System.exit(0);
    }
    @Override
    public void onBackPressed() {

        exitCount++;

        if (exitCount==1){
            Toast.makeText(this, "Press Again to Close App ",Toast.LENGTH_SHORT ).show();
        }
        else{
            finish();
            System.exit(0);
        }

    }
}
