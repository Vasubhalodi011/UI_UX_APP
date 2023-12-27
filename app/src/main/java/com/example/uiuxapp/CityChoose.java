package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CityChoose extends AppCompatActivity {

    CardView Goa, Manali, Maldives, Thailand, Dubai, Kedarnath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_choose);

        Goa = findViewById(R.id.Goa);
        Manali = findViewById(R.id.Manali);
        Maldives = findViewById(R.id.Maldives);
        Thailand = findViewById(R.id.Thailand);
        Dubai = findViewById(R.id.Dubai);
        Kedarnath = findViewById(R.id.Kedarnath);

        Goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this, Goa.class);

                startActivity(intent);
            }
        });

        Manali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this, Manali.class);

                startActivity(intent);
            }
        });
        Maldives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this, Maldives.class);

                startActivity(intent);
            }
        });
        Thailand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this,Thailand.class);

                startActivity(intent);
            }
        });
        Dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this, Dubai.class);

                startActivity(intent);
            }
        });
        Kedarnath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityChoose.this, Kedarnath.class);

                startActivity(intent);
            }
        });
    }
}