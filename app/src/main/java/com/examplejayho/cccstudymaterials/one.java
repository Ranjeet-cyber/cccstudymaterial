package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity1;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity2;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity3;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity4;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity5;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity6;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity7;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity8;
import com.examplejayho.cccstudymaterials.quiz.SubCategoryActivity9;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        CardView rs1card = findViewById(R.id.card_view);
        CardView rs2card = findViewById(R.id.card_view1);
        CardView rs3card = findViewById(R.id.card_view2);
        CardView rs4card = findViewById(R.id.card_view3);
        CardView rs5card = findViewById(R.id.card_view4);
        CardView rs6card = findViewById(R.id.card_view5);
        CardView rs7card = findViewById(R.id.card_view6);
        CardView rs8card = findViewById(R.id.card_view7);
        CardView rs9card = findViewById(R.id.card_view8);
        CardView rs10card = findViewById(R.id.card_view9);
        rs1card.setOnClickListener(v -> {
            Toast.makeText(this, "Computer", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity.class);
            startActivity(intent);

        });
        rs2card.setOnClickListener(v -> {
            Toast.makeText(this, "india", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity1.class);
            startActivity(intent);

        });
        rs3card.setOnClickListener(v -> {
            Intent intent = new Intent(one.this, SubCategoryActivity2.class);
            startActivity(intent);
        });
        rs4card.setOnClickListener(v -> {
            Toast.makeText(this, "geo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity3.class);
            startActivity(intent);

        });
        rs5card.setOnClickListener(v -> {
            Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity4.class);
            startActivity(intent);
        });
        rs6card.setOnClickListener(v -> {
            Toast.makeText(this, "chemistry", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity5.class);
            startActivity(intent);
        });
        rs7card.setOnClickListener(v -> {
            Intent intent = new Intent(one.this, SubCategoryActivity6.class);
            startActivity(intent);
        });
        rs8card.setOnClickListener(v -> {
            Toast.makeText(this, "geo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity7.class);
            startActivity(intent);

        });
        rs9card.setOnClickListener(v -> {
            Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity8.class);
            startActivity(intent);
        });
        rs10card.setOnClickListener(v -> {
            Toast.makeText(this, "chemistry", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(one.this, SubCategoryActivity9.class);
            startActivity(intent);
        });

    }
}