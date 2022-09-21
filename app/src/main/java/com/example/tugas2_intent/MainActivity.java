package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name = findViewById(R.id.id_name);
    Button intent = findViewById(R.id.btn_intent);
    private Intent SecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Main Activity");

        startActivity(new Intent(this, SecondActivity.class));

        intent.setOnClickListener(view -> {
            if (name.length() == 0) {
                Toast.makeText(getApplication(), "Username belum dimasukkan", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplication(), "Usernamemu salah", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplication(), "Haiii...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SecondActivity.class);
                String users = name.getText().toString();
                intent.putExtra("Name", users);
                startActivity(intent);

                startActivity(SecondActivity);
            }
        });
    }

}