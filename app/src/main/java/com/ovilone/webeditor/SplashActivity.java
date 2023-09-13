package com.ovilone.webeditor;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private final Timer _timer = new Timer();

    private TextView textview1;

    private final Intent start = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_splash);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        textview1 = findViewById(R.id.textview1);
    }

    private void initializeLogic() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(0xFFFFFFFF);
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {
                    start.setClass(getApplicationContext(), MainActivity.class);
                    startActivity(start);
                    finish();
                });
            }
        };
        _timer.schedule(t, 2000);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> textview1.setTextColor(0xFFFF5722));
            }
        };
        _timer.schedule(t, 200);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> textview1.setTextColor(0xFFF4511E));
            }
        };
        _timer.schedule(t, 200);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> textview1.setTextColor(0xFFE64A19));
            }
        };
        _timer.schedule(t, 200);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> textview1.setTextColor(0xFFD84315));
            }
        };
        _timer.schedule(t, 200);
    }

}
