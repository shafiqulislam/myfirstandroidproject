package com.example.shafi.syed1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String na = getIntent().getStringExtra("Name");

        Toast.makeText(this, "Name: "+na, Toast.LENGTH_SHORT).show();
    }
}
