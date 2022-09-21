package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView user = findViewById(R.id.textView2);
    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Second Activity");

        if (bundle != null) {
        user.setText(String.format("Haiii, %s", bundle.getString("Name")));
        }
    }
}