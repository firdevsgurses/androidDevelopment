package com.firdevsgurses.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeImage(View view) {
        ImageView silaImageView = findViewById(R.id.imageView);

        if (clickCount == 0) {
            silaImageView.setImageResource(R.drawable.image1);
            clickCount = 1;
        } else {
            silaImageView.setImageResource(R.drawable.image2);
            clickCount = 0;
        }
    }
}