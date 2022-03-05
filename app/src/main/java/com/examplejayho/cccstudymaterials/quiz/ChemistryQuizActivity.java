package com.examplejayho.cccstudymaterials.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion1;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion10;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion2;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion3;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion4;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion5;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion6;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion7;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion8;
import com.examplejayho.cccstudymaterials.Chemistry.ChemistryQuestion9;
import com.examplejayho.cccstudymaterials.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class ChemistryQuizActivity extends AppCompatActivity {
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    Button bfinish;
    Button bskip;
    String category;
    ImageView ciconbtn1;
    ImageView ciconbtn2;
    ImageView ciconbtn3;
    ImageView ciconbtn4;
    private static final String AD_UNIT_ID = "ca-app-pub-7635336144239737/6010651296";
    private static final String TAG = "ChemistryQuizActivity";
    /* renamed from: i */
    Intent f3052i;
    ImageView iconbtn1;
    ImageView iconbtn2;
    ImageView iconbtn3;
    ImageView iconbtn4;
    private AdView mAdView;
    private String mAnswer;
    private ChemistryQuestion1 mQuestions1 = new ChemistryQuestion1();
    private ChemistryQuestion10 mQuestions10 = new ChemistryQuestion10();
    private ChemistryQuestion2 mQuestions2 = new ChemistryQuestion2();
    private ChemistryQuestion3 mQuestions3 = new ChemistryQuestion3();
    private ChemistryQuestion4 mQuestions4 = new ChemistryQuestion4();
    private ChemistryQuestion5 mQuestions5 = new ChemistryQuestion5();
    private ChemistryQuestion6 mQuestions6 = new ChemistryQuestion6();
    private ChemistryQuestion7 mQuestions7 = new ChemistryQuestion7();
    private ChemistryQuestion8 mQuestions8 = new ChemistryQuestion8();
    private ChemistryQuestion9 mQuestions9 = new ChemistryQuestion9();
    private int mQuestionsLength;
    private int mScore = 0;
    TextView question;
    int questionno = 0;
    TextView score;
    ImageView sharequestion;
    String subcategory;
    int time = 1000;
    private int totalanswer = 0;
    TextView wrong;
    private int wrongans = 0;
    private InterstitialAd minterstitialAd;
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_quiz);
        Intent intent = getIntent();
        this.f3052i = intent;
        this.category = intent.getStringExtra("category");
        String stringExtra = this.f3052i.getStringExtra("sub");
        this.subcategory = stringExtra;
        getcategory(this.category, stringExtra);
        this.score = (TextView) findViewById(R.id.score);
        this.wrong = (TextView) findViewById(R.id.wrongscore);
        TextView textView = (TextView) findViewById(R.id.question);
        this.question = textView;
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,AD_UNIT_ID, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        minterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.i(TAG, loadAdError.getMessage());
                        minterstitialAd = null;
                    }
                });
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.answer1 = (Button) findViewById(R.id.answer1);
        this.answer2 = (Button) findViewById(R.id.answer2);
        this.answer3 = (Button) findViewById(R.id.answer3);
        this.answer4 = (Button) findViewById(R.id.answer4);
        this.bfinish = (Button) findViewById(R.id.finish);
        this.iconbtn1 = (ImageView) findViewById(R.id.iconbtn1);
        this.iconbtn2 = (ImageView) findViewById(R.id.iconbtn2);
        this.iconbtn3 = (ImageView) findViewById(R.id.iconbtn3);
        this.iconbtn4 = (ImageView) findViewById(R.id.iconbtn4);
        this.ciconbtn1 = (ImageView) findViewById(R.id.correcticonbtn1);
        this.ciconbtn2 = (ImageView) findViewById(R.id.correcticonbtn2);
        this.ciconbtn3 = (ImageView) findViewById(R.id.correcticonbtn3);
        this.ciconbtn4 = (ImageView) findViewById(R.id.correcticonbtn4);
        this.sharequestion = (ImageView) findViewById(R.id.sharequestion);
        updateQuestion(this.questionno);
        loadbannerads();
        this.answer1.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$2$ChemistryQuizActivity(view);
            }
        });
        this.answer2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$5$ChemistryQuizActivity(view);
            }
        });
        this.answer3.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$8$ChemistryQuizActivity(view);
            }
        });
        this.answer4.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$11$ChemistryQuizActivity(view);
            }
        });
        this.bfinish.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$12$ChemistryQuizActivity(view);
            }
        });
        Button button = (Button) findViewById(R.id.skip);
        this.bskip = button;
        button.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$13$ChemistryQuizActivity(view);
            }
        });
        this.sharequestion.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$onCreate$14$ChemistryQuizActivity(view);
            }
        });
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbartitle();
//        toolbar.setTitleTextColor(-1);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                ChemistryQuizActivity.this.finish();
//            }
//        });
    }

    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$onCreate$2$ChemistryQuizActivity(View view) {
        disabledbutton();
        this.questionno++;
        if (this.answer1.getText().toString().equalsIgnoreCase(this.mAnswer)) {
            int i = this.mScore + 1;
            this.mScore = i;
            this.score.setText(String.valueOf(i));
            this.iconbtn1.setVisibility(0);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    ChemistryQuizActivity.this.lambda$null$0$ChemistryQuizActivity();
                }
            }, (long) this.time);
            return;
        }
        int i2 = this.wrongans + 1;
        this.wrongans = i2;
        this.wrong.setText(String.valueOf(i2));
        checkcorrectans(this.mAnswer);
        this.ciconbtn1.setVisibility(0);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ChemistryQuizActivity.this.lambda$null$1$ChemistryQuizActivity();
            }
        }, (long) this.time);
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$0$ChemistryQuizActivity() {
        this.iconbtn1.setVisibility(4);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$1$ChemistryQuizActivity() {
        this.ciconbtn1.setVisibility(4);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$onCreate$5$ChemistryQuizActivity(View view) {
        disabledbutton();
        this.questionno++;
        if (this.answer2.getText().toString().equalsIgnoreCase(this.mAnswer)) {
            this.mScore++;
            this.score.setText("" + this.mScore);
            this.iconbtn2.setVisibility(0);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    ChemistryQuizActivity.this.lambda$null$3$ChemistryQuizActivity();
                }
            }, (long) this.time);
            return;
        }
        int i = this.wrongans + 1;
        this.wrongans = i;
        this.wrong.setText(String.valueOf(i));
        checkcorrectans(this.mAnswer);
        this.ciconbtn2.setVisibility(0);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ChemistryQuizActivity.this.lambda$null$4$ChemistryQuizActivity();
            }
        }, (long) this.time);
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$3$ChemistryQuizActivity() {
        this.iconbtn2.setVisibility(4);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$4$ChemistryQuizActivity() {
        this.ciconbtn2.setVisibility(4);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$onCreate$8$ChemistryQuizActivity(View view) {
        disabledbutton();
        this.questionno++;
        if (this.answer3.getText().toString().equalsIgnoreCase(this.mAnswer)) {
            this.mScore++;
            this.score.setText("" + this.mScore);
            this.iconbtn3.setVisibility(0);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    ChemistryQuizActivity.this.lambda$null$6$ChemistryQuizActivity();
                }
            }, (long) this.time);
            return;
        }
        int i = this.wrongans + 1;
        this.wrongans = i;
        this.wrong.setText(String.valueOf(i));
        checkcorrectans(this.mAnswer);
        this.ciconbtn3.setVisibility(0);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ChemistryQuizActivity.this.lambda$null$7$ChemistryQuizActivity();
            }
        }, (long) this.time);
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$6$ChemistryQuizActivity() {
        this.iconbtn3.setVisibility(8);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$7$ChemistryQuizActivity() {
        this.ciconbtn3.setVisibility(4);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$onCreate$11$ChemistryQuizActivity(View view) {
        disabledbutton();
        this.questionno++;
        if (this.answer4.getText().toString().equalsIgnoreCase(this.mAnswer)) {
            this.mScore++;
            this.score.setText("" + this.mScore);
            this.iconbtn4.setVisibility(0);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    ChemistryQuizActivity.this.lambda$null$9$ChemistryQuizActivity();
                }
            }, (long) this.time);
            return;
        }
        int i = this.wrongans + 1;
        this.wrongans = i;
        this.wrong.setText(String.valueOf(i));
        checkcorrectans(this.mAnswer);
        this.ciconbtn4.setVisibility(0);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ChemistryQuizActivity.this.lambda$null$10$ChemistryQuizActivity();
            }
        }, (long) this.time);
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$9$ChemistryQuizActivity() {
        this.iconbtn4.setVisibility(8);
        updateQuestion(this.questionno);
        enabledbutton();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$null$10$ChemistryQuizActivity() {
        enabledbutton();
        this.ciconbtn4.setVisibility(8);
        updateQuestion(this.questionno);
    }

    public /* synthetic */ void lambda$onCreate$12$ChemistryQuizActivity(View view) {
        gameOver();
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$onCreate$13$ChemistryQuizActivity(View view) {
        int i = this.questionno + 1;
        this.questionno = i;
        updateQuestion(i);
    }

    public /* synthetic */ void lambda$onCreate$14$ChemistryQuizActivity(View view) {
        sharequestionsmethod(this.question.getText().toString(), this.answer1.getText().toString(), this.answer2.getText().toString(), this.answer3.getText().toString(), this.answer4.getText().toString());
    }

    private void enabledbutton() {
        this.answer1.setClickable(true);
        this.answer2.setClickable(true);
        this.answer3.setClickable(true);
        this.answer4.setClickable(true);
    }

    private void disabledbutton() {
        this.answer1.setClickable(false);
        this.answer2.setClickable(false);
        this.answer3.setClickable(false);
        this.answer4.setClickable(false);
    }

    private void toolbartitle() {
        if (this.subcategory.equalsIgnoreCase("sub1")) {
            setTitle(getResources().getString(R.string.subcategory1));
        } else if (this.subcategory.equalsIgnoreCase("sub2")) {
            setTitle(getResources().getString(R.string.subcategory2));
        } else if (this.subcategory.equalsIgnoreCase("sub3")) {
            setTitle(getResources().getString(R.string.subcategory3));
        } else if (this.subcategory.equalsIgnoreCase("sub4")) {
            setTitle(getResources().getString(R.string.subcategory4));
        } else if (this.subcategory.equalsIgnoreCase("sub5")) {
            setTitle(getResources().getString(R.string.subcategory5));
        } else if (this.subcategory.equalsIgnoreCase("sub6")) {
            setTitle(getResources().getString(R.string.subcategory6));
        } else if (this.subcategory.equalsIgnoreCase("sub7")) {
            setTitle(getResources().getString(R.string.subcategory7));
        } else if (this.subcategory.equalsIgnoreCase("sub8")) {
            setTitle(getResources().getString(R.string.subcategory8));
        } else if (this.subcategory.equalsIgnoreCase("sub9")) {
            setTitle(getResources().getString(R.string.subcategory9));
        } else if (this.subcategory.equalsIgnoreCase("sub10")) {
            setTitle(getResources().getString(R.string.subcategory10));
        }
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

    private void sharequestionsmethod(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.share_subject));
        intent.putExtra("android.intent.extra.TEXT", str + "\n(1) " + str2 + "\n(2) " + str3 + "\n(3) " + str4 + "\n(4) " + str5 + "\n" + Constant.share_link);
        startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
    }

    private void getcategory(String str, String str2) {
        if (str2.equalsIgnoreCase("sub1")) {
            this.mQuestionsLength = this.mQuestions1.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub2")) {
            this.mQuestionsLength = this.mQuestions2.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub3")) {
            this.mQuestionsLength = this.mQuestions3.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub4")) {
            this.mQuestionsLength = this.mQuestions4.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub5")) {
            this.mQuestionsLength = this.mQuestions5.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub6")) {
            this.mQuestionsLength = this.mQuestions6.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub7")) {
            this.mQuestionsLength = this.mQuestions7.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub8")) {
            this.mQuestionsLength = this.mQuestions8.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub9")) {
            this.mQuestionsLength = this.mQuestions9.mQuestion.length;
        } else if (str2.equalsIgnoreCase("sub10")) {
            this.mQuestionsLength = this.mQuestions10.mQuestion.length;
        }
    }
    @SuppressLint("WrongConstant")
    private void checkcorrectans(String str) {
        if (this.answer1.getText().toString().equalsIgnoreCase(str)) {
            this.iconbtn1.setVisibility(0);
        } else if (this.answer2.getText().toString().equalsIgnoreCase(str)) {
            this.iconbtn2.setVisibility(0);
        } else if (this.answer3.getText().toString().equalsIgnoreCase(str)) {
            this.iconbtn3.setVisibility(0);
        } else if (this.answer4.getText().toString().equalsIgnoreCase(str)) {
            this.iconbtn4.setVisibility(0);
        }
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ChemistryQuizActivity.this.lambda$checkcorrectans$15$ChemistryQuizActivity();
            }
        }, (long) this.time);
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$checkcorrectans$15$ChemistryQuizActivity() {
        this.iconbtn1.setVisibility(4);
        this.iconbtn2.setVisibility(4);
        this.iconbtn3.setVisibility(4);
        this.iconbtn4.setVisibility(4);
    }

    private void updateQuestion(int i) {
        if (this.subcategory.equalsIgnoreCase("sub1")) {
            int i2 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView = this.question;
                textView.setText("Q " + i2 + ". " + this.mQuestions1.getQuestion(i));
                this.answer1.setText(this.mQuestions1.getChoice1(i));
                this.answer2.setText(this.mQuestions1.getChoice2(i));
                this.answer3.setText(this.mQuestions1.getChoice3(i));
                this.answer4.setText(this.mQuestions1.getChoice4(i));
                this.mAnswer = this.mQuestions1.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub2")) {
            int i3 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView2 = this.question;
                textView2.setText("Q " + i3 + ". " + this.mQuestions2.getQuestion(i));
                this.answer1.setText(this.mQuestions2.getChoice1(i));
                this.answer2.setText(this.mQuestions2.getChoice2(i));
                this.answer3.setText(this.mQuestions2.getChoice3(i));
                this.answer4.setText(this.mQuestions2.getChoice4(i));
                this.mAnswer = this.mQuestions2.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub3")) {
            int i4 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView3 = this.question;
                textView3.setText("Q " + i4 + ". " + this.mQuestions3.getQuestion(i));
                this.answer1.setText(this.mQuestions3.getChoice1(i));
                this.answer2.setText(this.mQuestions3.getChoice2(i));
                this.answer3.setText(this.mQuestions3.getChoice3(i));
                this.answer4.setText(this.mQuestions3.getChoice4(i));
                this.mAnswer = this.mQuestions3.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub4")) {
            int i5 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView4 = this.question;
                textView4.setText("Q " + i5 + ". " + this.mQuestions4.getQuestion(i));
                this.answer1.setText(this.mQuestions4.getChoice1(i));
                this.answer2.setText(this.mQuestions4.getChoice2(i));
                this.answer3.setText(this.mQuestions4.getChoice3(i));
                this.answer4.setText(this.mQuestions4.getChoice4(i));
                this.mAnswer = this.mQuestions4.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub5")) {
            int i6 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView5 = this.question;
                textView5.setText("Q " + i6 + ". " + this.mQuestions5.getQuestion(i));
                this.answer1.setText(this.mQuestions5.getChoice1(i));
                this.answer2.setText(this.mQuestions5.getChoice2(i));
                this.answer3.setText(this.mQuestions5.getChoice3(i));
                this.answer4.setText(this.mQuestions5.getChoice4(i));
                this.mAnswer = this.mQuestions5.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub6")) {
            int i7 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView6 = this.question;
                textView6.setText("Q " + i7 + ". " + this.mQuestions6.getQuestion(i));
                this.answer1.setText(this.mQuestions6.getChoice1(i));
                this.answer2.setText(this.mQuestions6.getChoice2(i));
                this.answer3.setText(this.mQuestions6.getChoice3(i));
                this.answer4.setText(this.mQuestions6.getChoice4(i));
                this.mAnswer = this.mQuestions6.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub7")) {
            int i8 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView7 = this.question;
                textView7.setText("Q " + i8 + ". " + this.mQuestions7.getQuestion(i));
                this.answer1.setText(this.mQuestions7.getChoice1(i));
                this.answer2.setText(this.mQuestions7.getChoice2(i));
                this.answer3.setText(this.mQuestions7.getChoice3(i));
                this.answer4.setText(this.mQuestions7.getChoice4(i));
                this.mAnswer = this.mQuestions7.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub8")) {
            int i9 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView8 = this.question;
                textView8.setText("Q " + i9 + ". " + this.mQuestions8.getQuestion(i));
                this.answer1.setText(this.mQuestions8.getChoice1(i));
                this.answer2.setText(this.mQuestions8.getChoice2(i));
                this.answer3.setText(this.mQuestions8.getChoice3(i));
                this.answer4.setText(this.mQuestions8.getChoice4(i));
                this.mAnswer = this.mQuestions8.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub9")) {
            int i10 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView9 = this.question;
                textView9.setText("Q " + i10 + ". " + this.mQuestions9.getQuestion(i));
                this.answer1.setText(this.mQuestions9.getChoice1(i));
                this.answer2.setText(this.mQuestions9.getChoice2(i));
                this.answer3.setText(this.mQuestions9.getChoice3(i));
                this.answer4.setText(this.mQuestions9.getChoice4(i));
                this.mAnswer = this.mQuestions9.getCorrectAnswer(i);
                return;
            }
            gameOver();
        } else if (this.subcategory.equalsIgnoreCase("sub10")) {
            int i11 = i + 1;
            if (i < this.mQuestionsLength) {
                TextView textView10 = this.question;
                textView10.setText("Q " + i11 + ". " + this.mQuestions10.getQuestion(i));
                this.answer1.setText(this.mQuestions10.getChoice1(i));
                this.answer2.setText(this.mQuestions10.getChoice2(i));
                this.answer3.setText(this.mQuestions10.getChoice3(i));
                this.answer4.setText(this.mQuestions10.getChoice4(i));
                this.mAnswer = this.mQuestions10.getCorrectAnswer(i);
                return;
            }
            gameOver();
        }
    }

    public void gameOver() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(R.layout.activity_done_acivity, (ViewGroup) null);
        this.totalanswer = this.mScore + this.wrongans;
        ((TextView) inflate.findViewById(R.id.yourscore)).setText(this.mScore + " Correct");
        ((TextView) inflate.findViewById(R.id.wrongans)).setText(this.wrongans + " Incorrect");
        ((TextView) inflate.findViewById(R.id.totalscore)).setText(this.mScore + " / " + this.totalanswer);
        ((Button) inflate.findViewById(R.id.shareResult)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$gameOver$16$ChemistryQuizActivity(view);
            }
        });
        ((Button) inflate.findViewById(R.id.newQuiz)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$gameOver$17$ChemistryQuizActivity(view);
            }
        });
        builder.setView(inflate);
        AlertDialog create = builder.create();
        ((Button) inflate.findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChemistryQuizActivity.this.lambda$gameOver$18$ChemistryQuizActivity(view);
            }
        });
