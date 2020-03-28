package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    CompoundButton mSwitch, nSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb = (CheckBox)findViewById(R.id.ChangeBlue);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                setChangeBlue();
            }
        });

        mSwitch = findViewById(R.id.switchButton);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                setSwitch();
            }
        });

        nSwitch = findViewById(R.id.switchButton2);
        nSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                setImage();
            }
        });
    }

    int size=14;
    public void bigger(View v){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        txv.setTextSize(++size);
        Log.d("000", "bigger: ");
    }

    public void smaller(View v){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        txv.setTextSize(--size);
        Log.d("001", "smaller: ");
    }

    public void resize(View v){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        size=14;
        txv.setTextSize(size);
        Log.d("002", "resize: ");
    }

    public void changing(){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        txv.setTextColor(Color.rgb(58,91,174));
    }

    public void dischanging(){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        txv.setTextColor(Color.rgb(0,0,0));
    }

    public void setChangeBlue(){
        if(cb.isChecked()==true) changing();
        else if(cb.isChecked()==false) dischanging();
    }

    public void setSwitch(){
        TextView txv;
        txv = (TextView) findViewById(R.id.text);
        if(mSwitch.isChecked()==true) txv.setBackgroundColor(Color.rgb(240,240,240));
        else if(mSwitch.isChecked()==false) txv.setBackgroundColor(Color.rgb(255,255,255));
    }

    public void setImage(){
        View v;
        v = findViewById(R.id.imageView);
        if(nSwitch.isChecked()==true) v.setAlpha(0F);
        else if(nSwitch.isChecked()==false) v.setAlpha(1F);
    }

}
