package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.examplejayho.cccstudymaterials.office.excel;
import com.examplejayho.cccstudymaterials.office.powerpoint;
import com.examplejayho.cccstudymaterials.office.word;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity1;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity2;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity3;

public class six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        CardView rs1card = findViewById(R.id.card_view);
        CardView rs2card = findViewById(R.id.card_view1);
        CardView rs3card = findViewById(R.id.card_view2);
        rs1card.setOnClickListener(v -> {
            Intent intent = new Intent(six.this, excel.class);
            startActivity(intent);

        });
        rs2card.setOnClickListener(v -> {
            Intent intent = new Intent(six.this, powerpoint.class);
            startActivity(intent);

        });
        rs3card.setOnClickListener(v -> {
            Intent intent = new Intent(six.this, word.class);
            startActivity(intent);
        });

    }
}