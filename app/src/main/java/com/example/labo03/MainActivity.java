package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button m_action_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_action_submit = findViewById(R.id.submit_action);

        m_action_submit.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                    Intent m_intent = new Intent(MainActivity.this, NewActivity.class);

                    m_intent.putExtra(AppConstants.TEXT1_KEY, "Texto desde MainAcitivy");

                    startActivity(m_intent);
            }
        });
    }
}
