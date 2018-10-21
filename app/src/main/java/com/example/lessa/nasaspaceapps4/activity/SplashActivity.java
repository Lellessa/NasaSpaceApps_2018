package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lessa.nasaspaceapps4.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override public void run() {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity( intent );
            }
            }, 3000); }
    }
