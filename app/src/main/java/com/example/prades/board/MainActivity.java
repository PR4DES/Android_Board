package com.example.prades.board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login_id = (EditText)findViewById(R.id.login_id);
    EditText login_pw = (EditText)findViewById(R.id.login_password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    login_id.addTextChangedListener(){
        
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode==KeyEvent.KEYCODE_ENTER)
        {
            // Just ignore the [Enter] key
            return true;
        }
        // Handle all other keys in the default way
        return super.onKeyDown(keyCode, event);
    }
}
