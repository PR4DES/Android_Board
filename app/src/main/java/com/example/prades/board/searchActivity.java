package com.example.prades.board;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class searchActivity extends AppCompatActivity {

    ImageView sidebar_back, sidebar_search, sidebar_menu, sidebar_camera, sidebar_cart;
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

        sidebar_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sidebar_search.setBackgroundColor(Color.rgb(80, 95, 100));
            }
        });
    }
}
