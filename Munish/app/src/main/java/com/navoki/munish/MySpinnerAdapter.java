package com.navoki.munish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Name name on 5/8/2018.
 */
public class MySpinnerAdapter extends ArrayAdapter {

    Context context;
    ArrayList<Student> arrayList;

    public MySpinnerAdapter(@NonNull Context context, ArrayList<Student> arrayList) {
        super(context, R.layout.item_custome_list);

        this.arrayList = arrayList;
        this.context = context;

    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = View.inflate(context, R.layout.item_custome_list, null);
        TextView textView;
        final EditText imageView;
        Button button;

        textView = (TextView) view.findViewById(R.id.textView);
        imageView = (EditText) view.findViewById(R.id.imageView);
        button = (Button) view.findViewById(R.id.button);

        Student student = arrayList.get(position);

        textView.setText(student.getName() + " " + student.getSubject());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position + " " + imageView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;

    }


    @Override
    public View getDropDownView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = View.inflate(context, R.layout.item_custome_list, null);
        TextView textView;
        final EditText imageView;
        Button button;

        textView = (TextView) view.findViewById(R.id.textView);
        imageView = (EditText) view.findViewById(R.id.imageView);
        button = (Button) view.findViewById(R.id.button);

        Student student = arrayList.get(position);

        textView.setText(student.getName() + " " + student.getSubject());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position + " " + imageView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
