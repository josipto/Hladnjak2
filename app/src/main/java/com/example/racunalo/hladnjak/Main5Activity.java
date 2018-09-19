package com.example.racunalo.hladnjak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Main6Activity.class);

        Bundle podatak4 = getIntent().getExtras();
        if (podatak4 == null){
            return;
        }
        String cetvrti_ventilator = podatak4.getString("cetvrti_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String peti_promjer = "0";
        peti_promjer = promjerUlaz.getText().toString();
        /*if (peti_promjer!=null && peti_promjer.isEmpty())peti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String peti_nbo = "0";
        peti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String peti_orijentacija = "0";
        peti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String peti_tbo = "0";
        peti_tbo = tboUlaz.getText().toString();

        String izlaz5=cetvrti_ventilator.concat("/").concat(peti_promjer).concat("/").concat(peti_nbo).concat("/").concat(peti_orijentacija).concat("/").concat(peti_tbo).concat("//");
        i.putExtra("peti_ventilator", izlaz5);

        startActivity(i);
    }
    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        Bundle podatak4 = getIntent().getExtras();
        if (podatak4 == null){
            return;
        }
        String cetvrti_ventilator = podatak4.getString("cetvrti_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String peti_promjer = "0";
        peti_promjer = promjerUlaz.getText().toString();
        /*if (peti_promjer!=null && peti_promjer.isEmpty())peti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String peti_nbo = "0";
        peti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String peti_orijentacija = "0";
        peti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String peti_tbo = "0";
        peti_tbo = tboUlaz.getText().toString();

        String izlaz5=cetvrti_ventilator.concat("/").concat(peti_promjer).concat("/").concat(peti_nbo).concat("/").concat(peti_orijentacija).concat("/").concat(peti_tbo).concat("//");
        j.putExtra("peti_ventilator", izlaz5);

        startActivity(j);
    }
}
