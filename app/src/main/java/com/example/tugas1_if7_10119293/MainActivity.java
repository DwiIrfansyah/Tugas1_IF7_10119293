package com.example.tugas1_if7_10119293;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 22 Aril 2022
    // 10119293
    // Dwi Irfansyah
    // IF-7

    private Button btnprofile;
    private Button btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnprofile = findViewById(R.id.btn_profile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Profile = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(Profile);
            }
        });

        btnlogout = findViewById(R.id.btn_logout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Logout = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(Logout);
            }
        });
    }
}