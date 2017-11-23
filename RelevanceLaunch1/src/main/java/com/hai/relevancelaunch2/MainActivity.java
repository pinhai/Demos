package com.hai.relevancelaunch2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_launch = (Button) findViewById(R.id.btn_launch);
        btn_launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hai.intent.action.BadService");
                intent.setPackage("com.hai.myapplication");
                MainActivity.this.startService(intent);
            }
        });
    }
}
