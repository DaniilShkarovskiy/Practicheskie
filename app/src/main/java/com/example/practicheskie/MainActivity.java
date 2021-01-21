package com.example.practicheskie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonone = (Button) findViewById(R.id.buttonone);
        buttonone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonone:
                Intent intent = new Intent(this, activitytwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}