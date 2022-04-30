package com.example.my_android_projcets;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Custemlistview extends AppCompatActivity {
         ListView frtlist;
         String  fruitsname[]={"Apple","Banana","Carrot","Dragon","Grapes","Kiwi","Mango","Orange","Pappaya","Strawberry","Watermelon","melon","durain"};

         int fruitimage[]={R.drawable.apple,R.drawable.banana,R.drawable.carrot,R.drawable.dreagen,R.drawable.grapes,
                 R.drawable.kiwi,R.drawable.mango,R.drawable.orange,R.drawable.pappaya,R.drawable.strawberry,R.drawable.watermelen,R.drawable.melon,R.drawable.durian};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custemlistview);
        frtlist=(ListView) findViewById(R.id.foodlist);
        CustemAdapter custemAdapter=new CustemAdapter(getApplicationContext(),fruitimage,fruitsname);
        frtlist.setAdapter(custemAdapter);
       frtlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert =new AlertDialog.Builder(this);
        alert.setTitle("Exit ?")
        .setMessage("Do you wnat Exit ?")
        .setCancelable(true)
        .setPositiveButton("Yes," , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
             dialogInterface.cancel();
            }
        });
        alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
             dialogInterface.cancel();
            }
        });
        AlertDialog obj=alert.create();
        obj.show();

    }
}