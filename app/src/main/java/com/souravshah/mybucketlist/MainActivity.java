package com.souravshah.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClicklisteners();
    }

    private void setupClicklisteners() {
        CardView thingstodocard = findViewById(R.id.CardView_things_to_do);
        CardView placestogocard = findViewById(R.id.CardView_places_to_go);

        thingstodocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThingsToDoActivity.class);
            startActivity(intent);
            }
        });


        placestogocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent = new Intent(MainActivity.this, PlacesToGoActivity.class);
           startActivity(intent);
            }
        });
    }

}