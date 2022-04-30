package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView,textView2,textView4,valueOfPounds;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.textView);
        textView2=(TextView) findViewById(R.id.textView2);
        textView4=(TextView) findViewById(R.id.textView4);
        valueOfPounds=(TextView) findViewById(R.id.valueOfPounds);
        button=(Button) findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Converter();
           }
       });


    }
    private void Converter()
    {
        String valueinKilo=editText.getText().toString();
        double Kilo=Double.parseDouble(valueinKilo);
        
    }
}