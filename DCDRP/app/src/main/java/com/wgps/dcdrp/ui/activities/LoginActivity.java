package com.wgps.dcdrp.ui.activities;

import android.support.v4.app.Fragment;

import com.wgps.dcdrp.ui.fragments.LoginFragment;

/**
 * Created by koushik on 12/9/2016.
 */
public class LoginActivity extends  BaseSingleFragmentActivity {

    protected Fragment createFragment() {
        return new LoginFragment();
    }
}
