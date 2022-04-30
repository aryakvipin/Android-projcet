package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Gridviewpage extends AppCompatActivity {
     GridView gridlist;
   //  ArrayList grid=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridviewpage);
        gridlist=(GridView)findViewById(R.id.grislist);
        gridlist.setAdapter(new ImageAdapter(this));
        gridlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Gridviewpage.this, "Image Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }


}