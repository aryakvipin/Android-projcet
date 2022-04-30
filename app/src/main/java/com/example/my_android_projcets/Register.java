package com.example.my_android_projcets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity  {
    EditText user, passwd;
    Button reg;
    RadioGroup gender;
    RadioButton radiobutton;
    CheckBox c1, c2, c3, c4;
    Intent i;
    Spinner sp;
    ArrayAdapter arrayAdapter;
    String states[] = {"-Select State-","Kerala" ,"TamilNadu","Karnataka","Maharashtra","Gujarath","Andrapradesh","Orrissa","Bihar"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user = (EditText) findViewById(R.id.user);
        passwd = (EditText) findViewById(R.id.passwd);

        gender = (RadioGroup) findViewById(R.id.radioGroup3);
        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        reg = (Button) findViewById(R.id.reg);

        sp = (Spinner)findViewById(R.id.spinner);
        arrayAdapter= new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,states);
        sp.setAdapter(arrayAdapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                             if (adapterView.getItemAtPosition(i).equals("-Select State-")) {

                                             } else {
                                                 Toast.makeText(getApplicationContext(), states[i], Toast.LENGTH_LONG).show();
                                             }
                                         }


                                         @Override
                                         public void onNothingSelected(AdapterView<?> adapterView) {

                                         }
                                     });


                i = getIntent();

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = (RadioButton) findViewById(gender.getCheckedRadioButtonId());
                String value1 = rb.getText().toString();
                Toast.makeText(getApplicationContext(), "gender is " + value1, Toast.LENGTH_LONG).show();
            }
        });

    }





//    public void check(View view) {
//        boolean checkedcheckbox = ((CheckBox) view).isChecked();
//
//        String lang = "";
//
//        switch (view.getId()) {
//            case R.id.checkBox1:
//                lang = checkedcheckbox ? "Malayalam Selected" : "Malayalam Deselected";
//                break;
//            case R.id.checkBox2:
//                lang = checkedcheckbox ? "English Selected" : "English Deselected";
//                break;
//            case R.id.checkBox3:
//                lang = checkedcheckbox ? "Hindi Selected" : "Hindi Deselected";
//                break;
//            case R.id.checkBox4:
//                lang = checkedcheckbox ? "Tamil Selected" : "Tamil Deselected";
//                break;
//        }
//        Toast.makeText(getApplicationContext(),lang,Toast.LENGTH_LONG).show();
//
//     }



    public void register(View view) {
            String uname = user.getText().toString();
        String paswd = passwd.getText().toString();


        if (uname.length() == 0) {
            user.requestFocus();
            user.setError("Username is not Entered");

        } else if (paswd.length() == 0) {
            passwd.requestFocus();
            passwd.setError("Password is not Entered");
        } else {
            i = new Intent(getApplicationContext(), Login_page.class);
            i.putExtra("usern", uname);
            i.putExtra("passwddd", paswd);
            startActivity(i);
        }

    }

    public void reg(View view) {
        String language="Language are ";
        if(c1.isChecked()){
            language+="Malayalam";

        }
        if(c2.isChecked()){
            language+="English";

        }
        if(c3.isChecked()){
            language+="Hindi";

        }
        if(c4.isChecked()){
            language+="Tamil";

        }
        Toast.makeText(getApplicationContext(),language,Toast.LENGTH_LONG).show();
    }
}