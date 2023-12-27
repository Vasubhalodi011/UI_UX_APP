package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Maldives extends AppCompatActivity {

CardView Maldives;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maldives);

        Maldives = findViewById(R.id.Maldives);

        Maldives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Maldives.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}