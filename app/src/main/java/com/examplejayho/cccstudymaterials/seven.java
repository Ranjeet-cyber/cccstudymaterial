package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class seven extends AppCompatActivity {
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
                R.drawable.book,

        };
        String[] title = new String[]{

                "CCC FullForm Set 1 (A to D)","CCC FullForm Set 2 (E to H)","CCC FullForm Set 3 (I to L)","CCC FullForm Set 4 (M to P)","CCC FullForm Set 5 (Q to T)","CCC FullForm Set 6 (U to Z)","Complete Abbreviations"
        };
        String[] html = new String[]{

                "Full1","Full2","ijkl","Full3","Full4","uvwxz","Abbreviation"
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}