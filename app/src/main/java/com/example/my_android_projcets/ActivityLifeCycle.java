package com.example.my_android_projcets;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("Lifecycle","oncreate ivoke");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onstar ivoke");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume ivoke");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause ivoke");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop ivoke");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","onRestart ivoke");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy ivoke");

    }
}