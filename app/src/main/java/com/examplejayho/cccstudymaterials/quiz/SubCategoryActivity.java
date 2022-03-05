package com.examplejayho.cccstudymaterials.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.examplejayho.cccstudymaterials.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class SubCategoryActivity extends AppCompatActivity {
    private final String TAG = SubCategoryActivity.class.getSimpleName();
    String category;
    Intent intent;
  private AdView mAdView;
//    private AdView mAdView2;
    private LinearLayout nativeadView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_sub_category);
        Intent intent2 = getIntent();
        this.intent = intent2;
        this.category = intent2.getStringExtra("Category");

        loadbannerads();
    }

    private void loadbannerads() {
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void toolbartitle() {
        if (this.category.equalsIgnoreCase("World")) {
            setTitle(getResources().getString(R.string.world));
        } else if (this.category.equalsIgnoreCase("world")) {
            setTitle(getResources().getString(R.string.world));
        } else if (this.category.equalsIgnoreCase("geo")) {
            setTitle(getResources().getString(R.string.geo));
        } else if (this.category.equalsIgnoreCase("history")) {
            setTitle(getResources().getString(R.string.history));
        } else if (this.category.equalsIgnoreCase("chemistry")) {
            setTitle(getResources().getString(R.string.chem));
        } else if (this.category.equalsIgnoreCase("bio")) {
            setTitle(getResources().getString(R.string.bio));
        } else if (this.category.equalsIgnoreCase("sports")) {
            setTitle(getResources().getString(R.string.sports));
        } else if (this.category.equalsIgnoreCase("economy")) {
            setTitle(getResources().getString(R.string.economy));
        } else if (this.category.equalsIgnoreCase("physics")) {
            setTitle(getResources().getString(R.string.physics));
        } else if (this.category.equalsIgnoreCase("politics")) {
            setTitle(getResources().getString(R.string.politics));
      }
    }

    public void cardClick(View view) {
      //  if (this.category.equalsIgnoreCase("world")) {
        setTitle(getResources().getString(R.string.world
        ));
        Intent intent3 = new Intent(this, WorldQuizActivity.class);
        if (view.getId() == R.id.sub1) {
            intent3.putExtra("sub", "sub1");
        } else if (view.getId() == R.id.sub2) {
            intent3.putExtra("sub", "sub2");
        } else if (view.getId() == R.id.sub3) {
            intent3.putExtra("sub", "sub3");
        } else if (view.getId() == R.id.sub4) {
            intent3.putExtra("sub", "sub4");
        } else if (view.getId() == R.id.sub5) {
            intent3.putExtra("sub", "sub5");
        } else if (view.getId() == R.id.sub6) {
            intent3.putExtra("sub", "sub6");
        } else if (view.getId() == R.id.sub7) {
            intent3.putExtra("sub", "sub7");
        } else if (view.getId() == R.id.sub8) {
            intent3.putExtra("sub", "sub8");
        } else if (view.getId() == R.id.sub9) {
            intent3.putExtra("sub", "sub9");
        } else if (view.getId() == R.id.sub10) {
            intent3.putExtra("sub", "sub10");
        }
        intent3.putExtra("category", this.category);
        startActivity(intent3);
        }
//        if (this.category.equalsIgnoreCase("world")) {
//            setTitle(getResources().getString(R.string.world));
//            Intent intent3 = new Intent(this, WorldQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent3.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent3.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent3.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent3.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent3.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent3.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent3.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent3.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent3.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent3.putExtra("sub", "sub10");
//            }
//            intent3.putExtra("category", this.category);
//            startActivity(intent3);
//        }
//        if (this.category.equalsIgnoreCase("geo")) {
//            setTitle(getResources().getString(R.string.geo));
//            Intent intent4 = new Intent(this, GeoQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent4.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent4.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent4.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent4.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent4.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent4.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent4.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent4.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent4.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent4.putExtra("sub", "sub10");
//            }
//            intent4.putExtra("category", this.category);
//            startActivity(intent4);
//        }
//        if (this.category.equalsIgnoreCase("history")) {
//            setTitle(getResources().getString(R.string.history));
//            Intent intent5 = new Intent(this, HistoryQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent5.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent5.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent5.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent5.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent5.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent5.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent5.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent5.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent5.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent5.putExtra("sub", "sub10");
//            }
//            intent5.putExtra("category", this.category);
//            startActivity(intent5);
//        }
//        if (this.category.equalsIgnoreCase("chemistry")) {
//            setTitle(getResources().getString(R.string.chem));
//            Intent intent6 = new Intent(this, ChemistryQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent6.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent6.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent6.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent6.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent6.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent6.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent6.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent6.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent6.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent6.putExtra("sub", "sub10");
//            }
//            intent6.putExtra("category", this.category);
//            startActivity(intent6);
//        }
//        if (this.category.equalsIgnoreCase("bio")) {
//            setTitle(getResources().getString(R.string.bio));
//            Intent intent7 = new Intent(this, BioQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent7.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent7.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent7.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent7.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent7.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent7.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent7.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent7.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent7.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent7.putExtra("sub", "sub10");
//            }
//            intent7.putExtra("category", this.category);
//            startActivity(intent7);
//        }
//        if (this.category.equalsIgnoreCase("sports")) {
//            setTitle(getResources().getString(R.string.sports));
//            Intent intent8 = new Intent(this, SportsQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent8.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent8.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent8.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent8.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent8.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent8.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent8.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent8.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent8.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent8.putExtra("sub", "sub10");
//            }
//            intent8.putExtra("category", this.category);
//            startActivity(intent8);
//        }
//        if (this.category.equalsIgnoreCase("economy")) {
//            setTitle(getResources().getString(R.string.economy));
//            Intent intent9 = new Intent(this, EconomyQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent9.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent9.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent9.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent9.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent9.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent9.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent9.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent9.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent9.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent9.putExtra("sub", "sub10");
//            }
//            intent9.putExtra("category", this.category);
//            startActivity(intent9);
//        }
//        if (this.category.equalsIgnoreCase("physics")) {
//            setTitle(getResources().getString(R.string.physics));
//            Intent intent10 = new Intent(this, PhysicsQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent10.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent10.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent10.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent10.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent10.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent10.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent10.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent10.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent10.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent10.putExtra("sub", "sub10");
//            }
//            intent10.putExtra("category", this.category);
//            startActivity(intent10);
//        }
//        if (this.category.equalsIgnoreCase("politics")) {
//            setTitle(getResources().getString(R.string.politics));
//            Intent intent11 = new Intent(this, PoliticsQuizActivity.class);
//            if (view.getId() == R.id.sub1) {
//                intent11.putExtra("sub", "sub1");
//            } else if (view.getId() == R.id.sub2) {
//                intent11.putExtra("sub", "sub2");
//            } else if (view.getId() == R.id.sub3) {
//                intent11.putExtra("sub", "sub3");
//            } else if (view.getId() == R.id.sub4) {
//                intent11.putExtra("sub", "sub4");
//            } else if (view.getId() == R.id.sub5) {
//                intent11.putExtra("sub", "sub5");
//            } else if (view.getId() == R.id.sub6) {
//                intent11.putExtra("sub", "sub6");
//            } else if (view.getId() == R.id.sub7) {
//                intent11.putExtra("sub", "sub7");
//            } else if (view.getId() == R.id.sub8) {
//                intent11.putExtra("sub", "sub8");
//            } else if (view.getId() == R.id.sub9) {
//                intent11.putExtra("sub", "sub9");
//            } else if (view.getId() == R.id.sub10) {
//                intent11.putExtra("sub", "sub10");
//            }
//            intent11.putExtra("category", this.category);
//            startActivity(intent11);
//        }
//  }

    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
   }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
