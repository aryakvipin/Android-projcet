package com.example.my_android_projcets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.example.my_android_projcets.New_Projrct.GalleryTab;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.imageView3);
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequantilanimation);
        img.startAnimation(anim);
        Thread obj = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(getApplicationContext(), GalleryTab.class);
                startActivity(intent);

            }
        };
        obj.start();
    }
}