package com.wgps.dcdrp.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wgps.dcdrp.R;
import com.facebook.FacebookSdk;

public class AndroidFacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_android_facebook_activity);
    }
}
