package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lessa.nasaspaceapps4.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import javax.xml.xpath.XPathException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    TextView nomeMissaoPrincipal, dataMissaoPrincipal, organizacaoMissaoPrincipal;
    ImageView imageMissaoprincipal;
    private GoogleMap mMap;

    //Definido as coordenadas
    LatLng russia = new LatLng(62.425113, 91.601182);
    LatLng china = new LatLng(34.512450, 103.998362);
    LatLng eua = new LatLng(40.129087, -101.678283);
    LatLng japao = new LatLng(36.309407, 138.970289);
    LatLng guiana = new LatLng(4.798954, -52.770031);
    LatLng india = new LatLng(22.796786, 79.499492);
    LatLng kaza = new LatLng(48.336987, 66.677818);
    LatLng novaZelandia = new LatLng(-42.298384, 171.858759);

    //Definindo a configuração inicial
    LatLng localization = russia;
    String missao = "Lotos-S1 N3 804";
    String organizacao = "Soyuz-2";
    String data = "OCT 25";
    String subtitulo = "Next Launch";
    String local;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        nomeMissaoPrincipal = findViewById(R.id.textNomeMissaoPrincipal);
        dataMissaoPrincipal = findViewById(R.id.textDataMissaoPrincipal);
        organizacaoMissaoPrincipal = findViewById(R.id.textOrganizacaoMissaoPrincipal);
        imageMissaoprincipal = findViewById(R.id.imageMissaoPrincipal);

        nomeMissaoPrincipal.setText(missao);
        dataMissaoPrincipal.setText(data);
        organizacaoMissaoPrincipal.setText(organizacao);
        imageMissaoprincipal.setImageResource(R.drawable.russia);
    }

    @Override
    protected void onStart() {
        super.onStart();

        try {
            Bundle dados = getIntent().getExtras();
            missao = dados.getString("nomeMissao");
            organizacao = dados.getString("fogueteMissao");
            data = dados.getString("dataMissao");
            image = dados.getInt("imageMissao");
            local = dados.getString("localMissao");

            if (local.equals("Rússia")) {
                localization = russia;
            } else if (local.equals("United States")) {
                localization = eua;
            } else if (local.equals("China")) {
                localization = china;
            } else if (local.equals("Japao")) {
                localization = japao;
            } else if (local.equals("French Guiana")) {
                localization = guiana;
            } else if (local.equals("India")) {
                localization = kaza;
            } else if (local.equals("Kazakhstan")) {
                localization = novaZelandia;
            } else if (local.equals("New Zealand")) {

            }

            nomeMissaoPrincipal.setText(missao);
            dataMissaoPrincipal.setText(data);
            organizacaoMissaoPrincipal.setText(organizacao);
            imageMissaoprincipal.setImageResource(image);

            subtitulo = data;

        } catch (Exception ex) {

        }


        /*nomeMissaoPrincipal.setText(this.missao);
        dataMissaoPrincipal.setText();
        organizacaoMissaoPrincipal.setText();
        imageMissaoprincipal.setImageResource(R.drawable.russia);*/
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //Marker marker = mMap.addMarker(new MarkerOptions().position(localization).title( missao )).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_foguete_vermelho_pequeno));
        Marker marker = mMap.addMarker(new MarkerOptions() .position(localization) .title(missao) .snippet(subtitulo));
        marker.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(localization, (float) 2.5));

    }

    public void btMenuMapa(View view) {
        //Abrindo a Activity Menu
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

}
