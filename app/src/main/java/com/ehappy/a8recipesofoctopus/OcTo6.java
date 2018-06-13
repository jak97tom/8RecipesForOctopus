package com.ehappy.a8recipesofoctopus;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class OcTo6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oc_to6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("五味章魚");
        setSupportActionBar(toolbar);

        // 返回鍵
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
    }
}
