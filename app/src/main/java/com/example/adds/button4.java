package com.example.adds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;



public class button4 extends AppCompatActivity {
    private com.facebook.ads.InterstitialAd interstitialAd,interstitialAd2;
    AdView adView7,adView8;
    private InterstitialAd mInterstitialAd,mInterestialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);


        AudienceNetworkAds.initialize(this);

        adView7 = new com.facebook.ads.AdView(this, "520210448517491_520219565183246",

                AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container7);
        adContainer.addView(adView7);
        adView7.loadAd();


        adView8 = new com.facebook.ads.AdView(this, "520210448517491_520219745183228",

                AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = (LinearLayout) findViewById(R.id.banner_container8);
        adContainer2.addView(adView8);
        adView8.loadAd();


        interstitialAd = new com.facebook.ads.InterstitialAd(this, "520210448517491_520220751849794");
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


        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, "520210448517491_520220991849770");
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

//        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
//
//        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
//        // values/strings.xml.
//        adView7 = findViewById(R.id.ad_view7);
//        adView8 = findViewById(R.id.ad_view8);
//
//        // Create an ad request. Check your logcat output for the hashed device ID to
//        // get test ads on a physical device. e.g.
//        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build();
//
//        // Start loading the ad in the background.
//        adView7.loadAd(adRequest);
//        adView8.loadAd(adRequest);
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
    }
}
