package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class computer extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.book,R.drawable.book,
                R.drawable.book,R.drawable.book,
                R.drawable.book,R.drawable.book,
                R.drawable.book,R.drawable.book,
                R.drawable.book,R.drawable.book,
                R.drawable.book,R.drawable.book,
                R.drawable.book, R.drawable.book,
                R.drawable.book,R.drawable.book
                ///add imags here in formats

        };
        String[] title = new String[]{

                "CCC Exam & Syllabus","कंप्युटर का इतिहास  ","कंप्युटर की पीढ़ी","इनपुट डिवाइस ","आउट्पुट डिवाइस ","सॉफ्टवेयर एण्ड हार्डवेयर ","स्टोरेज डिवाइस ","कंप्युटर मेमोरी यूनिट ",
                "प्रोग्रामिंग भाषा ","कंप्युटर नेटवर्क एण्ड टोपोलॉजी ","फाइल के प्रकार (file Extensions )","dos commands ","शॉर्ट कट keys ","वायरस एण्ड एंटी वायरस ","functions keys ","Important Terms",
        };
        String[] html = new String[]{

               "ccc-syllabus", "history","generation","iput","output","software","storage","memory","language","network","filext",
                "doscommand","shortcutkey", "antivirus","function", "importantfact",

        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}