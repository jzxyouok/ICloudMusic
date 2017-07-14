package com.ding.god.icloudmusic.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.ding.god.icloudmusic.R;
import com.ding.god.icloudmusic.customview.TopBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.topBar)
    TopBar topBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        View view = LayoutInflater.from(this).inflate(R.layout.layout_activity_main_topbar_tablayout, null);
        topBar.addCenterView(view);
    }
}
