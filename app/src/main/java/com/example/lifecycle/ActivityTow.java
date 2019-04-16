package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTow extends AppCompatActivity {
    private final static String TAG = "ActivityTwo";

    private Button btn, backbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouttwo);
        Log.i(TAG, Thread.currentThread().getStackTrace()[2].getMethodName());
        Log.i(TAG, Thread.currentThread().getId() + "");

        btn = (Button) findViewById(R.id.buttontwo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tothree = new Intent();
                tothree.setClass(ActivityTow.this, ActivityThree.class);
                startActivity(tothree);
            }
        });
        backbtn = (Button) findViewById(R.id.buttonfromtwotoone);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoone = new Intent(ActivityTow.this, MainActivity.class);
                startActivity(backtoone);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }


}
