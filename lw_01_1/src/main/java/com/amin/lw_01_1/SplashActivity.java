package com.amin.lw_01_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if(savedInstanceState==null)
            new Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {

                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    App.Log("SplashActivity.onCreate.start.MainActivity");
                }
            }, App.SplashDeleyMilis);

        App.Log("SplashActivity.onCreate");
    }
}
