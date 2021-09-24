package com.example.splash_teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoadingB_Activity extends AppCompatActivity {
    ProgressBar horizontalB;
    ObjectAnimator animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingb);

        horizontalB = findViewById(R.id.progressBarAnim);
        animate = ObjectAnimator.ofInt(horizontalB, "progress", 0, 100);
        animate.setDuration(7000);
        animate.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

                Toast.makeText ( getApplicationContext(), "Inicial", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                avancaTela();

                Toast.makeText ( getApplicationContext(), "Final", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    @Override
    protected void onStart() {
        animate.start();

        super.onStart();
    }

    private void avancaTela() {
        Intent avanca = new Intent (LoadingB_Activity.this, Inicial.class);
        startActivity (avanca);
        finish();
    }
}