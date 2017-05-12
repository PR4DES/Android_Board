package com.example.prades.board;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by prades on 2017-05-13.
 */

public class addRecipeActivity extends Activity {
    Button save;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);

        save.findViewById(R.id.save_recipe);
        cancel.findViewById(R.id.cancel_recipe);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addRecipeActivity.this, searchActivity.class);
                startActivity(intent);
            }
        });
    }
}
