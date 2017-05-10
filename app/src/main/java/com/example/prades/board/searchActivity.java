package com.example.prades.board;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class searchActivity extends AppCompatActivity {

    ImageView sidebar_back;
    ImageView sidebar_search;
    ImageView sidebar_menu;
    ImageView sidebar_camera;
    ImageView sidebar_cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();

        sidebar_back = (ImageView)findViewById(R.id.sidebar_back);
        sidebar_search = (ImageView)findViewById(R.id.sidebar_search);
        sidebar_menu = (ImageView)findViewById(R.id.sidebar_menu);
        sidebar_camera = (ImageView)findViewById(R.id.sidebar_camera);
        sidebar_cart = (ImageView)findViewById(R.id.sidebar_cart);


        sidebar_search.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    sidebar_search.setBackgroundColor(Color.rgb(80, 95, 100));
                } else if (event.getAction()==MotionEvent.ACTION_UP) {
                    sidebar_search.setBackgroundColor(Color.rgb(115, 135, 145));
                }
                return true;
            }
        });
        sidebar_menu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    sidebar_menu.setBackgroundColor(Color.rgb(80, 95, 100));
                } else if (event.getAction()==MotionEvent.ACTION_UP) {
                    sidebar_menu.setBackgroundColor(Color.rgb(115, 135, 145));
                }
                return true;
            }
        });
        sidebar_camera.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    sidebar_camera.setBackgroundColor(Color.rgb(80, 95, 100));
                } else if (event.getAction()==MotionEvent.ACTION_UP) {
                    sidebar_camera.setBackgroundColor(Color.rgb(115, 135, 145));
                }
                return true;
            }
        });
        sidebar_cart.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    sidebar_cart.setBackgroundColor(Color.rgb(80, 95, 100));
                } else if (event.getAction()==MotionEvent.ACTION_UP) {
                    sidebar_cart.setBackgroundColor(Color.rgb(115, 135, 145));
                }
                return true;
            }
        });
    }
}
