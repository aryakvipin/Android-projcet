package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Gridview_with_img_text extends AppCompatActivity {
   GridView gridimgExt;
   String gridtext[]={"Camera","Clock","File","Massege","Phone","Palystore","whatsapp","Image","Chrome","youtube"
           ,"Calender","Contact","Settings","Calculater","Instagram","fm"};
   int gridimg[]={R.drawable.camera,R.drawable.calock,R.drawable.file,R.drawable.messege,R.drawable.phone,R.drawable.playstore,
   R.drawable.whtsp,R.drawable.image,R.drawable.chrome,R.drawable.youtube,R.drawable.calender,R.drawable.conatct,R.drawable.settinigs
   ,R.drawable.calculater,R.drawable.instagram,R.drawable.fm};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview_with_img_text);
        GridAdapter gridadperview=new GridAdapter(getApplicationContext(),gridimg,gridtext);
        gridimgExt=(GridView)findViewById(R.id.gridimgtxt);
        gridimgExt.setAdapter(gridadperview);
        gridimgExt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "GridView Item: " + gridtext[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}