package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ActivityThree extends AppCompatActivity {

    private Button btn, btn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutthree);

        btn = (Button)findViewById(R.id.buttonthree);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtotwo = new Intent();
                backtotwo.setClass(ActivityThree.this, ActivityTow.class);
//                backtotwo.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(backtotwo);
            }
        });
        btn2 = (Button)findViewById(R.id.btnsingletop);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singletop = new Intent(ActivityThree.this, ActivityThree.class);
                singletop.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(singletop);
            }
        });
    }
}
