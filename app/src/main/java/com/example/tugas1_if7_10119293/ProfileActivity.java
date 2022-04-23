package com.example.tugas1_if7_10119293;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    // 22 Aril 2022
    // 10119293
    // Dwi Irfansyah
    // IF-7

    private Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnkembali = findViewById(R.id.btnkembali);
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(ProfileActivity.this,MainActivity.class);
                startActivity(kembali);
            }
        });

    }
}