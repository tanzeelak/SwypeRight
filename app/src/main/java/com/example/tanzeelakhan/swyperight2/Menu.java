package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class Menu extends AppCompatActivity {

    private TextView swipesLeftText;
    private  TextView totalText;
    private Button button4;
    private Button button5;

    private int plan;

    private TextView remainTextView;

    public int swipesLeft(int planType) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        //firstDayOfSchool = new SimpleDateFormat("18-09-2016");
        //Date date = new Date(16, 9, 18);
        //long timePassed = date.getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = df.format(c.getTime());
        remainTextView.setText(formattedDate);
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        remainTextView = (TextView) findViewById(R.id.swipesLeftText);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what to do on click?
//                plan = 19;
//                plan*=10;
                plan = 19;
                
                swipesLeft(plan);

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
