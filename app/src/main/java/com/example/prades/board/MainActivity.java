package com.example.prades.board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText login_id;
    EditText login_pw;
    Button login_b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        login_id = (EditText)findViewById(R.id.login_id);
        login_pw = (EditText)findViewById(R.id.login_password);
        login_b = (Button)findViewById(R.id.login_button);
        t = (TextView)findViewById(R.id.login_alarm);

        login_b.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                t.setText("");
                if(login_id.getText().toString().equals("a")) {
                    if(login_pw.getText().toString().equals("a")) {
                        Intent intent = new Intent(MainActivity.this, searchActivity.class);
                        startActivity(intent);
                    }else {
                        t.setText("pw = "+login_pw.getText().toString());
                    }
                } else {
                    t.setText("id = "+login_id.getText().toString());
                }
            }
        });
    }
}
