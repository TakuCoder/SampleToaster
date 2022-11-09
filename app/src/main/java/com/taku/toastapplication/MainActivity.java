package com.taku.toastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.taku.toastlibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster toaster = new Toaster(this);
        toaster.doToast("test");

    }
}