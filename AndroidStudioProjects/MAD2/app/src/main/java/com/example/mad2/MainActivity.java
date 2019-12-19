package com.example.mad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button

public class MainActivity extends AppCompatActivity {


    final TextView view1 = (TextView) findViewById(R.id.textView);
    final Button bt1 = findViewById(R.id.button1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
    }
    bt1
    public void button1Pressed(View view) {
        view1.setText("Submit");
    }
}
