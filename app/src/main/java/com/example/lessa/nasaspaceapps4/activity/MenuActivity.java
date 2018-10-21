package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lessa.nasaspaceapps4.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btVoltarMenu(View view) {
        finish();
    }

    public void btMapaMenu(View view) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        finish();
        startActivity( intent );
    }

    public void btMissionsMenu(View view) {
        //Entrando na página das missões
        Intent intent = new Intent(getApplicationContext(), MissoesActivity.class);
        finish();
        startActivity( intent );
    }

    public void btRocketMenu(View view) {
        Intent intent = new Intent(getApplicationContext(), FogueteActivity.class);
        finish();
        startActivity( intent );
    }

    public void btFisicaFoguete(View view) {
        Intent intent = new Intent(getApplicationContext(), FisicaActivity.class);
        finish();
        startActivity( intent );
    }
}
