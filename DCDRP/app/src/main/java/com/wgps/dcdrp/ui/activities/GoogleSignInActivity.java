package com.wgps.dcdrp.ui.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wgps.dcdrp.R;
import com.wgps.dcdrp.ui.fragments.GoogleSignInFragment;

public class GoogleSignInActivity extends BaseSingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new  GoogleSignInFragment();
    }
}
