package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username,email;
Button btnSUBMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        btnSUBMIT=findViewById(R.id.button);

        btnSUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        }
    });
}
}