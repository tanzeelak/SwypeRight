package com.example.tanzeelakhan.swyperight2;

import android.graphics.Color;
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
    private EditText swipesUsed;
    private Button button4;
    private Button button5;
    private Button btnCalculateSwipes;

    private int plan = 0;
    private int totalSwipes = 0;
    private int swipesPerDay;

    private TextView remainTextView;

    public int swipesLeft(int swipesUsed) {

        int swipesLeft = totalSwipes - swipesUsed;

        return swipesLeft;
    }

    public int swipesShouldHaveUsed(int swipesUsed) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 18);
        Date startOfSwipes = cal.getTime(); // Create a date set to start of swipes
        Date now = new Date(); // Create a date set to current

        long daysSinceSwipesBegan = (now.getTime() - startOfSwipes.getTime())/86400000; // Divide difference in mseconds by the mseconds in a day

        return (int) daysSinceSwipesBegan * swipesPerDay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        btnCalculateSwipes = (Button) findViewById(R.id.btnCalculateSwipes);

        remainTextView = (TextView) findViewById(R.id.swipesLeftText);
        swipesUsed = (EditText) findViewById(R.id.swipesUsed);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setTextColor(Color.RED);
                button5.setTextColor(Color.BLACK);
                plan = 19;
                totalSwipes = 213;
                swipesPerDay = 3;
                //remainTextView.setText(Integer.toString(swipesLeft(plan)));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setTextColor(Color.BLACK);
                button5.setTextColor(Color.RED);
                plan = 14;
                totalSwipes = 158;
                swipesPerDay = 2;
                //remainTextView.setText(Integer.toString(swipesLeft(plan)));

            }
        });

        btnCalculateSwipes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (swipesUsed.getText().toString().matches(""))
                    remainTextView.setText("Enter a number of swipes and try again.");
                else if (plan == 0)
                    remainTextView.setText("Please select a plan and try agian.");
                else {
                    int intSwipesUsed = Integer.parseInt(swipesUsed.getText().toString());
                    if ((swipesShouldHaveUsed(intSwipesUsed) - intSwipesUsed) > 0) {
                        remainTextView.setText("You have " + Integer.toString(totalSwipes - intSwipesUsed) + " swipes and are " + Integer.toString(swipesShouldHaveUsed(intSwipesUsed) - intSwipesUsed) + " swipes ahead");
                    }
                    else
                        remainTextView.setText("You have " + Integer.toString(totalSwipes - intSwipesUsed) + " swipes and are " + Integer.toString(0 - (swipesShouldHaveUsed(intSwipesUsed) - intSwipesUsed)) + " swipes behind");
                }
            }
        });

    }


    //create function that calculates
}
