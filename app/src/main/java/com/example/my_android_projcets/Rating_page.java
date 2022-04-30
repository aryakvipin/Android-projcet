package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rating_page extends AppCompatActivity {
    RatingBar rtbar;
    TextView tview;
    Button btm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_page);
        rtbar=(RatingBar)findViewById(R.id.ratingBar);
      tview= (TextView)findViewById(R.id.textV8) ;
      btm=(Button) findViewById(R.id.getbtn);
      btm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              int noofstar=rtbar.getNumStars();
              float rating=rtbar.getRating();
              tview.setText("Rating"+rating+"/"+noofstar);
          }
      });
    }
}