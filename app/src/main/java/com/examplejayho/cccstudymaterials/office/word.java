package com.examplejayho.cccstudymaterials.office;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.examplejayho.cccstudymaterials.CustomAdapter;
import com.examplejayho.cccstudymaterials.R;

public class word extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.word,R.drawable.word,
                R.drawable.word,R.drawable.word,
                R.drawable.word,R.drawable.word,
                R.drawable.word,R.drawable.word,
                R.drawable.word,  R.drawable.word,
                R.drawable.word

        };
        String[] title = new String[]{

                "माइक्रोसॉफ़्ट ऑफ़िस","How to start MS Word","MS Word Menu Options","Use Help Option In MS Word","Create Document in MS Word","Saving Document in MS Word","Page Setup Option in MS Word",
                "Print in MS word","MS Word","200+ MS Word Q&A Part 1","200+ MS Word Q&A Part 1"
        };
        String[] html = new String[]{

                "microsoftoffice","msword","mswordmenu","mswordhelp","mswordcreatedoc","mswordsaving","mswordpagesetup","mswordprint","msword","A3","A2"
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}