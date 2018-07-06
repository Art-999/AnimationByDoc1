package com.example.arturmusayelyan.animationbydoc1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable ballAnimation;
    private boolean isAnimated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballImage = findViewById(R.id.animation_iv);
        ballImage.setBackgroundResource(R.drawable.colorful_ball);

        ballAnimation = (AnimationDrawable) ballImage.getBackground();
        ballImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!isAnimated) {
                    ballAnimation.start();
                    isAnimated = true;
                } else {
                    ballAnimation.stop();
                    isAnimated = false;
                }
            }
        });
    }

    public void goToSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
