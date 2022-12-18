package com.example.tradingtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void gotoForget(View v){
        Intent i = new Intent(Login.this, Forget.class);
        startActivity(i);
    }
    public void gotoHomepage(View v){
        Intent i = new Intent(Login.this, Homepage.class);
        startActivity(i);
    }

}