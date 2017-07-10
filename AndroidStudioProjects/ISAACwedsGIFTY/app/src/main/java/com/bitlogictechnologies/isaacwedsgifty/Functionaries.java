package com.bitlogictechnologies.isaacwedsgifty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DataStore.DataArray;

/**
 * Created by Mike-berg on 14/04/2017.
 */

public class Functionaries extends AppCompatActivity {
    private ImageView img_about;
    private ListView list;
    private SearchView word_sv;
    ImageView iv;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listWordHeader;
    HashMap<String, List<String>> listMeaningData;
    DataArray part1Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.functionaries_ui);

        iv=(ImageView) findViewById(R.id.imageView);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAboutScreen();
            }
        });

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expWordMeaning);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listWordHeader, listMeaningData);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listWordHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listWordHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listWordHeader.get(groupPosition)
                                + " : "
                                + listMeaningData.get(
                                listWordHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }


    //Method to add data to the expandable list-----------------------------------------------------

    /*
         * Preparing the list data
         */
    private void prepareListData() {
        listWordHeader = new ArrayList<String>();
        listMeaningData = new HashMap<String, List<String>>();

        part1Data=new DataArray();


        final String[] op=part1Data.func;
        final String[] ptco=part1Data.proto;
        final String[] mc=part1Data.mc;
        final String[] ca=part1Data.cake;
        final String[] mak=part1Data.makeup;
        final String[] gift=part1Data.gift;

        // Adding word data
        listWordHeader.add("Officiating Pastors");
        listWordHeader.add("Protocol");
        listWordHeader.add("Master of Ceremony");
        listWordHeader.add("Cake");
        listWordHeader.add("Bridal Make-Up");
        listWordHeader.add("Custodians of Gift");





        // Adding child data
        List<String>  a1 = new ArrayList<String>();
        List<String>  a2 = new ArrayList<String>();
        List<String>  a3 = new ArrayList<String>();
        List<String>  a4 = new ArrayList<String>();
        List<String>  a5 = new ArrayList<String>();
        List<String>  a6 = new ArrayList<String>();


        for(int count=0;count<op.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a1.add(count, nos + op[count]);
        }
        listMeaningData.put(listWordHeader.get(0), a1);

        for(int count=0;count<ptco.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a2.add(count, nos + ptco[count]);
        }

        for(int count=0;count<mc.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a3.add(count, nos + mc[count]);
        }

        for(int count=0;count<ca.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a4.add(count, nos + ca[count]);
        }

        for(int count=0;count<mak.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a5.add(count, nos + mak[count]);
        }

        for(int count=0;count<gift.length;count++){
            String nos=Integer.toString(count + 1)+".\t";
            a6.add(count, nos + gift[count]);
        }



        listMeaningData.put(listWordHeader.get(1), a2);
        listMeaningData.put(listWordHeader.get(2), a3);
        listMeaningData.put(listWordHeader.get(3), a4);
        listMeaningData.put(listWordHeader.get(4), a5);
        listMeaningData.put(listWordHeader.get(5), a6);


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
//Return to Main Hymn Page
        loadMenuScreen();

    }
}
