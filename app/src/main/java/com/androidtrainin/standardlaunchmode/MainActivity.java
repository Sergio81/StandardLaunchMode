package com.androidtrainin.standardlaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterTV = null;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTV = findViewById(R.id.counterTV);
        counterTV.setText("Counter: " + counter);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setContentView(R.layout.activity_main);
        counterTV = findViewById(R.id.counterTV);
        counter++;
        counterTV.setText("Counter: " + counter);

        super.onNewIntent(intent);
    }
}
