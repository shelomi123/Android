package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("17020654");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("17020654");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("17020654");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("17020654");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("17020654");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("17020654");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("17020654");
    }
}
