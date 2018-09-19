package com.example.racunalo.hladnjak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Main2Activity.class);

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String prvi_promjer = "0";
        prvi_promjer = promjerUlaz.getText().toString();
        /*if (prvi_promjer!=null && prvi_promjer.isEmpty())prvi_promjer="0";*/
        //i.putExtra("poruka", prvi_promjer);

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String prvi_nbo = "0";
        prvi_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String prvi_orijentacija = "0";
        prvi_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String prvi_tbo = "0";
        prvi_tbo = tboUlaz.getText().toString();

        String izlaz1="//".concat(prvi_promjer).concat("/").concat(prvi_nbo).concat("/").concat(prvi_orijentacija).concat("/").concat(prvi_tbo).concat("//");
        i.putExtra("prvi_ventilator", izlaz1);

        startActivity(i);
    }
    public void onClick2(View view){
        Intent j = new Intent(this, Main7Activity.class);

        final EditText promjerUlaz = (EditText)findViewById(R.id.editText);
        String prvi_promjer = "0";
        prvi_promjer = promjerUlaz.getText().toString();
        /*if (prvi_promjer!=null && prvi_promjer.isEmpty())prvi_promjer="0";*/

        final EditText nboUlaz = (EditText)findViewById(R.id.editText2);
        String prvi_nbo = "0";
        prvi_nbo = nboUlaz.getText().toString();

        final EditText orijentacijaUlaz = (EditText)findViewById(R.id.editText3);
        String prvi_orijentacija = "0";
        prvi_orijentacija = orijentacijaUlaz.getText().toString();

        final EditText tboUlaz = (EditText)findViewById(R.id.editText4);
        String prvi_tbo = "0";
        prvi_tbo = tboUlaz.getText().toString();

        String izlaz1="//".concat(prvi_promjer).concat("/").concat(prvi_nbo).concat("/").concat(prvi_orijentacija).concat("/").concat(prvi_tbo).concat("//");
        j.putExtra("prvi_ventilator", izlaz1);

        startActivity(j);
    }
}
