package com.example.racunalo.hladnjak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Main5Activity.class);

        Bundle podatak3 = getIntent().getExtras();
        if (podatak3 == null){
            return;
        }
        String treci_ventilator = podatak3.getString("treci_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String cetvrti_promjer = "0";
        cetvrti_promjer = promjerUlaz.getText().toString();
        /*if (cetvrti_promjer!=null && cetvrti_promjer.isEmpty())cetvrti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String cetvrti_nbo = "0";
        cetvrti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String cetvrti_orijentacija = "0";
        cetvrti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String cetvrti_tbo = "0";
        cetvrti_tbo = tboUlaz.getText().toString();

        String izlaz4=treci_ventilator.concat("/").concat(cetvrti_promjer).concat("/").concat(cetvrti_nbo).concat("/").concat(cetvrti_orijentacija).concat("/").concat(cetvrti_tbo).concat("//");
        i.putExtra("cetvrti_ventilator", izlaz4);

        startActivity(i);
    }
    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        Bundle podatak3 = getIntent().getExtras();
        if (podatak3 == null){
            return;
        }
        String treci_ventilator = podatak3.getString("treci_ventilator");

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String cetvrti_promjer = "0";
        cetvrti_promjer = promjerUlaz.getText().toString();
        /*if (cetvrti_promjer!=null && cetvrti_promjer.isEmpty())cetvrti_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String cetvrti_nbo = "0";
        cetvrti_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String cetvrti_orijentacija = "0";
        cetvrti_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String cetvrti_tbo = "0";
        cetvrti_tbo = tboUlaz.getText().toString();

        String izlaz4=treci_ventilator.concat("/").concat(cetvrti_promjer).concat("/").concat(cetvrti_nbo).concat("/").concat(cetvrti_orijentacija).concat("/").concat(cetvrti_tbo).concat("//");
        j.putExtra("cetvrti_ventilator", izlaz4);

        startActivity(j);
    }
}
