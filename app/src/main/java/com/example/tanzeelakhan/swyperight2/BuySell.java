package com.example.tanzeelakhan.swyperight2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class BuySell extends AppCompatActivity {

    private Button addSellingItem;
    private Button addBuyingItem;
    private EditText input;
    private ListView tradeList;

    private ArrayList<String> tradeListArray;
    private ArrayAdapter<String> tradeListAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);
        addSellingItem = (Button) findViewById(R.id.btnSell);
        addBuyingItem = (Button) findViewById(R.id.btnBuy);
        input = (EditText) findViewById(R.id.input);
        tradeList = (ListView) findViewById(R.id.tradeList);

        // Set up array and array adapter

        tradeListArray = new ArrayList<String>();
        tradeListAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                tradeListArray
        );
        tradeList.setAdapter(tradeListAdapter);

        addBuyingItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current_input = input.getText().toString().trim();
                if(current_input.isEmpty()){
                    return;
                }
                tradeListAdapter.add("[BUYING] " + current_input);
                input.setText("");
            }
        });

        addSellingItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current_input = input.getText().toString().trim();
                if(current_input.isEmpty()){
                    return;
                }
                tradeListAdapter.add("[SELLING] " + current_input);
                input.setText("");
            }
        });
    }
}
