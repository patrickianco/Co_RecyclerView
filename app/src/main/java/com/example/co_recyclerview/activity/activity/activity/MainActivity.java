package com.example.co_recyclerview.activity.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.co_recyclerview.R;
import com.example.co_recyclerview.activity.activity.adapter.CustomAdapter;
import com.example.co_recyclerview.activity.activity.model.AndroidVersion;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView androidView;
    int [] logo;
    String [] codename, version, api, released_date;
    ArrayList<AndroidVersion> androidLst;
    CustomAdapter adapter;
    LinearLayoutManager lm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidLst = new ArrayList<AndroidVersion>();
        androidView =(RecyclerView) findViewById(R.id.androidView);
        logo = new int [] {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
                R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecreamsandwich,
                R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow,
                R.drawable.nougat, R.drawable.oreo};
        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        released_date = getResources().getStringArray(R.array.released_date);

        for(int i = 0; i < codename.length; i++){
            androidLst.add(new AndroidVersion(logo[i], codename[i], version[i], api[i], released_date[i]));
        }

        adapter = new CustomAdapter(androidLst);

        lm = new LinearLayoutManager(this);
        androidView.setLayoutManager(lm);
        androidView.setHasFixedSize(true);

        androidView.setAdapter(adapter);

    }
}
