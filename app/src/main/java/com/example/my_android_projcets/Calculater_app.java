package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculater_app extends AppCompatActivity {

    Button btnNumber0;
    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;

    TextView txtResult;

    EditText edtInput;

    Button btnCE;
    Button btnC;
    ImageButton btnDelete;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;

    Button btnDot;
    Button btnResult;

    double val1=Double.NaN;
    double val2;
    String ACTION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater_app);
        btnNumber0 = (Button) findViewById(R.id.b0);
        btnNumber1 = (Button) findViewById(R.id.b1);
        btnNumber2 = (Button) findViewById(R.id.b2);
        btnNumber3 = (Button) findViewById(R.id.b3);
        btnNumber4 = (Button) findViewById(R.id.b4);
        btnNumber5 = (Button) findViewById(R.id.b5);
        btnNumber6 = (Button) findViewById(R.id.b6);
        btnNumber7 = (Button) findViewById(R.id.b7);
        btnNumber8 = (Button) findViewById(R.id.b8);
        btnNumber9 = (Button) findViewById(R.id.b9);
        btnDot = (Button) findViewById(R.id.bDot);
        btnAdd = (Button) findViewById(R.id.badd);
        btnSub = (Button) findViewById(R.id.bsub);
        btnMul = (Button) findViewById(R.id.bmul);
        btnDiv = (Button) findViewById(R.id.biv);
        btnC = (Button) findViewById(R.id.clr);
        btnDelete = (ImageButton) findViewById(R.id.backspace);
        btnResult = (Button) findViewById(R.id.buttoneql);

        txtResult = (TextView) findViewById(R.id.display);

        edtInput = (EditText) findViewById(R.id.edtInput);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = edtInput.getText().toString();
                if (number != null && number.length() > 0) {
                    number = number.substring(0, number.length() - 1);
                }
                edtInput.setText(number);
                edtInput.setSelection(edtInput.getText().length());
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                txtResult.setText(null);
                edtInput.setText(null);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "+";
                if (!Double.isNaN(val1)) {
                    val2 = Double.parseDouble(edtInput.getText().toString());
                    val1 = val1 + val2;
                } else {
                    val1 = Double.parseDouble(edtInput.getText().toString());
                }

                txtResult.setText(val1 + " + ");
                edtInput.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "-";
                if (!Double.isNaN(val1)) {
                    val2 = Double.parseDouble(edtInput.getText().toString());
                    val1 = val1 - val2;
                } else {
                    val1 = Double.parseDouble(edtInput.getText().toString());
                }

                txtResult.setText(val1 + " - ");
                edtInput.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "*";
                if (!Double.isNaN(val1)) {
                    val2 = Double.parseDouble(edtInput.getText().toString());
                    val1 = val1 * val2;
                } else {
                    val1 = Double.parseDouble(edtInput.getText().toString());
                }

                txtResult.setText(val1 + " * ");
                edtInput.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "/";
                if (!Double.isNaN(val1)) {
                    val2 = Double.parseDouble(edtInput.getText().toString());
                    val1 = val1 / val2;
                } else {
                    val1 = Double.parseDouble(edtInput.getText().toString());
                }

                txtResult.setText(val1 + " / ");
                edtInput.setText(null);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ACTION != null && ACTION.equals("+")) {
                    double result = val1 + Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("-")) {
                    double result = val1 - Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("*")) {
                    double result = val1 * Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("/")) {
                    double result = val1 / Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setText(String.valueOf(result));
                }

                ACTION = null;
                val1 = Double.NaN;
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "0");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "1");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "2");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "3");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "4");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "5");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "6");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "7");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "8");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "9");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + ".");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

    }
    }