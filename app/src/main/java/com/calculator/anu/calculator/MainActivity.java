package com.calculator.anu.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.calculator.anu.calculator.R;

public class MainActivity extends ActionBarActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, badd, bsub, bmul, bdiv, beq, bclr;
    EditText et;
    int val1, val2;
    boolean add, sub, div, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.One);
        b2 = (Button) findViewById(R.id.Two);
        b3 = (Button) findViewById(R.id.Three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.Five);
        b6 = (Button) findViewById(R.id.Six);
        b7 = (Button) findViewById(R.id.Seven);
        b8 = (Button) findViewById(R.id.Eight);
        b9 = (Button) findViewById(R.id.Nine);
        b0 = (Button) findViewById(R.id.zero);
        bdot = (Button) findViewById(R.id.dot);
        badd = (Button) findViewById(R.id.Add);
        bsub = (Button) findViewById(R.id.Sub);
        bmul = (Button) findViewById(R.id.Mul);
        bdiv = (Button) findViewById(R.id.Div);
        beq = (Button) findViewById(R.id.Equal);
        bclr = (Button) findViewById(R.id.Clear);
        et = (EditText) findViewById(R.id.Ans);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + ".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = Integer.parseInt(et.getText() + "");
                add = true;
                et.setText(null);


            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(et.getText() + "");
                sub = true;
                et.setText(null);

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(et.getText() + "");
                mul = true;
                et.setText(null);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Integer.parseInt(et.getText() + "");
                div = true;
                et.setText(null);

            }
        });
        beq.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

                val2 = Integer.parseInt(et.getText() + "");

                if (add == true) {

                    et.setText(val1 + val2 + "");

                    add = false;
                }

                if (sub == true) {
                    et.setText(val1 - val2 + "");
                    sub = false;

                }

                if (mul == true) {
                    et.setText(val1 * val2 + "");
                    mul = false;

                }

                if (div == true) {

                    et.setText(val1 / val2 + "");
                    div = false;

                }

            }


        });


    }


}