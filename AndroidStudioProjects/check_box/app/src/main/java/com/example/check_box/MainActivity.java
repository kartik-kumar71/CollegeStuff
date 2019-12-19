package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CheckBox c1,c2,c3,c4,c5;
    private Button b;
    String temp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lin_lay);
        b = (Button) findViewById(R.id.button);
        c1 = (CheckBox) findViewById(R.id.check1);
        c2 = (CheckBox) findViewById(R.id.check2);
        c3 = (CheckBox) findViewById(R.id.check3);
        c4 = (CheckBox) findViewById(R.id.check4);
        c5 = (CheckBox) findViewById(R.id.check5);
        final List<CheckBox> checkList = new ArrayList<CheckBox>(Arrays.asList(c1,c2,c3,c4,c5));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (CheckBox i : checkList) {
                    if (i.isChecked()) {
                        temp += i.getText();
                        temp += "  ";
                    }
                }
                Toast.makeText(getApplicationContext(),temp,Toast.LENGTH_LONG).show();
                temp = "";


            }
        });
    }
}
