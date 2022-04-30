package com.example.my_android_projcets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_page extends AppCompatActivity implements View.OnClickListener {
   Button login;
   EditText username,password;
   String un;
   String pw;
   int clickcount=3;
    TextView labeltext;
    Spinner sp;
    ArrayAdapter arryaAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        labeltext=(TextView)findViewById(R.id.textView2);
        login = (Button) findViewById(R.id.button);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        sp=(Spinner)findViewById(R.id.spinner);


        login.setOnClickListener(this);

          Intent intentfromreg=getIntent();
       un=intentfromreg.getStringExtra("usern");
      pw=intentfromreg.getStringExtra("passwddd");
       username.setText(un);
        password.setText(pw);
        password.setEnabled(false);
        username.setEnabled(false);


    }




    public void Register(View view) {
        Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
        Intent intennt=new Intent(Login_page.this, com.example.my_android_projcets.Login_page.class);
        startActivity(intennt);
    }


    @Override
    public void onClick(View view) {

        String urname = username.getText().toString();
        String passwd = password.getText().toString();
        if (urname.equals(un)&& passwd.equals(pw)) {
            Intent i = new Intent(getApplicationContext(),  com.example.my_android_projcets.Home_page.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Invslid user name and password", Toast.LENGTH_LONG).show();

        }
      }
    }






