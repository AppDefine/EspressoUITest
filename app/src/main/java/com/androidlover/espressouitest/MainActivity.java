package com.androidlover.espressouitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.edittext);
    }

    public void next(View view) {
        Intent i=new Intent(MainActivity.this,secondActivity.class);
        i.putExtra("key1",editText.getText().toString());
        startActivity(i);
    }
}