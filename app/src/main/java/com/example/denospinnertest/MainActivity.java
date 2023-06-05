package com.example.denospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView results;
    Spinner spnYesNo;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        results = findViewById(R.id.Results);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                       results.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        results.setText("Spinner Item, No Selected");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    ;}

}