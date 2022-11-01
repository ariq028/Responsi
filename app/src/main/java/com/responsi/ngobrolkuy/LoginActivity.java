package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    private Button buttonreg, lupapass, buttonlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonreg = findViewById(R.id.btnRegister);
        buttonlog = findViewById(R.id.btnLogin);
        lupapass = findViewById(R.id.btnLupapass);





        buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindah);
            }
        });

        lupapass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent password = new Intent(LoginActivity.this, LupaPasswordActivity.class);
                startActivity(password);
            }
        });
    }
}