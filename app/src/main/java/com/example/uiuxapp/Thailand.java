package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Thailand extends AppCompatActivity {

    CardView Thailand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thailand);

        Thailand = findViewById(R.id.Thailand);

        Thailand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Thailand.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}