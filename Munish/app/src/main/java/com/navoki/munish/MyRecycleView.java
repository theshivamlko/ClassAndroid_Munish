package com.navoki.munish;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Name name on 5/8/2018.
 */
public class MyRecycleView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    Context context;
    ArrayList<Student> arrayList;

    public MyRecycleView(@NonNull Context context, ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
        this.context = context;

    }


    class MyView extends RecyclerView.ViewHolder
    {
        private TextView textView;
        private EditText imageView;
        private Button button;

        public MyView(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
            imageView = (EditText) view.findViewById(R.id.imageView);
            button = (Button) view.findViewById(R.id.button);

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=View.inflate(context,R.layout.item_custome_list,null);

        MyView myView=new MyView(view);
        return myView;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        final MyView myView=(MyView)holder;
        Student student=arrayList.get(position);

        myView.textView.setText(student.getName());


        if(position%2==0)
            myView.textView.setTextColor(Color.GREEN);

        myView.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position + " " + myView.imageView.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
