package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lessa.nasaspaceapps4.R;

public class FisicaActivity extends AppCompatActivity {

    TextView textPrincipal;

    String strFuncionamentoFoguete = "The 1st year for rocket propulsion is Newton's law - for every action with equal and opposite force, with the effect that can be observed on a water hose: backwards. By reducing the outflow, this thrust will be even stronger. No rocket, when burned gases escape from a strong jet through a local tablet, the contraption is driven in the opposite direction. The magnitude of the impact depends on the mass and velocity of the exhaust gases.";
    String strFuncionamentoFoguete2 = "Rocket engines may use solid or liquid fuel. Solid fuels contain an intimately mixed oxidant. The engine consists of a housing and fuel, with an ignition system to initiate combustion and a central cavity to ensure complete and equal burning. Liquid fuel engines are more complex as fuel and oxidant are stored separately and then mixed in the combustion chamber, but are more controllable than solid fuel engines. Oxygen and hydrogen liquefied are the most common liquid fuels.";
    String strFuncionamentoFoguete3 = "Most of the spacecraft structure is intended for the transport of fuel and oxidant. It turns out that a good amount of this propellant is consumed in the smallest part of the trip: that made inside the limits of the terrestrial atmosphere. In fact, it is during this journey that a considerable amount of energy is consumed, mainly to lift a vehicle weighing thousands of tons from the ground.\n" +
            "\n" +
            "Thus, after this stretch, the rocket starts to carry a useless weight corresponding to the structure intended, at the beginning, to transport that fuel. This fact makes one think of a system that allows abandoning part of this structure. The multi-stage rocket system is then used: the vehicle is subdivided into two, three and even four elements, each having the property of detaching itself from the rest of the rocket as soon as the fuel stored by it comes to an end.\n";
    String strFuncionamentoFoguete4 = "\n" +
            "The main part of the spacecraft is intended for the transport of fuel and oxidant. It turns out that a good amount of propellant is consumed in the shortest stretch of the journey: what is done within the boundaries of the Earth's atmosphere. In fact, it is during this journey that a considerable amount of energy is consumed, especially for the lifting of a vehicle weighing thousands of tons.\n" +
            "\n" +
            "Thus, after this stretch, the rocket becomes a useless weight corresponding to the structure intended, at the beginning, to transport that fuel. This fact makes a logo that can be used as part of the structure. The rocket system of various types is then used: the vehicle is subdivided into two, three and even four elements, each having its remainder property of the rocket, as well as the fuel for it comes to an end.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);
        textPrincipal = findViewById(R.id.textFisicaFoguete);

        textPrincipal.setText(strFuncionamentoFoguete + "\n\n" + strFuncionamentoFoguete2 + "\n\n" + strFuncionamentoFoguete3 + "\n\n" + strFuncionamentoFoguete4);

    }

    public void btMenuFisica(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        finish();
        startActivity( intent );
    }
}
