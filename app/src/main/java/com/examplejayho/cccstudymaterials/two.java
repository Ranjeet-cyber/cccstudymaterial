package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class two extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                R.drawable.exam,
                R.drawable.exam,R.drawable.exam,
                ///add imags here in formats

        };
        String[] title = new String[]{

                "CCC Practice Set 1","CCC Practice Set 2","CCC Practice Set 3","CCC Practice Set 4","CCC Practice Set 5","CCC Practice Set 6","CCC Practice Set 7",
                "CCC Practice Set 8","CCC Practice Set 9","CCC Practice Set 10","CCC Practice Set 11","CCC Practice Set 12","CCC Practice Set 13","CCC Practice Set 14","CCC Practice Set 15"
        };
        String[] html = new String[]{

                "c1","c2","c3","c4","c5","c6","c7","c8","c9","c10",

                "c11","c12","c13","c14","c15",
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}