package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Kedarnath extends AppCompatActivity {

    CardView Kedarnath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedarnath);

        Kedarnath = findViewById(R.id.Kedarnath);

        Kedarnath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kedarnath.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}