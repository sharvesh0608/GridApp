package com.shapps.gridapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
    ListView l;
    String MylistItems[]
            = {"English", "Hindi", "French", "Tamil", "Telugu", "Japanese", "German", "Chinese"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                MylistItems);
        l.setAdapter(arr);


    }
}