package com.examplejayho.cccstudymaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;

public class ten extends AppCompatActivity {
    private String GAMEID="4434611";
    private String Banner_id="Banner_Android";
    private String interstial_id="Interstitial_Android";
    private boolean test=false;
    private LinearLayout BannerAds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        PDFView pdfView = findViewById(R.id.pdfView);
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);
        pdfView.fromAsset("pdf/CEO.pdf").load();
        UnityAds.initialize(this, GAMEID, test);
        BannerAds = findViewById(R.id.bannerid);
        BannerView view = new BannerView(this, Banner_id, new UnityBannerSize(320, 50));
        view.load();
        BannerAds.addView(view);
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
    }
    private void DisplayInterstitialAd() {
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
