package com.gpo.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView planeImage = findViewById(R.id.plane);
        Animation flyAnimation = AnimationUtils.loadAnimation(this, R.anim.fly);
        planeImage.startAnimation(flyAnimation);
    }
}