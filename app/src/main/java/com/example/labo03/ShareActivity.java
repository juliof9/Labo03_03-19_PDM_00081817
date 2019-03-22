package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView mSharedText, mSharedText2, mSharedTExt3, mSharedText4;
    private String text_aux, getText_aux, getText_aux2, getText_aux3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText = findViewById(R.id.shared_text);
        mSharedText2 = findViewById(R.id.t2);
        mSharedTExt3 = findViewById(R.id.t3);
        mSharedText4 = findViewById(R.id.t4);

        Intent new_intent = getIntent();

        if(new_intent != null){
            text_aux = new_intent.getStringExtra(Intent.EXTRA_TEXT);
            getText_aux = new_intent.getStringExtra(Intent.EXTRA_TEXT);
            getText_aux2 = new_intent.getStringExtra(Intent.EXTRA_TEXT);
            getText_aux3 = new_intent.getStringExtra(Intent.EXTRA_TEXT);
        }

        mSharedText.setText(text_aux);
        mSharedText2.setText(getText_aux);
        mSharedTExt3.setText(getText_aux2);
        mSharedText4.setText(getText_aux3);
    }
}
