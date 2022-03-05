package com.examplejayho.cccstudymaterials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.BuildConfig;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import eu.dkaratzas.android.inapp.update.Constants;
import eu.dkaratzas.android.inapp.update.InAppUpdateManager;
import eu.dkaratzas.android.inapp.update.InAppUpdateStatus;

public class MainActivity extends AppCompatActivity implements InAppUpdateManager.InAppUpdateHandler  {
    InAppUpdateManager inAppUpdateManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView rs1card = findViewById(R.id.python);
        CardView rs2card = findViewById(R.id.india);
        CardView rs3card = findViewById(R.id.world);
        CardView rs4card = findViewById(R.id.geo);
        CardView rs5card = findViewById(R.id.history);
        CardView rs6card = findViewById(R.id.chemistry);
        CardView rs7card = findViewById(R.id.bio);
        CardView rs8card = findViewById(R.id.sports);
        CardView rs9card = findViewById(R.id.economy);
        CardView rs10card = findViewById(R.id.physics);
        CardView rs11card = findViewById(R.id.politics);
        // App Update
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);
        inAppUpdateManager=InAppUpdateManager.Builder(this,101)
                .resumeUpdates(true)
                .mode(Constants.UpdateMode.FLEXIBLE)
                .snackBarAction("An Update Has Just Been Downloaded.")
                .snackBarAction("RESTART")
                .handler(this);
        inAppUpdateManager.checkForAppUpdate();


        rs1card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,three.class);
            startActivity(intent);

        });
        rs2card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,one.class);
            startActivity(intent);

        });
        rs3card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, computer.class);
            startActivity(intent);
        });
        rs4card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,four.class);
            startActivity(intent);

        });
        rs5card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,five.class);
            startActivity(intent);
        });
        rs6card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,six.class);
            startActivity(intent);
        });
        rs7card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,seven.class);
            startActivity(intent);
        });
        rs8card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,eight.class);
            startActivity(intent);

        });
        rs9card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,two.class);
            startActivity(intent);
        });
        rs10card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,ten.class);
            startActivity(intent);

        });
        rs11card.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,eleven.class);
            startActivity(intent);

        });

        if (!isconnected()) {
            Dialog();
        } else {

        }
    }

    private boolean isconnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission") NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();

    }

    private void desc1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.Theme_MaterialComponents_BottomSheetDialog);
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.aboutt,(ConstraintLayout) findViewById(R.id.layout_countainer));
        builder.setView(view);
        ((TextView) view.findViewById(R.id.text15)).setText(getResources().getString(R.string.v1));
        ((TextView) view.findViewById(R.id.text161)).setText(getResources().getString(R.string.v2));
        ((Button) view.findViewById(R.id.btnNo12)).setText(getResources().getString(R.string.ok));
        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.btnNo12).setOnClickListener(view1 -> alertDialog.cancel());

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            alertDialog.show();
        }
    }
    private void About() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.Theme_MaterialComponents_BottomSheetDialog);
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.aboutt,(ConstraintLayout) findViewById(R.id.layout_countainer));
        builder.setView(view);
        ((TextView) view.findViewById(R.id.text15)).setText(getResources().getString(R.string.app_name));
        ((TextView) view.findViewById(R.id.text161)).setText(getResources().getString(R.string.v));
        ((TextView) view.findViewById(R.id.text16)).setText(getResources().getString(R.string.ranjit));
        ((TextView) view.findViewById(R.id.text162)).setText(getResources().getString(R.string.by));
         ((Button) view.findViewById(R.id.btnNo12)).setText(getResources().getString(R.string.ok));
        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.btnNo12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.cancel();

            }
        });

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            alertDialog.show();
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.PrivcyPolicy) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://latestupdate2020.blogspot.com/2021/10/privacy-policy-for-ccc-app.html")));
        } else if (itemId == R.id.share) {
            Intent sharing = new Intent(Intent.ACTION_SEND);
            sharing.setType("text/plain");
            String sharebody = "http://play.google.com/store/apps/details?id="+ getPackageName();
            //paste your link here........
            String sharesubject="Share App With Your Friends..";
            sharing.putExtra(Intent.EXTRA_TEXT,sharebody);
            sharing.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
            startActivity(Intent.createChooser(sharing,"share using"));
            Toast.makeText(MainActivity.this, " share", Toast.LENGTH_SHORT).show();

        } else if (itemId == R.id.about) {
            About();

        }
        else if (itemId == R.id.More) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Ram Dagar")));


        }
        else if (itemId == R.id.desc1) {
            desc1();

        }
        else if (itemId == R.id.rate) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            Toast.makeText(MainActivity.this, "Rating us", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(menuItem);}
    private void Dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.Widget_AppCompat_ActionBar_Solid);
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.success_dialog,(ConstraintLayout) findViewById(R.id.layout_countainer));
        builder.setView(view);
        ((TextView) view.findViewById(R.id.text15)).setText(getResources().getString(R.string.alert));
        ((TextView) view.findViewById(R.id.text16)).setText(getResources().getString(R.string.warning1));
        ((ImageView) view.findViewById(R.id.imageView15)).setImageResource(R.drawable.ic_baseline_warning_24);
        ((Button) view.findViewById(R.id.btnNo)).setText(getResources().getString(R.string.close));
        ((Button) view.findViewById(R.id.btnYes)).setText(getResources().getString(R.string.ok));
        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.btnYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        view.findViewById(R.id.btnNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.cancel();

            }
        });
        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            alertDialog.show();
        }
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this, R.style.Theme_AppCompat_Dialog_Alert)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton(android.R.string.yes, (dialog, which) -> {
                    MainActivity.this.finish();

                })

                .setNeutralButton("More Apps", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Ram Dagar")));
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .show();


    }

    @Override
    public void onInAppUpdateError(int code, Throwable error) {

    }

    @Override
    public void onInAppUpdateStatus(InAppUpdateStatus status) {
        if (status.isDownloaded()){
            View view = getWindow().getDecorView().findViewById(R.id.content);
            Snackbar snackbar = Snackbar.make(view,"An update has Just been Downloaded.",Snackbar.LENGTH_SHORT);
            snackbar.setAction("", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    inAppUpdateManager.completeUpdate();
                    snackbar.show();
                }
            });
        }

    }
}