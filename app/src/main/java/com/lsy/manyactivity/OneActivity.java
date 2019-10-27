package com.lsy.manyactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button button4 = findViewById(R.id.bt4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OneActivity.this,FourActivity.class);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.bt5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OneActivity.this,FiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
