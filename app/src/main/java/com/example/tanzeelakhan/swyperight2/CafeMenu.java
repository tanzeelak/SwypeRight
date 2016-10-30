package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CafeMenu extends AppCompatActivity {

    private TextView cafepizza;
    private TextView cafedes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_menu);


        cafepizza = (TextView) findViewById(R.id.cafepizza);
        cafedes = (TextView) findViewById(R.id.cafedes);

        cafepizza.setText("Pizzas and Paninis\n" +
                "Bolognese\n" +
                "Carciofo\n" +
                "Genova\n" +
                "Pepperoni\n" +
                "Salsiccia\n" +
                "Tre Formaggi\n" +
                "Verdura Arrosto\n" +
                "Campania\n" +
                "Italiano\n");

        cafedes.setText("Desserts\n" +
                "Gelato\n" +
                "Affogato Italiano\n" +
                "Bacca Parfait\n" +
                "Roast Beef & Cheddar\n" +
                "Roasted Turkey & Provolone\n" +
                "Tuna\n" +
                "Vegan BBQ\n");
    }
}
