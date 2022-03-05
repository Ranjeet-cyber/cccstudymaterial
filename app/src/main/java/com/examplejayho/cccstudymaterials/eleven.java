package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class eleven extends AppCompatActivity {
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
                R.drawable.exam,R.drawable.exam,
                ///add imags here in formats

        };
        String[] title = new String[]{

                "CCC Q&A Previous Solution Set 1","CCC Q&A Previous Solution Set 2","CCC Q&A Previous Solution Set 3","CCC Q&A Previous Solution Set 4",
                "CCC Q&A Previous Solution Set 5","CCC Q&A Previous Solution Set 6","CCC Q&A Previous Solution Set 7",
                "CCC Q&A Previous Solution Set 8","CCC Q&A Previous Solution Set 9","CCC Q&A Previous Solution Set 10","CCC Q&A Previous Solution Set 11",
                "CCC Q&A Previous Solution Set 12","CCC Q&A Previous Solution Set 13","CCC Q&A Previous Solution Set 14",
        };
        String[] html = new String[]{

                "1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14",
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}