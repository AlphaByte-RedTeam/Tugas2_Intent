package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView showUserText = findViewById(R.id.showUsername);
        Intent receiveData = getIntent();
        Bundle bundle = receiveData.getExtras();
        String userName = bundle.getString("Name");

        if (bundle != null)
            showUserText.setText(String.format("Hai %s", userName));
    }
}