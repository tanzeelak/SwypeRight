package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView allTes;
    private Button button4;
    private Button button5;

    private int plan;

    private TextView remainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        allTes = (TextView) findViewById(R.id.allTes);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        remainTextView = (TextView) findViewById(R.id.remainTextView);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what to do on click?
                plan = 19;

                remainTextView.setText("190");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plan = 14;
                remainTextView.setText("140");

            }
        });

    }


    //create function that calculates
}
