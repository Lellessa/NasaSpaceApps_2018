package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lessa.nasaspaceapps4.R;

public class FogueteActivity extends AppCompatActivity {

    private ImageView imageModuloComando;
    private ImageView imageFogueteEscape;
    private ImageView imageModuloLunar;
    private ImageView imageTanqueOxigenio;
    private ImageView imageTanqueHidrogenio;
    private ImageView imageTanqueQuerosene;
    private TextView textInfo;

    String strModuloComandoServico = "This was where the Apollo astronauts sat during lift-off, their journey to and from the moon, and the renturn to Earth." +
            "The Service Module carried water and oxygen for the crew during the flight to the moon and it supplied power to the spacecraft";
    String strEscapeRocket = "In an emergency during lift-off, this small rocket could blast off, pulling the Command Module carrying the crew away to safety. It had a parachute for a soft landing";
    String strModuloLunar = "This was the lander vehicle, which took the astronauts down to the surface of the moon and back";
    String strTanqueOxigenio = "This tank was used to store liquid oxygen that worked as an oxidizer. The liquid oxygen mixed with the fuel (liquid hydrogen gas) and provided oxygen to burn it, making hot gases to power the rocket. All liquid-fueled rockets have separate tanks for the fuel and the oxidizer.";
    String strTanqueHidrogenio = "Rockets use fuel to fly. This tank contained liquid hydrogen that was mixed with a chemical called an oxidizer to produce water and heat. It helped to propel the reocket forward.";
    String strTanqueQuerosene = "The first stage had a tank of kerosene. The kerosene served as fuel during the rocket's launch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foguete);

        imageModuloComando = findViewById(R.id.imageModuloComando);
        imageFogueteEscape = findViewById(R.id.imageFogueteEscape);
        imageModuloLunar = findViewById(R.id.imageModuloLunar);
        imageTanqueOxigenio = findViewById(R.id.imageOxigenio);
        imageTanqueHidrogenio = findViewById(R.id.imageHidrogenio);
        imageTanqueQuerosene = findViewById(R.id.imageQuerosene);
        textInfo = findViewById(R.id.textInformacao);

        //Setando Invisivel
        imageModuloComando.setVisibility(View.GONE);
        imageFogueteEscape.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText("");
    }

    public void opcao0_Foguete(View view) {
        imageFogueteEscape.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText(strModuloComandoServico);

        if (imageModuloComando.getVisibility() == View.GONE) {
            imageModuloComando.setVisibility(View.VISIBLE);
        } else if (imageModuloComando.getVisibility() == View.VISIBLE) {
            imageModuloComando.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void opcao1_Foguete(View view) {
        imageModuloComando.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText(strEscapeRocket);

        if (imageFogueteEscape.getVisibility() == View.GONE) {
            imageFogueteEscape.setVisibility(View.VISIBLE);
        } else if (imageFogueteEscape.getVisibility() == View.VISIBLE){
            imageFogueteEscape.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void opcao2_Foguete(View view) {
        imageModuloComando.setVisibility(View.GONE);
        imageFogueteEscape.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText(strModuloLunar);

        if (imageModuloLunar.getVisibility() == View.GONE) {
            imageModuloLunar.setVisibility(View.VISIBLE);
        } else if (imageModuloLunar.getVisibility() == View.VISIBLE){
            imageModuloLunar.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void opcao3_Foguete(View view) {
        imageModuloComando.setVisibility(View.GONE);
        imageFogueteEscape.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText(strTanqueOxigenio);

        if (imageTanqueOxigenio.getVisibility() == View.GONE) {
            imageTanqueOxigenio.setVisibility(View.VISIBLE);
        } else if (imageTanqueOxigenio.getVisibility() == View.VISIBLE){
            imageTanqueOxigenio.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void opcao4_Foguete(View view) {
        imageModuloComando.setVisibility(View.GONE);
        imageFogueteEscape.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueQuerosene.setVisibility(View.GONE);
        textInfo.setText(strTanqueHidrogenio);

        if (imageTanqueHidrogenio.getVisibility() == View.GONE) {
            imageTanqueHidrogenio.setVisibility(View.VISIBLE);
        } else if (imageTanqueHidrogenio.getVisibility() == View.VISIBLE){
            imageTanqueHidrogenio.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void opcao5_Foguete(View view) {
        imageModuloComando.setVisibility(View.GONE);
        imageFogueteEscape.setVisibility(View.GONE);
        imageModuloLunar.setVisibility(View.GONE);
        imageTanqueOxigenio.setVisibility(View.GONE);
        imageTanqueHidrogenio.setVisibility(View.GONE);
        textInfo.setText(strTanqueQuerosene);

        if (imageTanqueQuerosene.getVisibility() == View.GONE) {
            imageTanqueQuerosene.setVisibility(View.VISIBLE);
        } else if (imageTanqueQuerosene.getVisibility() == View.VISIBLE){
            imageTanqueQuerosene.setVisibility(View.GONE);
            textInfo.setText("");
        }
    }

    public void btMenuFoguete(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        finish();
        startActivity( intent );
    }

}
