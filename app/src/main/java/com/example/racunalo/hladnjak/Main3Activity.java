package com.example.racunalo.hladnjak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Main4Activity.class);

        Bundle podatak2 = getIntent().getExtras();
        if (podatak2 == null){
            return;
        }
        String drugi_ventilator = podatak2.getString("drugi_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String treci_promjer = "0";
        treci_promjer = promjerUlaz.getText().toString();
        /*if (treci_promjer!=null && treci_promjer.isEmpty())treci_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String treci_nbo = "0";
        treci_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String treci_orijentacija = "0";
        treci_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String treci_tbo = "0";
        treci_tbo = tboUlaz.getText().toString();

        String izlaz3=drugi_ventilator.concat("/").concat(treci_promjer).concat("/").concat(treci_nbo).concat("/").concat(treci_orijentacija).concat("/").concat(treci_tbo).concat("//");
        i.putExtra("treci_ventilator", izlaz3);

        startActivity(i);
    }
    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        Bundle podatak2 = getIntent().getExtras();
        if (podatak2 == null){
            return;
        }
        String drugi_ventilator = podatak2.getString("drugi_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String treci_promjer = "0";
        treci_promjer = promjerUlaz.getText().toString();
       /* if (treci_promjer!=null && treci_promjer.isEmpty())treci_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String treci_nbo = "0";
        treci_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String treci_orijentacija = "0";
        treci_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String treci_tbo = "0";
        treci_tbo = tboUlaz.getText().toString();

        String izlaz3=drugi_ventilator.concat("/").concat(treci_promjer).concat("/").concat(treci_nbo).concat("/").concat(treci_orijentacija).concat("/").concat(treci_tbo).concat("//");
        j.putExtra("treci_ventilator", izlaz3);

        startActivity(j);
    }
}
