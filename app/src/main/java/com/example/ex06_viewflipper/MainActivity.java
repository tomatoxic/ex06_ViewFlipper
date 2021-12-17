package com.example.ex06_viewflipper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewFlipper vFlipper;
        Button btnStart, btnStop;
        ImageView imgView;

//        Button btnPrev, btnNext;

//        btnPrev = (Button) findViewById(R.id.btnPrev);
//        btnNext = (Button) findViewById(R.id.btnNext);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        imgView = (ImageView) findViewById(R.id.imgView1);

        imgView.setVisibility(View.INVISIBLE);
//        btnPrev.setOnClickListener(view -> vFlipper.showPrevious());
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                vFlipper.showNext();
//            }
//        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.setVisibility(View.VISIBLE);
                vFlipper.startFlipping();
                vFlipper.setFlipInterval(1000);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vFlipper.stopFlipping();
            }
        });
    }
}