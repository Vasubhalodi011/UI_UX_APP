package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dubai extends AppCompatActivity {

    CardView Subscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai);

        Subscribe = findViewById(R.id.Subscribe);

        Subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dubai.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}