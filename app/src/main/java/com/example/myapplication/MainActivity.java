package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private enum OPERATOR{
        PLUS, SUBTRACT, MULTIPLY, DIVIDE, EQUAL
    }
    TextView txtCalculations;
    TextView txtResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCalculations=(TextView)findViewById(R.id.txtCalculations);
        txtResults = (TextView)findViewById(R.id.txtResults);

        findViewById(R.id.equal).setOnClickListener(MainActivity.this);
        findViewById(R.id.eight).setOnClickListener(MainActivity.this);
        findViewById(R.id.seven).setOnClickListener(MainActivity.this);
        findViewById(R.id.nine).setOnClickListener(MainActivity.this);
        findViewById(R.id.plus).setOnClickListener(MainActivity.this);
        findViewById(R.id.four).setOnClickListener(MainActivity.this);
        findViewById(R.id.five).setOnClickListener(MainActivity.this);
        findViewById(R.id.six).setOnClickListener(MainActivity.this);
        findViewById(R.id.minus).setOnClickListener(MainActivity.this);
        findViewById(R.id.one).setOnClickListener(MainActivity.this);
        findViewById(R.id.two).setOnClickListener(MainActivity.this);
        findViewById(R.id.three).setOnClickListener(MainActivity.this);
        findViewById(R.id.multiply).setOnClickListener(MainActivity.this);
        findViewById(R.id.C).setOnClickListener(MainActivity.this);
        findViewById(R.id.zero).setOnClickListener(MainActivity.this);
        findViewById(R.id.divide).setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.equal:
                break;
            case R.id.seven:
                break;
            case R.id.eight:
                break;
            case R.id.nine:
                break;
            case R.id.plus:
                break;
            case R.id.four:
                break;
            case R.id.five:
                break;
            case R.id.six:
                break;
            case R.id.minus:
                break;
            case R.id.one:
                break;
            case R.id.two:
                break;
            case R.id.three:
                break;
            case R.id.multiply:
                break;
            case R.id.C:
                break;
            case R.id.zero:
                break;
            case R.id.divide:
                break;
        }
    }
}
