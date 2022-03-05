package com.examplejayho.cccstudymaterials.office;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.examplejayho.cccstudymaterials.CustomAdapter;
import com.examplejayho.cccstudymaterials.R;

public class excel extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.sheet,R.drawable.sheet,
                R.drawable.sheet,R.drawable.sheet,
                R.drawable.sheet,R.drawable.sheet,
                R.drawable.sheet,R.drawable.sheet,
                R.drawable.sheet,R.drawable.sheet,

                ///add imags here in formats

        };
        String[] title = new String[]{

                "MS Excel","Work Range Using Create, Edit and Select","Print Worksheet in Excel","save worksheet in excel","Formatting Cell (फॉर्मेटिंग सेल)","Data editing in worksheet"," Insert ,Delete, Hide and Unhide Row or Column ",
                "change Column Width in Excel","Functions and its Types","Chart in Excel",
        };
        String[] html = new String[]{

                "msexcelfile","msexcelcreate","msexcelprin","msexcelsave","msexcelcell","msexcelediting","hide","msexcelcolumchange","msexceltypes","msexcelchart",


        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}