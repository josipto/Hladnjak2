package com.example.racunalo.hladnjak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        /*Bundle podatak1 = getIntent().getExtras();
        if (podatak1 == null){
            return;
        }
        String prvi_ventilator = podatak1.getString("prvi_ventilator");
        final TextView prvaText = (TextView) findViewById(R.id.textView7);
        if(prvi_ventilator!="")prvaText.setText(prvi_ventilator);

        Bundle podatak2 = getIntent().getExtras();
        if (podatak2 == null){
            return;
        }
        String drugi_ventilator = podatak2.getString("drugi_ventilator");
        final TextView drugaText = (TextView) findViewById(R.id.textView10);
        drugaText.setText(drugi_ventilator);

        Bundle podatak3 = getIntent().getExtras();
        if (podatak3 == null){
            return;
        }
        String treci_ventilator = podatak3.getString("treci_ventilator");
        final TextView trecaText = (TextView) findViewById(R.id.textView12);
        trecaText.setText(treci_ventilator);

        Bundle podatak4 = getIntent().getExtras();
        if (podatak4 == null){
            return;
        }
        String cetvrti_ventilator = podatak4.getString("cetvrti_ventilator");
        final TextView cetvrtaText = (TextView) findViewById(R.id.textView14);
        cetvrtaText.setText(cetvrti_ventilator);

        Bundle podatak5 = getIntent().getExtras();
        if (podatak5 == null){
            return;
        }
        String peti_ventilator = podatak5.getString("peti_ventilator");
        final TextView petaText = (TextView) findViewById(R.id.textView13);
        petaText.setText(peti_ventilator);

        Bundle podatak6 = getIntent().getExtras();
        if (podatak6 == null){
            return;
        }
        String sesti_ventilator = podatak6.getString("sesti_ventilator");
        final TextView sestaText = (TextView) findViewById(R.id.textView18);
        sestaText.setText(sesti_ventilator);*/

    }
    public void onClick(View view){
        /*Intent i = new Intent(this, MainActivity.class);*/

        final EditText temperaturaUlaz = (EditText)findViewById(R.id.editText5);
        String sedmi_temperatura = "0";
        sedmi_temperatura = temperaturaUlaz.getText().toString();
        if (sedmi_temperatura!=null && sedmi_temperatura.isEmpty())sedmi_temperatura="00";


        Bundle podatak1 = getIntent().getExtras();
        if (podatak1 == null){
            return;
        }
        String prvi_ventilator = "0";
        prvi_ventilator = podatak1.getString("prvi_ventilator");


        Bundle podatak2 = getIntent().getExtras();
        if (podatak2 == null){
            return;
        }
        String drugi_ventilator = "0";
        drugi_ventilator = podatak2.getString("drugi_ventilator");

        Bundle podatak3 = getIntent().getExtras();
        if (podatak3 == null){
            return;
        }
        String treci_ventilator = "0";
        treci_ventilator = podatak3.getString("treci_ventilator");

        Bundle podatak4 = getIntent().getExtras();
        if (podatak4 == null){
            return;
        }
        String cetvrti_ventilator = "0";
        cetvrti_ventilator = podatak4.getString("cetvrti_ventilator");

        Bundle podatak5 = getIntent().getExtras();
        if (podatak5 == null){
            return;
        }
        String peti_ventilator = "0";
        peti_ventilator = podatak5.getString("peti_ventilator");

        Bundle podatak6 = getIntent().getExtras();
        if (podatak6 == null){
            return;
        }
        String sesti_ventilator = "0";
        sesti_ventilator = podatak6.getString("sesti_ventilator");

        String svi_ventilatori;

        if(prvi_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(prvi_ventilator);
        if(drugi_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(drugi_ventilator);
        if(treci_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(treci_ventilator);
        if(cetvrti_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(cetvrti_ventilator);
        if(peti_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(peti_ventilator);
        if(sesti_ventilator!="0") svi_ventilatori=sedmi_temperatura.concat(sesti_ventilator);




        /*startActivity(i);*/
    }

}
