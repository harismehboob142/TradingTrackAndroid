package com.example.tradingtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void gotoLogin(View v){
        Intent i = new Intent(Signup.this, Login.class);
        startActivity(i);
    }
    public void gotoForget(View v){
        Intent i = new Intent(Signup.this, Forget.class);
        startActivity(i);
    }
}