package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
//    EditText name = findViewById(R.id.id_name);
//    Button intent = findViewById(R.id.btn_intent);
//    private Intent SecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Main Activity");

        Button click = findViewById(R.id.btnClickMe);
        EditText editNameReceive = findViewById(R.id.editName);
        String users = editNameReceive.getText().toString();

        click.setOnClickListener(view -> {
            if (editNameReceive.length() == 0)
                Toast.makeText(this, "Username belum diinput", Toast.LENGTH_LONG).show();
            else {
                Toast.makeText(this, "Haiii...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("Name", users);
                startActivity(intent);
            }
        });

//        startActivity(new Intent(this, SecondActivity.class));
//
//        intent.setOnClickListener(view -> {
//            if (name.length() == 0) {
//            }else {
//
//                startActivity(SecondActivity);
//            }
//        });
    }

}