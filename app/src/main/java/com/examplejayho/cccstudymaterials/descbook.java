package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;

public class descbook extends AppCompatActivity {
    private String GAMEID="4434611";
    private String Banner_id="Banner_Android";
    private String interstial_id="Interstitial_Android";
    private boolean test=false;
    private LinearLayout BannerAds;
    private AdView mAdView;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descbook);
        PDFView pdfView = findViewById(R.id.pdfView);
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);
        UnityAds.initialize(this, GAMEID, test);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
//        BannerAds = findViewById(R.id.bannerid);
//        BannerView view = new BannerView(this, Banner_id, new UnityBannerSize(320, 50));
//        view.load();
//        BannerAds.addView(view);
        IUnityAdsListener unityAdsListener = new IUnityAdsListener() {
            @Override
            public void onUnityAdsReady(String s) {

            }

            @Override
            public void onUnityAdsStart(String s) {

            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {
            }
        };
        UnityAds.setListener(unityAdsListener);
        int story_position=getIntent().getIntExtra("key_position",0);

        if (story_position==1){
            pdfView.fromAsset("pdf/2book.pdf").load();
        }

        else if (story_position==2){
            pdfView.fromAsset("pdf/3book.pdf").load();
        }

        else if (story_position==3){
            pdfView.fromAsset("pdf/4book.pdf").load();
        }
        else if (story_position==4){
            pdfView.fromAsset("pdf/5book.pdf").load();
        }

        else if (story_position==5){
            pdfView.fromAsset("pdf/6book.pdf").load();
        }
        else if (story_position==6){
            pdfView.fromAsset("pdf/7book.pdf").load();
        }

        else if (story_position==7){
            pdfView.fromAsset("pdf/8book.pdf").load();
        }
        else if (story_position==8){
            pdfView.fromAsset("pdf/9book.pdf").load();
        }

        else if (story_position==9){//10
            pdfView.fromAsset("pdf/10book.pdf").load();
        }
        else if (story_position==10){
            pdfView.fromAsset("pdf/11book.pdf").load();
        }

        else if (story_position==11){//12
            pdfView.fromAsset("pdf/12book.pdf").load();
        }
        else if (story_position==12){
            pdfView.fromAsset("pdf/13book.pdf").load();
        }
        else if (story_position==0){
            pdfView.fromAsset("pdf/1book.pdf").load();
        }

        else if (story_position==13){
            pdfView.fromAsset("pdf/shortnotescomputer.pdf").load();
        }
        progress();
    }
    private void progress() {
        @SuppressLint("HandlerLeak") Handler handle = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                progressDialog.incrementProgressBy(2); // Incremented By Value 2
            }
        };
        progressDialog = new ProgressDialog(descbook.this);
        progressDialog.setMax(100); // Progress Dialog Max Value
        progressDialog.setMessage("Loading..."); // Setting Message
        progressDialog.setTitle("Data Is Loading"); // Setting Title
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (progressDialog.getProgress() <= progressDialog.getMax()) {
                        Thread.sleep(50);
                        handle.sendMessage(handle.obtainMessage());
                        if (progressDialog.getProgress() == progressDialog.getMax()) {
                            progressDialog.dismiss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
} private void DisplayInterstitialAd() {
        if (UnityAds.isInitialized()){
            UnityAds.load(interstial_id);
        }
    }

    @Override
    public void onBackPressed() {
       UnityBanners.destroy();
        super.onBackPressed();
        if (UnityAds.isReady(interstial_id)) {
            DisplayInterstitialAd();
            UnityAds.show(this, interstial_id);
        }
    }
}
