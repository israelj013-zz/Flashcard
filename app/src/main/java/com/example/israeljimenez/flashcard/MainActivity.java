package com.example.israeljimenez.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.option1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setBackgroundColor(getColor(R.color.red));
                findViewById(R.id.option2).setBackgroundColor(getColor(R.color.green));
            }
        });

        findViewById(R.id.option2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option2).setBackgroundColor(getColor(R.color.green));
            }
        });

        findViewById(R.id.option3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.option3).setBackgroundColor(getColor(R.color.red));
                findViewById(R.id.option2).setBackgroundColor(getColor(R.color.green));
            }
        });

        findViewById(R.id.cardBackground).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setBackgroundColor(getColor(R.color.yellow));
                findViewById(R.id.option2).setBackgroundColor(getColor(R.color.yellow));
                findViewById(R.id.option3).setBackgroundColor(getColor(R.color.yellow));
            }
        });

        findViewById(R.id.toggle_choices_invisibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setVisibility(View.INVISIBLE);
                findViewById(R.id.option2).setVisibility(View.INVISIBLE);
                findViewById(R.id.option3).setVisibility(View.INVISIBLE);
                findViewById(R.id.toggle_choices_visibility).setVisibility(View.VISIBLE);
                findViewById(R.id.toggle_choices_invisibility).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.option1).setVisibility(View.VISIBLE);
                findViewById(R.id.option2).setVisibility(View.VISIBLE);
                findViewById(R.id.option3).setVisibility(View.VISIBLE);
                findViewById(R.id.toggle_choices_visibility).setVisibility(View.INVISIBLE);
                findViewById(R.id.toggle_choices_invisibility).setVisibility(View.VISIBLE);
            }
        });
    }


}
