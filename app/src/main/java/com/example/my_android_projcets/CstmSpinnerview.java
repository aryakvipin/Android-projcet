package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CstmSpinnerview extends AppCompatActivity {
     Spinner country;
     String countryname[]={"Argentina,","Astralia","Brazl","Canada","China","Dnmark","Europian","France","Germany","India","Jappan"
             ,"Libiya","Maxico","Philippines","Portugal","Qater","Russia","Saudi","Sauthafrica","Singapure","Spain","UAE","UK"};
     int countryimg[]={R.drawable.argentina,R.drawable.astralia,R.drawable.brazil,R.drawable.canada,R.drawable.china,R.drawable.denmark,R.drawable.european,
     R.drawable.france,R.drawable.germany,R.drawable.india,R.drawable.jappan,R.drawable.libiya,R.drawable.maxico,R.drawable.philippines,R.drawable.portugal
             ,R.drawable.qater,R.drawable.russia,R.drawable.saudi,R.drawable.sauthafrica,R.drawable.singapore,R.drawable.spain,R.drawable.uae,R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstm_spinnerview);
        country=(Spinner)findViewById(R.id.country);
        CustemspAdapter custemspAdapter=new CustemspAdapter(getApplicationContext(),countryimg,countryname);
         country.setAdapter(custemspAdapter);
         country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                     Toast.makeText(getApplicationContext(), countryname[i], Toast.LENGTH_LONG).show();

             }


             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });
    }
}