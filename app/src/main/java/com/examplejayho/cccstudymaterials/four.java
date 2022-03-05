package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class four extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology,
                R.drawable.biology,R.drawable.biology
                ///add imags here in formats

        };
        String[] title = new String[]{

                "GUI (ग्राफिकल यूजर इंटरफ़ेस) क्या है","Operating System","What is Linux","History of Linux","Feature Of Linux","Linux File System","Linux Commands",
                "KERNEL in Linux","What is Window","Window का विकास","Windows structure","Features of Windows XP","Start Menu in windows","Display Setting in Windows",
        };
        String[] html = new String[]{

                "gui","operating","linux","historylinux","featurelinux","filesystemlinux","commandlinux","kernallinux","window","windowkavikas",
                "windowstructre","windowsfeature", "windowsstartmenu","windowsdisply",

        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}