package com.zxn.design;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestScrollingActivity extends AppCompatActivity {

    @BindView(R.id.tl_design)
    TabLayout tlDesign;
    @BindView(R.id.vp_design)
    ViewPager vpDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_scrolling);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "是否需要置顶", Snackbar.LENGTH_LONG)
                        .setAction("置顶", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new TopFragment());
        fragments.add(new VideoFragment());
        vpDesign.setAdapter(new VpAdapter(getSupportFragmentManager(),fragments));

        tlDesign.setupWithViewPager(vpDesign);

    }
}
