package com.example.mxd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private static final String TAG ="info" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        //帧布局
        Button ok1 = (Button) findViewById(R.id.ok1);
        ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: ==================帧布局=====");
                Intent intent =new Intent(MainActivity.this,FrameLayout.class);
                startActivity(intent);
            }
        });
    }
   
}
