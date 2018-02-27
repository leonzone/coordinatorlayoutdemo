package com.reiserx.coordinatorlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_coordinator_textview).setOnClickListener(this);
        findViewById(R.id.main_materialup_textview).setOnClickListener(this);
        findViewById(R.id.main_ioexample_textview).setOnClickListener(this);
        findViewById(R.id.main_space_textview).setOnClickListener(this);
        findViewById(R.id.main_lab).setOnClickListener(this);
        findViewById(R.id.main_behavior_textview).setOnClickListener(this);
        findViewById(R.id.jike_textview).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_coordinator_textview:
                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
                break;
            case R.id.main_ioexample_textview:
                startActivity(new Intent(MainActivity.this, IOExampleActivity.class));
                break;
            case R.id.main_space_textview:
                startActivity(new Intent(MainActivity.this, FlexibleActivity.class));
                break;
            case R.id.main_materialup_textview:
                startActivity(new Intent(MainActivity.this, MaterialUpActivity.class));
                break;
            case R.id.main_lab:
                startActivity(new Intent(MainActivity.this, LabActivity.class));
                break;
            case R.id.main_behavior_textview:
                startActivity(new Intent(MainActivity.this, BehaviorExampleActivity.class));
                break;
            case R.id.jike_textview:
                startActivity(new Intent(MainActivity.this, JikeActivity.class));
                break;
        }
    }
}
