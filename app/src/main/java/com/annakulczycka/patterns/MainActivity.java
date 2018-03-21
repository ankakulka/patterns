package com.annakulczycka.patterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //declare field variables
    private Button changePatternButton;
    private ImageView pattern;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign views from layout file to corresponding var
        pattern = findViewById(R.id.patternImageView);
        changePatternButton = findViewById(R.id.button);

             View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int[] imagesId = {
                        R.drawable.blue,
                        R.drawable.pop,
                        R.drawable.brown,
                        R.drawable.pistachio,
                        R.drawable.purple,
                        R.drawable.purplish,
                        R.drawable.mono,
                        R.drawable.yellow
                };
                int images;
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(8);
                //change to new pattern
                images = imagesId[randomNumber];
                pattern.setImageResource(images);
            }

        };

             changePatternButton.setOnClickListener(listener);









    }
}
