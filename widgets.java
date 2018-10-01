package com.example.mekki.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener ,RadioGroup.OnCheckedChangeListener{

    TextView textView;
    RadioGroup radioGroup;
    CheckBox checkBox;
    ImageButton imageButton;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton =findViewById(R.id.btn);
        textView=findViewById(R.id.tex);
        checkBox=findViewById(R.id.ch);
        radioGroup=findViewById(R.id.red);
        toggleButton=findViewById(R.id.toggleButton2);

        imageButton.setOnClickListener(this);
        checkBox.setOnClickListener(this);
        toggleButton.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view==imageButton)
        {
            textView.setText("image button is clicked ");
        }else if (view==checkBox){
            if (checkBox.isChecked()==true){
                textView.setText(" clicked ");
            }else {
                textView.setText("unclicked ");
            }
        }else if (view==toggleButton){
            if (toggleButton.isChecked()){
                textView.setText("toggle ON");
            }else {
                textView.setText("toggle off");
            }
        }

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.radioButton:
                textView.setText("radio button1");
                break;
            case R.id.radioButton2:
                textView.setText("radio button2");
                break;
            case R.id.radioButton3:
                textView.setText("radio button3");
                break;
        }

    }
}
