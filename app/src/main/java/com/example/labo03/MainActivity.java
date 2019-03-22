package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button m_action_submit;
    EditText users;
    EditText passwords;
    EditText emails;
    EditText genders;
    String dato, dato2, dato3, dato4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_action_submit = findViewById(R.id.submit_action);
        users = findViewById(R.id.users);
        passwords = findViewById(R.id.passwords);
        emails = findViewById(R.id.emails);
        genders = findViewById(R.id.genders);

        m_action_submit.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                    Intent m_intent = new Intent(MainActivity.this, NewActivity.class);

                    dato = users.getText().toString();
                    dato2 = passwords.getText().toString();
                    dato3 = emails.getText().toString();
                    dato4 = genders.getText().toString();

                    m_intent.putExtra(AppConstants.TEXT1_KEY, dato);
                    m_intent.putExtra(AppConstants.TEXT2_KEY, dato2);
                    m_intent.putExtra(AppConstants.TEXT3_KEY, dato3);
                    m_intent.putExtra(AppConstants.TEXT4_KEY, dato4);

                    startActivity(m_intent);
            }
        });
    }
}
