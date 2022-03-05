package com.examplejayho.cccstudymaterials.office;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.examplejayho.cccstudymaterials.CustomAdapter;
import com.examplejayho.cccstudymaterials.R;

public class powerpoint extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.presentation,R.drawable.presentation,

                ///add imags here in formats

        };
        String[] title = new String[]{

                "Introduction of MS PowerPoint","Powerpoint को start कैसे करें|","Saving a File in MS Power Point ","Create Presentation in MS Power Point","Adding Text to Slides in Power Point","insert, Delete, Copy and Paste slide","Slide में table, graph तथा chart को जोड़ना",
                "Inserting Picture/Chart/Table/Media clip in slide","Slide में Movie or Sound जोड़ना","Different Views of PowerPoint","Custom Show option in Power Point ","Slide Transition"
        };
        String[] html = new String[]{

                "powerpoint","powerpointstart","powerpointsave","powerpointcreate","powerpointslide","powerpointinsert","powerpointgraph","powerpointmedia","powerpointsound","powerpointview",
                "powerpointcustom","powerpointslidetrans",

        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}