package com.navoki.munish;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2ActivityAdapters extends AppCompatActivity {

    private ListView list2;
    private Context context;
    private AutoCompleteTextView autoCompleteTextView;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_adapters);

        context=Main2ActivityAdapters.this;

        list2 = (ListView) findViewById(R.id.list2);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        spinner = (Spinner) findViewById(R.id.spinner);

        String [] arr = getResources().getStringArray(R.array.months);
        final ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        list.add("QWERTY");
        list.add(0,"ABC");
        list.set(1,"XYZ");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(context,R.layout.item_list1,R.id.textView,list);
        list2.setAdapter(adapter);


        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(2);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(context,position+" "+list.get(position),Toast.LENGTH_SHORT).show();
              //  finish();
            }
        });

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv=view.findViewById(R.id.textView);
                 Toast.makeText(context,position+" "+tv.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });



    }
}
