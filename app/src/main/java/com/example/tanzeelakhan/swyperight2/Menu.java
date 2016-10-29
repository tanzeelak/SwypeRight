package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewDebug;
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
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 18);
        Date startOfSwipes = cal.getTime(); // Create a date set to start of swipes
        Date now = new Date(); // Create a date set to current

        long daysSinceSwipesBegan = (now.getTime() - startOfSwipes.getTime())/86400000; // Divide difference in mseconds by the mseconds in a day

        int totalSwipes = 0;
        int swipesPerDay = 0;

        if (planType == 19) {
            totalSwipes = 213;
            swipesPerDay = 3;
        }
        if (planType == 14) {
            totalSwipes = 158;
            swipesPerDay = 2;
        }

        return (totalSwipes - ((int) daysSinceSwipesBegan * swipesPerDay));
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
                plan = 19;
                remainTextView.setText(Integer.toString(swipesLeft(plan)));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plan = 14;
                remainTextView.setText(Integer.toString(swipesLeft(plan)));

            }
        });

    }


    //create function that calculates
}
