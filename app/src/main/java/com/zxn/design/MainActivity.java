package com.zxn.design;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fab_show)
    FloatingActionButton fabShow;
    @BindView(R.id.cl_root)
    CoordinatorLayout clRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.fab_show)
    public void onViewClicked() {
//        Snackbar.make(fabShow.getRootView(), "this is snackbar in CoordinatorLayout", Snackbar.LENGTH_LONG).show();
        Snackbar.make(clRoot, "this is snackbar in CoordinatorLayout", Snackbar.LENGTH_LONG).show();
    }
}
