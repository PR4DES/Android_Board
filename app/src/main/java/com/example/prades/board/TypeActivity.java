package com.example.prades.board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypeActivity extends AppCompatActivity {

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        getSupportActionBar().hide();

        send = (Button)findViewById(R.id.t_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==send) {
                    Intent intent = new Intent(TypeActivity.this, DisplayActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
