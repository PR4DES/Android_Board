package com.example.prades.board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TypeActivity extends AppCompatActivity {

    EditText content;
    Button send;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        getSupportActionBar().hide();

        dbHandler = new DBHandler(getApplicationContext(),"Message.db", null, 1);

        content = (EditText)findViewById(R.id.t_content);
        send = (Button)findViewById(R.id.t_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==send) {
                    dbHandler.insert("1", content.getText().toString());
                    Intent intent = new Intent(TypeActivity.this, DisplayActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
