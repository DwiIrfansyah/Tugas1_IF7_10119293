package com.example.tugas1_if7_10119293;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    // 22 Aril 2022
    // 10119293
    // Dwi Irfansyah
    // IF-7

    private Button btnRegis;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(Login);
            }
        });

        btnRegis = findViewById(R.id.btn_regis);
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Regis = new Intent(LoginActivity.this,RegistrasiActivity.class);
                startActivity(Regis);
            }
        });
    }
}