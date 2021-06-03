package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView compDice, userDice, result;
    Button highButton, lowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compDice = findViewById(R.id.dice_c);
        userDice = findViewById(R.id.dice_u);
        result = findViewById(R.id.logo);
        highButton = findViewById(R.id.button_h);
        lowButton = findViewById(R.id.button_l);

        int [] diceArray ={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        int [] resultArray = {R.drawable.c_win,
        R.drawable.u_win,
        R.drawable.tie};

        highButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand =new Random();

                int randNumComp = rand.nextInt(6);
                int randNumUser = rand.nextInt(6);

                compDice.setImageResource(diceArray[randNumComp]);
                userDice.setImageResource(diceArray[randNumUser]);

                if (randNumUser > randNumComp){
                    result.setImageResource(resultArray[1]);
                }
                else if (randNumUser < randNumComp){
                    result.setImageResource(resultArray[0]);
                }
                else {
                    result.setImageResource(resultArray[2]);
                }
            }
        });

        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand =new Random();

                int randNumComp = rand.nextInt(6);
                int randNumUser = rand.nextInt(6);

                compDice.setImageResource(diceArray[randNumComp]);
                userDice.setImageResource(diceArray[randNumUser]);

                if (randNumUser > randNumComp){
                    result.setImageResource(resultArray[0]);
                }
                else if (randNumUser < randNumComp){
                    result.setImageResource(resultArray[1]);
                }
                else {
                    result.setImageResource(resultArray[2]);
                }
            }
        });


    }
}