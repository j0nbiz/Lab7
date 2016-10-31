package com.example.a1133611.labactivity7;


import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

import android.widget.ListView;

public class MainActivity extends Activity {

    ListView lv;
    Context context;

    ArrayList prgmName;


    //public String[] dinoNameList = {"dino1","dino2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;


        int[] dinoImages = {
                R.drawable.edmontonia,
                R.drawable.gastonia,
                R.drawable.giganotosaurus,
                R.drawable.gorgosaurus,
                R.drawable.minmi,
                R.drawable.saltasaurus,
                R.drawable.saurolophus,
                R.drawable.suchomimus,
                R.drawable.utahraptor,
                R.drawable.yangchuanosaurus};
        String[] dinoNameList = {
                getString(R.string.edmontonia),
                getString(R.string.gastonia),
                getString(R.string.giganotosaurus),
                getString(R.string.gorgosaurus),
                getString(R.string.minmi),
                getString(R.string.saltasaurus),
                getString(R.string.saurolophus),
                getString(R.string.suchomimus),
                getString(R.string.utahraptor),
                getString(R.string.yangchuanosaurus)};


        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new Adapter(this, dinoNameList, dinoImages));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}