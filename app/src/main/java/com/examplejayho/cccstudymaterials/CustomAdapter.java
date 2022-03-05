package com.examplejayho.cccstudymaterials;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {
    Context context;
    int[]image;
    String[]title;
    String[]html;

    public CustomAdapter(Context context, int[] image, String[] title, String[] html) {
        this.context = context;
        this.image = image;
        this.title = title;
        this.html = html;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.grid_layout,parent,false);

        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        final String htmlfile= html[position];
        int images=image[position];
        holder.cardView.setCardBackgroundColor(getRandomColorCode());
        holder.imageView.setImageResource(images);
        holder.textView.setText(title[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,onedesc.class);
                intent.putExtra("file",htmlfile);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        CardView cardView;
        TextView textView;
        LinearLayout linearLayout;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.card_view00);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linear);
            imageView=(ImageView)itemView.findViewById(R.id.imageView2);
            textView=(TextView)itemView.findViewById(R.id.textView2);
        }
    }
    public int getRandomColorCode(){

        Random random = new Random();

        return Color.argb(255, random.nextInt(256), random.nextInt(256),     random.nextInt(256));

    }
}
