package com.ehappy.a8recipesofoctopus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

//    private void setShareIntent(Intent shareIntent) {
//        if (mShareActionProvider != null) {
//            mShareActionProvider.setShareIntent(shareIntent);
//        }
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.action_settings:
                final Intent browserIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ehappy.a8recipesofoctopus"));
                startActivity(browserIntent);
                break;
            case R.id.help:
                String[] names={"小卷體內的透明幾丁質內殼較寬，各腕具有2列吸盤，但不會變形為鉤狀構造。",
                        "烏賊俗稱花枝，在口部周圍具有10隻附肢",
                        "魷魚有10隻附肢，其中8隻為腕，另2隻為具有伸縮性的觸腕",
                        "透抽外套膜較為細長，身體後半段有一對長菱形的鰭",
                        "章魚在口部周圍僅有8隻腕，缺乏觸腕，故又被稱作八爪魚"};
                int i = (int) (Math.random() * names.length);
                String element = names[i];
                Toast.makeText(getApplicationContext(),element,Toast.LENGTH_LONG).show();
                break;
            case R.id.share:
                final Intent fbIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/sharer/sharer.php?u=https%3A//play.google.com/store/apps/details?id=com.ehappy.a8recipesofoctopus"));
                startActivity(fbIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /** Called when the user taps the Send button */
    public void openRecipe1(View view) {
        Intent intent = new Intent(this, OcTo1.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe2(View view) {
        Intent intent = new Intent(this, OcTo2.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe3(View view) {
        Intent intent = new Intent(this, OcTo3.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe4(View view) {
        Intent intent = new Intent(this, OcTo4.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe5(View view) {
        Intent intent = new Intent(this, OcTo5.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe6(View view) {
        Intent intent = new Intent(this, OcTo6.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe7(View view) {
        Intent intent = new Intent(this, OcTo7.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openRecipe8(View view) {
        Intent intent = new Intent(this, OcTo8.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}