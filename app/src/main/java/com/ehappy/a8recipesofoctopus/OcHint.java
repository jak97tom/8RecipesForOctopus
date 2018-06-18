package com.ehappy.a8recipesofoctopus;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OcHint extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oc_hint);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("小卷/透抽/軟絲/魷魚/章魚/烏賊?");
        setSupportActionBar(toolbar);

        // 返回鍵
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        }
    }