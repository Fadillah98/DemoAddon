package com.myapplicationdev.android.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv, ivZoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
        ivZoom = findViewById(R.id.myZoomageView);
        //iv.setImageResource(R.mipmap.ic_launcher);
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
        Picasso.with(this).load(imageUrl).into(ivZoom);


    }
}
