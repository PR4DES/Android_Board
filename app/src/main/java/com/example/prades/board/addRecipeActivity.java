package com.example.prades.board;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by prades on 2017-05-13.
 */

public class addRecipeActivity extends AppCompatActivity {
    Button save;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);
        getSupportActionBar().hide();

        save = (Button)findViewById(R.id.save_recipe);
        cancel = (Button)findViewById(R.id.cancel_recipe);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==cancel) {
                    Intent intent = new Intent(addRecipeActivity.this, searchActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
