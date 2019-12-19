package com.example.calculatoruiassignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView disp;
    private EditText first;
    private EditText second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);


    }

    public void addPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        float res = Float.valueOf(first.getText().toString()) + Float.valueOf(second.getText().toString());

        AlertDialog.Builder db = new AlertDialog.Builder(MainActivity.this);
        db.setMessage("Result = " + res).setCancelable(true).setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("RETURN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = db.create();
        alertDialog.setTitle("Done!");
        alertDialog.show();
        resetVal(res);
    }

    public void subPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        float res =Float.valueOf(first.getText().toString()) - Float.valueOf(second.getText().toString());
        AlertDialog.Builder db = new AlertDialog.Builder(MainActivity.this);
        db.setMessage("Result = " + res).setCancelable(true).setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("RETURN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = db.create();
        alertDialog.setTitle("Done!");
        alertDialog.show();
        resetVal(res);


    }

    public void multPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        float res = Float.valueOf(first.getText().toString()) * Float.valueOf(second.getText().toString());
        AlertDialog.Builder db = new AlertDialog.Builder(MainActivity.this);
        db.setMessage("Result = " + res).setCancelable(true).setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("RETURN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = db.create();
        alertDialog.setTitle("Done!");
        alertDialog.show();
        resetVal(res);


    }

    public void divPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        float res = Float.valueOf(first.getText().toString()) / Float.valueOf(second.getText().toString());
        AlertDialog.Builder db = new AlertDialog.Builder(MainActivity.this);
        db.setMessage("Result = " + res).setCancelable(true).setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("RETURN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = db.create();
        alertDialog.setTitle("Done!");
        alertDialog.show();
        resetVal(res);

    }

    public void modPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        int res = Integer.parseInt(first.getText().toString()) % Integer.parseInt(second.getText().toString());
        AlertDialog.Builder db = new AlertDialog.Builder(MainActivity.this);
        db.setMessage("Result = " + res).setCancelable(true).setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("RETURN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = db.create();
        alertDialog.setTitle("Done!");
        alertDialog.show();
        resetVal(res);

    }

    public void resetPressed(View view) {
        first = (EditText) findViewById(R.id.num1);
        second = (EditText) findViewById(R.id.num2);
        first.setText("");
        second.setText("");
        resetVal(0);

    }


    public void resetVal(float x) {
        disp = findViewById(R.id.result);
        disp.setText("Result = " + x);

    }
}
