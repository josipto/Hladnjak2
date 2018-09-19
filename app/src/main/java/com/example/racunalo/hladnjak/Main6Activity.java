package com.example.racunalo.hladnjak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Main7Activity.class);

        Bundle podatak5 = getIntent().getExtras();
        if (podatak5 == null){
            return;
        }
        String peti_ventilator = podatak5.getString("peti_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String sesti_promjer = "0";
        sesti_promjer = promjerUlaz.getText().toString();
        /*if (sesti_promjer!=null && sesti_promjer.isEmpty())sesti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String sesti_nbo = "0";
        sesti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String sesti_orijentacija = "0";
        sesti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String sesti_tbo = "0";
        sesti_tbo = tboUlaz.getText().toString();

        String izlaz6=peti_ventilator.concat("/").concat(sesti_promjer).concat("/").concat(sesti_nbo).concat("/").concat(sesti_orijentacija).concat("/").concat(sesti_tbo).concat("//");
        i.putExtra("sesti_ventilator", izlaz6);

        startActivity(i);
    }
    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        Bundle podatak5 = getIntent().getExtras();
        if (podatak5 == null){
            return;
        }
        String peti_ventilator = podatak5.getString("peti_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String sesti_promjer = "0";
        sesti_promjer = promjerUlaz.getText().toString();
        /*if (sesti_promjer!=null && sesti_promjer.isEmpty())sesti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String sesti_nbo = "0";
        sesti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String sesti_orijentacija = "0";
        sesti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String sesti_tbo = "0";
        sesti_tbo = tboUlaz.getText().toString();

        String izlaz6=peti_ventilator.concat("/").concat(sesti_promjer).concat("/").concat(sesti_nbo).concat("/").concat(sesti_orijentacija).concat("/").concat(sesti_tbo).concat("//");
        j.putExtra("sesti_ventilator", izlaz6);

        startActivity(j);
    }
}
