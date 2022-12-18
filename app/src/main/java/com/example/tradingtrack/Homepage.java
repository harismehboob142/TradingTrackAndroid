package com.example.tradingtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    String[] pairs;
    ListView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

//        getting values from xml file to pairs array
        pairs = getResources().getStringArray(R.array.pairs);

//        creating string adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pairs);

//        getting reference to adapter view
        v =  findViewById(R.id.list_view);

//        set adapter on adapterView
        v.setAdapter(adapter);
        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You clicked " + pairs[i], Toast.LENGTH_SHORT).show();
            }
        });

    }

}