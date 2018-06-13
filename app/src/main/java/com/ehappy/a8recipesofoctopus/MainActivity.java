package com.ehappy.a8recipesofoctopus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
//    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.help:
                Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
                break;
//            case R.id.update:
//                Toast.makeText(getApplicationContext(),"你不知道jian yang堅持只有8種章魚食譜做法嗎？",Toast.LENGTH_SHORT).show();
//                break;
//            default:
//            case R.id.share

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