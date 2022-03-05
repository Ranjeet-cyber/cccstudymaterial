package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class eight extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.internet, R.drawable.internet,
                R.drawable.internet,R.drawable.internet,
                R.drawable.internet,R.drawable.internet,
                R.drawable.internet,R.drawable.internet,
                R.drawable.internet, R.drawable.internet,

        };
        String[] title = new String[]{

                "इंटरनेट","What is E-Mail","E-Mail Address","E-Mail Client","Creating E-Mail Account","Using Address Book","Terms Of E-Mail",
                "Advantages of Email","History Of E-Mail","G-Mail"
        };
        String[] html = new String[]{

                "internet","rmail","emailaddressl","emailclient","emailaccount","emailbook","emailterm","emailadvantage","emailhistory","gemail"
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}