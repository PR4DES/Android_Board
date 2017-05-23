package com.example.prades.board;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class DisplayActivity extends AppCompatActivity {

    Button write;
    Button read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        getSupportActionBar().hide();

        write = (Button)findViewById(R.id.d_write);
        read = (Button)findViewById(R.id.d_read);

        write.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v==write) {
                    if(event.getAction()==MotionEvent.ACTION_DOWN) {
                        write.setBackgroundResource(R.drawable.bg_type);
                    } else if(event.getAction()==MotionEvent.ACTION_UP) {
                        Intent intent = new Intent(DisplayActivity.this, TypeActivity.class);
                        startActivity(intent);
                        write.setBackgroundColor(Color.WHITE);
                    }
                }
                return true;
            }
        });
        read.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v==read) {
                    if(event.getAction()==MotionEvent.ACTION_DOWN) {
                        read.setBackgroundResource(R.drawable.bg_read);
                    } else if(event.getAction()==MotionEvent.ACTION_UP) {
                        Intent intent = new Intent(DisplayActivity.this, ReadActivity.class);
                        startActivity(intent);
                        read.setBackgroundColor(Color.WHITE);
                    }
                }
                return true;
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("Exit me", true);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
