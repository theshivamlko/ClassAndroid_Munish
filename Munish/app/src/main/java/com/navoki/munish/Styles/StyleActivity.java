package com.navoki.munish.Styles;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.navoki.munish.R;

import java.util.ArrayList;

public class StyleActivity extends AppCompatActivity {

    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);


        container = (LinearLayout) findViewById(R.id.container);

        ArrayList<String> list=new ArrayList<>();
        list.add("XYZ");
        list.add("ABC");
        list.add("DEF");



        for(int i=0; i<list.size();i++)
        {
            // inialize
            TextView textView=new TextView(StyleActivity.this);
            textView.setText(list.get(i));
            textView.setTextColor(Color.BLUE);

            // layout paramters to assign posiiton in Layout
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
            , ViewGroup.LayoutParams.WRAP_CONTENT);
            params.topMargin=20;
            params.leftMargin=(int)getResources().getDimension(R.dimen.margin30dp);


            // some logic while adding
            if(i==1)
            {
                textView.setTextColor(Color.RED);

                // dynamic assign clicked
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(StyleActivity.this,"Second element clicked",Toast.LENGTH_SHORT).show();
                    }
                });

            }



            textView.setLayoutParams(params);

            container.addView(textView);

        }


    }
}
