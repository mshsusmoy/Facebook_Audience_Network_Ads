package com.example.adds;
import com.facebook.ads.*;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;



public class button2 extends AppCompatActivity {
    private com.facebook.ads.InterstitialAd interstitialAd,interstitialAd2;
    AdView adView3,adView4;
    private InterstitialAd mInterstitialAd,mInterestialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        AudienceNetworkAds.initialize(this);

        adView3 = new AdView(this, "520210448517491_520216051850264",

                AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView3);
        adView3.loadAd();
        Log.d("",""+adView3.getPlacementId());

        adView4 = new AdView(this, "520210448517491_520216411850228",

                AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = (LinearLayout) findViewById(R.id.banner_container2);
        adContainer2.addView(adView4);
        adView4.loadAd();

        interstitialAd = new com.facebook.ads.InterstitialAd(this, "520210448517491_520216941850175");
        // Set listeners for the Interstitial Ad
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();

        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, "520210448517491_520217118516824");
        // Set listeners for the Interstitial Ad
        interstitialAd2.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

                interstitialAd2.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd2.loadAd();
    }

//      MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
//        adView3 = findViewById(R.id.ad_view3);
//        adView4 = findViewById(R.id.ad_view4);

        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build();

        // Start loading the ad in the background.
//        adView3.loadAd(adRequest);
//        adView4.loadAd(adRequest);
//
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        mInterstitialAd.setAdListener(new AdListener(){
//            @Override
//            public void onAdLoaded() {
//                if(mInterstitialAd.isLoaded()){
//                    mInterstitialAd.show();
//                }
//            }
//        });
//
//        mInterestialAd2 = new InterstitialAd(this);
//        mInterestialAd2.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterestialAd2.loadAd(new AdRequest.Builder().build());
//        mInterestialAd2.setAdListener(new AdListener(){
//            @Override
//            public void onAdLoaded() {
//                if(mInterestialAd2.isLoaded()){
//                    mInterestialAd2.show();
//                }
//            }
//        });

    @Override
    protected void onDestroy() {
        if (adView3 != null ) {
            adView3.destroy();
        }
        if(adView4 != null){
            adView4.destroy();
        }
        super.onDestroy();
    }

}
