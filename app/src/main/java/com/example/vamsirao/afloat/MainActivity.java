package com.example.vamsirao.afloat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startButton(View view){
        startService(new Intent(MainActivity.this,FloatService.class));
        Toast.makeText(this,"Float started",Toast.LENGTH_SHORT).show();

    }

    public void stopButton(View view){

        stopService(new Intent(MainActivity.this,FloatService.class));
        Toast.makeText(this,"Float stopped",Toast.LENGTH_SHORT).show();


    }
}
