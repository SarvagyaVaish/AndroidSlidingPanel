package com.survy.slidingpanel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Page1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_panel_wrapper);

        /*
         * Page content fragment
         */
        Page1Fragment pageContentFragment = new Page1Fragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.page_content, pageContentFragment)
                .commit();

        /*
         * Sliding panel content fragment
         */
        SlidingPanelFragment slidingPanelFragment = new SlidingPanelFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.sliding_panel_content, slidingPanelFragment)
                .commit();
    }
}
