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
                "Yogurt Cup\n" +
                "Berry Yogurt Bowl\n" +
                "Fresh Fruit Cup\n" +
                "Mango Pineapple Parfait\n" +
                "Yogurt Bowl w/ Banana, Pistachio & Pomagranate Seeds\n");

        cafedes.setText("Deserts\n" +
                "Avocado BLT\n" +
                "BBQ Beef Brisket\n" +
                "Ham & Swiss\n" +
                "Roast Beef & Cheddar\n" +
                "Roasted Turkey & Provolone\n" +
                "Tuna\n" +
                "Vegan BBQ\n");
    }
}
