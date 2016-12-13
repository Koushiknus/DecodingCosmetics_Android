package com.wgps.dcdrp.ui.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wgps.dcdrp.R;
/*
    Author : Koushik Radhakrishnan
    Date: 9/12/2016
    Description : Abstract class for Fragment creation
 */
public abstract class BaseSingleFragmentActivity extends BaseAbstractActivity {

    /*
        Returns you needed Fragment to be created
     */
    protected abstract Fragment createFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_single_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Create a FrameLayout for the Fragments to be attached
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = createFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }

    }
}
