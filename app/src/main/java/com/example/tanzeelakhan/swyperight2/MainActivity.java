package com.example.tanzeelakhan.swyperight2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        //if button1 is clicked do this...
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //make Intent to go to Menu Activity
                Intent intent = new Intent(MainActivity.this, Menu.class);

                //start the activity with the Intent
                startActivity(intent);

            }
        });


    }
}
