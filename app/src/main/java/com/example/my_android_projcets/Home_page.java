package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home_page extends AppCompatActivity {
    ListView listview;
    ArrayAdapter arryayadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ArrayList phone = new ArrayList();
        listview=(ListView)findViewById(R.id.list) ;
        phone.add("Samusung");
        phone.add("Iphone");
        phone.add("Redmi");
        phone.add("one plus");
        phone.add("Realme");
        phone.add("Vivo");
        phone.add("Oppo");
        phone.add("Nokia");



        arryayadapter= new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,phone);
        listview.setAdapter(arryayadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Home_page.this, phone.get(position)+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
