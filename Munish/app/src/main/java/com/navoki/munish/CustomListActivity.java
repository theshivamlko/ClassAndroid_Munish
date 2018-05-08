package com.navoki.munish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    private ListView list;
    private Spinner spinner;
    private GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);


        list = (ListView) findViewById(R.id.list);
        spinner = (Spinner) findViewById(R.id.spinner);
        grid = (GridView) findViewById(R.id.grid);

        ArrayList<Student> arrayList = new ArrayList<>();

        Student student = new Student();
        student.setName("XYZ");
        student.setSubject("MATHS");
        student.setRoll("122323");

        Student student2 = new Student();
        student2.setName("XYZ2");
        student2.setSubject("MATHS2");
        student2.setRoll("122323-2");

        Student student3 = new Student();
        student3.setName("XYZ3");
        student3.setSubject("MATHS3");
        student3.setRoll("122323-3");

        Student student4 = new Student();
        student4.setName("XYZ4");
        student4.setSubject("MATHS4");
        student4.setRoll("122323-4");

        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        MyAdapter myAdapter=new MyAdapter(CustomListActivity.this,arrayList);
        list.setAdapter(myAdapter);
        grid.setAdapter(myAdapter);

        MySpinnerAdapter mySpinnerAdapter=new MySpinnerAdapter(CustomListActivity.this,arrayList);
        spinner.setAdapter(mySpinnerAdapter);


    }
}
