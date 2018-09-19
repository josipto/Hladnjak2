package com.example.racunalo.hladnjak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /* Bundle podatak = getIntent().getExtras();
        if (podatak == null){
            return;
        }
        String poruka = podatak.getString("poruka");
        final TextView drugaText = (TextView) findViewById(R.id.textView2);
        drugaText.setText(poruka);*/

    }
    public void onClick(View view){
        Intent i = new Intent(this, Main3Activity.class);

        Bundle podatak1 = getIntent().getExtras();
        if (podatak1 == null){
            return;
        }
        String prvi_ventilator = podatak1.getString("prvi_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String drugi_promjer = "0";
        drugi_promjer = promjerUlaz.getText().toString();
        /*if (drugi_promjer!=null && drugi_promjer.isEmpty())drugi_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String drugi_nbo = "0";
        drugi_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String drugi_orijentacija = "0";
        drugi_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String drugi_tbo = "0";
        drugi_tbo = tboUlaz.getText().toString();

        String izlaz2=prvi_ventilator.concat(drugi_promjer).concat("/").concat(drugi_nbo).concat("/").concat(drugi_orijentacija).concat("/").concat(drugi_tbo).concat("//");
        i.putExtra("drugi_ventilator", izlaz2);

        startActivity(i);
    }

    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        Bundle podatak1 = getIntent().getExtras();
        if (podatak1 == null){
            return;
        }
        String prvi_ventilator = podatak1.getString("prvi_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText); //cita iz editTexta i sprema u string
        String drugi_promjer = "0";
        drugi_promjer = promjerUlaz.getText().toString();
        /*if (drugi_promjer!=null && drugi_promjer.isEmpty())drugi_promjer="0";*/ //postavlja u 0 ako nitko nije pisao u editText

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String drugi_nbo = "0";
        drugi_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String drugi_orijentacija = "0";
        drugi_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String drugi_tbo = "0";
        drugi_tbo = tboUlaz.getText().toString();

        String izlaz2=prvi_ventilator.concat(drugi_promjer).concat("/").concat(drugi_nbo).concat("/").concat(drugi_orijentacija).concat("/").concat(drugi_tbo).concat("//");
        j.putExtra("drugi_ventilator", izlaz2);

        startActivity(j);
    }
}
