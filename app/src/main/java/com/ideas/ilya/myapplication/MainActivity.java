package com.ideas.ilya.myapplication;

import android.content.Context;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = (RecyclerView) findViewById(R.id.simple_list);
        //Без этого падает
        list.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Pair<String, String>> items = new ArrayList<>();
        items.add(new Pair<>("asd", "asd"));
        items.add(new Pair<>("asd1", "asd"));
        items.add(new Pair<>("asd2", "asd"));
        items.add(new Pair<>("asd3", "asd"));
        items.add(new Pair<>("asd4", "asd"));

        SimpleListAdapter adapter = new SimpleListAdapter(items);
        list.setAdapter(adapter);
    }
}
