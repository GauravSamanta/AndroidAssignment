package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button eReturn = findViewById(R.id.button4);
        eReturn.setOnClickListener(view -> startActivity(new Intent(MainActivity4.this, MainActivity.class)));
        Button eExit = findViewById(R.id.button5);
        eExit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        });
    }
}
