package com.example.orbis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greenClean (View view) {
        Intent intent = new Intent(MainActivity.this,GreenCleanActivity.class);
        startActivity(intent);
    }

    public void finish (View view) {
        Intent intent = new Intent(MainActivity.this,FinishActivity.class);
        startActivity(intent);
    }
}