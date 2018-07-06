package com.example.arturmusayelyan.animationbydoc1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {
    private LinearLayout singleBetLayout;
    private View disableView;
    private boolean isAnimationViewVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        singleBetLayout = findViewById(R.id.single_bet_include);
        disableView = findViewById(R.id.disable_view);

        Log.d("Art", getWindowManager().getDefaultDisplay().getHeight() + "");
        singleBetLayout.setY(getWindowManager().getDefaultDisplay().getHeight());

        findViewById(R.id.second_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isAnimationViewVisible) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0f, 1f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                            disableView.setVisibility(View.VISIBLE);
                            disableView.setClickable(true);
                            disableView.setFocusable(true);
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    disableView.startAnimation(alphaAnimation);
                    // qo skzbnakan dirqe
                    singleBetLayout.animate().translationY(0).setDuration(300).start();
                    isAnimationViewVisible = true;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0f, 1f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                            disableView.setVisibility(View.GONE);
                            disableView.setClickable(false);
                            disableView.setFocusable(false);
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    disableView.startAnimation(alphaAnimation);
                    // qo skzbnakan dirqin gumarac qo chape
                    singleBetLayout.animate().translationY(singleBetLayout.getHeight()).setDuration(300).start();
                    isAnimationViewVisible = false;
                }

            }
        });


        findViewById(R.id.place_bet_close_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                singleBetLayout.animate().translationY(singleBetLayout.getHeight()).setDuration(300).start();
//                disableView.setVisibility(View.GONE);
//                isAnimationViewVisible = false;

                AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);
                alphaAnimation.setDuration(300);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        disableView.setVisibility(View.GONE);
                        disableView.setClickable(false);
                        disableView.setFocusable(false);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                disableView.startAnimation(alphaAnimation);
                // qo skzbnakan dirqin gumarac qo chape
                singleBetLayout.animate().translationY(singleBetLayout.getHeight()).setDuration(300).start();
                isAnimationViewVisible = false;
            }
        });
    }
}
