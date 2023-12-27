package com.example.uiuxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    TextInputEditText fullname,phoneoremail,pass,confirmpass;

    TextView Signin;

    Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fullname = findViewById(R.id.fullname);
        phoneoremail = findViewById(R.id.phoneoremail);
        pass = findViewById(R.id.pass);
        confirmpass = findViewById(R.id.confirmpass);
        Signin = findViewById(R.id.Signin);
        btnsignup = findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this,CityChoose.class);

                startActivity(intent);
            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this,MainActivity2.class);

                startActivity(intent);
            }
        });

    }
}