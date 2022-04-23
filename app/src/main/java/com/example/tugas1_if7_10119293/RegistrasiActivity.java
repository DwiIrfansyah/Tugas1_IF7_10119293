package com.example.tugas1_if7_10119293;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrasiActivity extends AppCompatActivity {

    // 22 Aril 2022
    // 10119293
    // Dwi Irfansyah
    // IF-7

    TextView text_kembali;
    private Button btnregist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnregist = findViewById(R.id.btn_regist);
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Regist = new Intent(RegistrasiActivity.this,LoginActivity.class);
                startActivity(Regist);
            }
        });
        text_kembali = (TextView) findViewById(R.id.text_kembali);
        text_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent kembali = new Intent(RegistrasiActivity.this,LoginActivity.class);
                startActivity(kembali);
            }
        });
    }
}