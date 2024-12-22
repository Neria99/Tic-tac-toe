package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class Strat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strat);
        Button Easy = findViewById(R.id.btEasy);
        Button Med = findViewById(R.id.btMedium);
        Button hard = findViewById(R.id.btHard);


        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Strat.this,MainActivity.class);
                startActivity(intent);

            }
        });
        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Strat.this,MainActivityEasy.class);
                startActivity(intent);

            }
        });
    }
}
