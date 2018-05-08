package com.navoki.munish;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText4;
    private CheckBox checkBox2;
    private RadioGroup radioGroup;
    private Button button2;
    private Context context;
    private String TAG=MainActivity.class.getSimpleName();
    private Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText4 = (EditText) findViewById(R.id.editText4);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        button2 = (Button) findViewById(R.id.button2);
        switch1 = (Switch) findViewById(R.id.switch1);

        context=MainActivity.this;

        editText4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        editText4.setHint(getString(R.string.str));



        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("MESSAGE CHEKED",isChecked+"");
                checkBox2.setText("Yes");
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if(checkedId==R.id.radioButton1)
                {
                    Log.e(TAG,"RADIO1 "+checkedId);
                }
                else if(checkedId==R.id.radioButton2)
                {
                    Log.e(TAG,"RADIO2");

                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Main2ActivityAdapters.class);
                startActivity(intent);
            }
        });


        switch1.setTextOff("OFF");
        switch1.setTextOff("ON");

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("MESSAGE CHEKED",isChecked+"");

            }
        });
    }
}
