package com.example.czi_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.czi_list.listViewClasses.SH;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG =  "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        ListView listView = (ListView) findViewById(R.id.listView);

        SH sh1 = new SH("id1", "ownerID","shTitle","shDescription");

        ArrayList<SH> scavHolder = new ArrayList<>();
        scavHolder.add(sh1);

        scavHuntAdapter adapter = new scavHuntAdapter()


    }
}
