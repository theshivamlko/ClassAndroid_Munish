package com.navoki.munish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    private RecyclerView recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);


        recycle = (RecyclerView) findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(
                RecycleActivity.this,LinearLayoutManager.VERTICAL,false);


        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(
                RecycleActivity.this,LinearLayoutManager.HORIZONTAL,false);

        recycle.setLayoutManager(linearLayoutManager2);

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


        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);


        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);


        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        MyRecycleView adapter=new MyRecycleView(RecycleActivity.this,arrayList);
        recycle.setAdapter(adapter);




    }
}
