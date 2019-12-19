package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private EditText edit1;
    private EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text1);
        text.setText("Result = ");
        Toast toast = Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG);
        toast.show();

    }
    public void buttonPressed(View view) {
        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        text = (TextView) findViewById(R.id.text1);
        String val1 = edit1.getText().toString();
        String val2 = edit2.getText().toString();
        int sum = Integer.parseInt(val1) + Integer.parseInt(val2);
        text.setText("Result = " + sum);
    }

}
