package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class five extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        recyclerView = findViewById(R.id.recyclerView1);
        int [] images =new int[]{
                R.drawable.circle, R.drawable.sheet,
                R.drawable.sheet,R.drawable.sheet,
                R.drawable.sheet, R.drawable.sheet,
                R.drawable.presentation,R.drawable.presentation,
                R.drawable.saar, R.drawable.saar,

        };
        String[] title = new String[]{

                "LibreOffice का परिचय","LibreOffice Calc","LibreOffice Calc Function","LibreOffice Calc Formula","LibreOffice Calc ShortCut Keys","LibreOffice Calc Use","LibreOffice Impress & use",
                "LibreOffice Impress Shortcuts","LibreOffice Writer & use","LibreOffice Writer Shortcut keys"
        };
        String[] html = new String[]{

                "libre","calc","calcfunction","calcformula","calcshortcut","calcuse","impress","impressshortcut","writer","writershortcut"
        };
        adapter=new CustomAdapter(this,images,title,html);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}