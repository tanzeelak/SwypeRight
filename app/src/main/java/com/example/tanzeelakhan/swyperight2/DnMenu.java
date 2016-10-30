package com.example.tanzeelakhan.swyperight2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DnMenu extends AppCompatActivity {

    private TextView dnbf;
    private TextView dnlun;
    private TextView dndin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dn_menu);


        dnbf = (TextView) findViewById(R.id.dnbf);
        dnlun = (TextView) findViewById(R.id.dnlun);
        dndin = (TextView) findViewById(R.id.dndin);


        dnbf.setText("Breakfast\n" +
                "Cold Cereal\n" +
                "Ham & Cheese Croissant\n" +
                "Spinach & Cheese Crossiant\n" +
                "Steel-Cut Oatmeal Cup\n" +
                "Yogurt Cup\n" +
                "Berry Yogurt Bowl\n" +
                "Fresh Fruit Cup\n" +
                "Mango Pineapple Parfait\n" +
                "Yogurt Bowl w/ Banana, Pistachio & Pomagranate Seeds\n");

        dnlun.setText("Lunch/Dinner\n" +
                "Avocado BLT\n" +
                "BBQ Beef Brisket\n" +
                "Ham & Swiss\n" +
                "Roast Beef & Cheddar\n" +
                "Roasted Turkey & Provolone\n" +
                "Tuna\n" +
                "Vegan BBQ\n");

        dndin.setText("Breakfast\n" +
                "Cold Cereal\n" +
                "Ham & Cheese Croissant\n" +
                "Spinach & Cheese Crossiant\n" +
                "Steel-Cut Oatmeal Cup\n" +
                "Yogurt Cup\n" +
                "Berry Yogurt Bowl\n" +
                "Fresh Fruit Cup\n" +
                "Mango Pineapple Parfait\n" +
                "Yogurt Bowl w/ Banana, Pistachio & Pomagranate Seeds\n");

    }
}
