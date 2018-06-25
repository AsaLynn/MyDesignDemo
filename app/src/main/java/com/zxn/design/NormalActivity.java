package com.zxn.design;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NormalActivity extends AppCompatActivity {

    @BindView(R.id.btn_show)
    Button btnShow;
    @BindView(R.id.fab1)
    FloatingActionButton fab1;
    @BindView(R.id.root_ll)
    LinearLayout rootLl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_show)
    public void onViewClicked() {
        //Snackbar.make()
        Snackbar.make(rootLl,"hello this is snackbar!",Snackbar.LENGTH_LONG).show();
    }

}
