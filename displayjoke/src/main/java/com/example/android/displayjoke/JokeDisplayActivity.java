package com.example.android.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView txtDisplay;
    private static final String KEY_BUNDLE = "key_bundle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        txtDisplay = (TextView) findViewById(R.id.txt_Display);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {


            txtDisplay.setText(bundle.getString(KEY_BUNDLE));


        }


    }
}
