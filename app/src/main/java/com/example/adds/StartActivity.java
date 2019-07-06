package com.example.adds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class StartActivity extends AppCompatActivity {

    AdView adView,adView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        AudienceNetworkAds.initialize(this);

        adView = new com.facebook.ads.AdView(this, "520210448517491_520213531850516",

                com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container_start);
        adContainer.addView(adView);
        adView.loadAd();


        adView2 = new com.facebook.ads.AdView(this, "520210448517491_520213978517138",

                AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = (LinearLayout) findViewById(R.id.banner_container_start_1);
        adContainer2.addView(adView2);
        adView2.loadAd();
    }
}
