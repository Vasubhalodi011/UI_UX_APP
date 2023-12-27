package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Goa extends AppCompatActivity {

    CardView Goa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        Goa = findViewById(R.id.Goa);

        Goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Goa.this, "Successfully Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}