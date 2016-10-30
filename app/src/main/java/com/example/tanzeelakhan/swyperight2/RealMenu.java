package com.example.tanzeelakhan.swyperight2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RealMenu extends AppCompatActivity {

    private Button bcafbtn;
    private Button cafebtn;
    private Button rendebtn;
    private Button dnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_menu);

        bcafbtn = (Button) findViewById(R.id.bcafbtn);
        cafebtn = (Button) findViewById(R.id.cafebtn);
        rendebtn = (Button) findViewById(R.id.rendebtn);
        dnbtn = (Button) findViewById(R.id.dnbtn);


        bcafbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RealMenu.this, BCafMenu.class);

                startActivity(intent);

            }

        });

        cafebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RealMenu.this, CafeMenu.class);

                startActivity(intent);

            }

        });

        rendebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RealMenu.this, RendeMenu.class);

                startActivity(intent);

            }

        });

        dnbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RealMenu.this, DnMenu.class);

                startActivity(intent);

            }

        });

    }
}
