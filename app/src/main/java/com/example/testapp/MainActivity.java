package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

     private int min;
     private int max;
     private int randomNumber;
     ImageView imageView;
     CheckBox checkBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public  void random (View v ){

        min = 1;
        max = 6;
        imageView =  findViewById(R.id.imageView);

        randomNumber = ((int)(Math.random()*max)+min);
        //((EditText) findViewById(R.id.editText)).setText(String.valueOf(randomNumber)); //Print user Input

        if(randomNumber == 1) {
            imageView.setImageResource(R.drawable.dice_1);
        }if(randomNumber == 2) {
            imageView.setImageResource(R.drawable.dice_2);
        }if(randomNumber== 3){
           imageView.setImageResource(R.drawable.dice_3);
        }if (randomNumber == 4){
           imageView.setImageResource(R.drawable.dice_4);
        }if (randomNumber == 5){
            imageView.setImageResource(R.drawable.dice_5);
        }if(randomNumber == 6){
            imageView.setImageResource(R.drawable.dice_6);
        }if (randomNumber == 7){

        }


    }
}