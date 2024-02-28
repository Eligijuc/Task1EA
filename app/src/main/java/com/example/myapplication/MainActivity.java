package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvmain = findViewById(R.id.tvmain);
    }

    public void ChangeMainTxt(View view) {
        this.tvmain.setText("The World Is Mine!");
    }

    public void ChangeTxtColor(View view) {
        this.tvmain.setTextColor(Color.RED);
    }
}