//        ((Button) inflate.findViewById(C3585R.C3588id.rsetquiz)).setOnClickListener(new View.OnClickListener(create) {
//            public final /* synthetic */ AlertDialog f$1;
//
//            {
//                this.f$1 = r2;
//            }
//
//            public final void onClick(View view) {
//                ChemistryQuizActivity.this.lambda$gameOver$19$ChemistryQuizActivity(this.f$1, view);
//            }
//        });
        create.show();
        create.setCancelable(false);
        create.setCanceledOnTouchOutside(false);
    }

    public /* synthetic */ void lambda$gameOver$16$ChemistryQuizActivity(View view) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.share_subject));
        intent.putExtra("android.intent.extra.TEXT", "Your Score : " + this.mScore + "\nTotal Score : " + this.totalanswer + Constant.share_link);
        startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
    }
    @SuppressLint("WrongConstant")
    public /* synthetic */ void lambda$gameOver$17$ChemistryQuizActivity(View view) {
        finishAffinity();
        Intent intent = new Intent(getApplicationContext(), SubCategoryActivity.class);
        intent.addFlags(67108864);
        startActivity(intent);
    }

    public /* synthetic */ void lambda$gameOver$18$ChemistryQuizActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$gameOver$19$ChemistryQuizActivity(AlertDialog alertDialog, View view) {
        this.questionno = 0;
        this.mScore = 0;
        this.wrongans = 0;
        this.totalanswer = 0;
        this.score.setText(String.valueOf(0));
        this.wrong.setText(String.valueOf(this.wrongans));
        updateQuestion(this.questionno);
        alertDialog.dismiss();
    }
    public void onBackPressed() {
        if (minterstitialAd != null) {
            minterstitialAd.show(ChemistryQuizActivity.this);
        }else {
            super.onBackPressed();
            finish();
        }
    }
    /* access modifiers changed from: protected */
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}
