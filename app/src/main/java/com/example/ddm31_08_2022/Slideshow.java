package com.example.ddm31_08_2022;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Slideshow extends AppCompatActivity {
    ImageView imageView;
    Integer imagens[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);
        imagens = new Integer[] {R.drawable.cachorro, R.drawable.gardem, R.drawable.happy};
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(imagens[0]);

    }
}
