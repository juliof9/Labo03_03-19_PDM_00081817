package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView mSharedText;
    private String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText = findViewById(R.id.shared_text);

        text_aux = "Texto quemado";

        Intent new_intent = getIntent();

        if(new_intent != null){
            text_aux = new_intent.getStringExtra(Intent.EXTRA_TEXT);
        }

        mSharedText.setText(text_aux);
    }
}
