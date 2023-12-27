package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.net.CacheRequest;

public class Manali extends AppCompatActivity {

    CardView Manali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manali);

        Manali = findViewById(R.id.Manali);

        Manali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Manali.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });

    }
}