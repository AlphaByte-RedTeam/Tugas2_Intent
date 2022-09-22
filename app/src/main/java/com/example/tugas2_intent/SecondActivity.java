package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView showUserText = findViewById(R.id.showUsername);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Second Activity");

        Intent receiveData = getIntent();
        Bundle bundle = receiveData.getExtras();
        String userName = bundle.getString("Name");

            showUserText.setText(String.format("Haiii %s", userName));
    }
}
