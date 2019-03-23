package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class NewActivity extends AppCompatActivity {

    TextView mText1, mText2, mText3, mText4;
    Button mSubmitAction;
    String text_aux, dato2, dato3, dato4;
    JSONObject jsonx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        jsonx=new JSONObject();

        recibirdatos();

        try{
            jsonx.put("user", text_aux);
            jsonx.put("password", dato2);
            jsonx.put("email", dato3);
            jsonx.put("gender", dato4);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT, jsonx.toString());

                startActivity(m_intent2);
            }
        });
    }

    private void recibirdatos(){

        mText1 = findViewById(R.id.prueba_text);
        mText2 = findViewById(R.id.text2);
        mText3 = findViewById(R.id.text3);
        mText4 = findViewById(R.id.text4);
        mSubmitAction = findViewById(R.id.submit2_action);

        Intent new_intent = getIntent();
        Bundle datos = new_intent.getExtras();

        if(datos != null || dato2 != null || dato3 != null || dato4 != null){
            assert datos != null;
            text_aux = datos.getString(AppConstants.TEXT1_KEY);
            dato2 = datos.getString(AppConstants.TEXT2_KEY);
            dato3 = datos.getString(AppConstants.TEXT3_KEY);
            dato4 = datos.getString(AppConstants.TEXT4_KEY);
        }

        mText1.setText(text_aux);
        mText2.setText(dato2);
        mText3.setText(dato3);
        mText4.setText(dato4);
    }
}
