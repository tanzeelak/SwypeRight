package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RendeMenu extends AppCompatActivity {

    private TextView rendewest;
    private TextView rendeeast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rende_menu);

        rendewest = (TextView) findViewById(R.id.rendewest);
        rendeeast = (TextView) findViewById(R.id.rendeeast);

        rendewest.setText("West Specialties\n" +
                "Beef Quesadilla\n" +
                "Cheese Quesadilla\n" +
                "Chicken Quesadilla\n" +
                "Shredded Beef Quesadilla\n" +
                "Spinach & Mushroom Quesadilla\n" +
                "Berry Yogurt Bowl\n" +
                "Fresh Fruit Cup\n" +
                "Mango Pineapple Parfait\n" +
                "Yogurt Bowl w/ Banana, Pistachio & Pomagranate Seeds\n");

        rendeeast.setText("East Entrees\n" +
                "Beef & Broccoli\n" +
                "Orange Chicken\n" +
                "Vegetable Stir-Fry\n" +
                "Baby Bok Choy & Tofu\n" +
                "Eggplant & Tofu\n" +
                "Kung Pao Chicken\n" +
                "Sweet & Sour Pork\n");
    }
}
