package com.example.lessa.nasaspaceapps4.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lessa.nasaspaceapps4.R;
import com.example.lessa.nasaspaceapps4.RecyclerItemClickListener;
import com.example.lessa.nasaspaceapps4.adapter.Adapter;
import com.example.lessa.nasaspaceapps4.model.Missao;

import java.util.ArrayList;
import java.util.List;

public class MissoesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public List<Missao> listaMissoes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missoes);
        recyclerView = findViewById(R.id.recyclerViewMissoes);

        this.criarMissoes();
        Adapter adapter = new Adapter( listaMissoes );

        //Configurando o LayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setAdapter( adapter );

        //Otimizando
        recyclerView.setHasFixedSize( true );

        //Configurando evento de clique no RecyclerView
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Missao missao =listaMissoes.get( position );

                        //Passando as informações
                        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                        intent.putExtra("nomeMissao", missao.getNomeMissao());
                        intent.putExtra("fogueteMissao", missao.getOrganizacaoMissao());
                        intent.putExtra("dataMissao", missao.getDataMissao());
                        intent.putExtra("localMissao", missao.getLocalMissao());
                        intent.putExtra("imageMissao", missao.getImageMissao());

                        //Fechando a Activity Atual
                        finish();

                        //Chamando a activity nova
                        startActivity( intent );
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                })
        );

    }

    //Definindo as Missões manualmente
    public void criarMissoes() {
        Missao missao = new Missao("Soyuz-2", "Lotos-S1 N3 804", "OCT 25","Rússia", R.drawable.russia);
        this.listaMissoes.add( missao );

        missao = new Missao("Pegasus", "ICON", "OCT 26","United States", R.drawable.eua);
        this.listaMissoes.add( missao );

        missao = new Missao("Long March 4B", "Haiyang-2B", "OCT 26","China", R.drawable.china);
        this.listaMissoes.add( missao );

        missao = new Missao("Zhuque-1", "Weilai-1", "OCT 27", "China", R.drawable.china);
        this.listaMissoes.add( missao );

        missao = new Missao("H-2A", "GOSAT-2", "OCT 29", "Japao", R.drawable.japao);
        this.listaMissoes.add( missao );

        missao = new Missao("Long March 2C", "CFOSAT", "OCT 29", "China", R.drawable.china);
        this.listaMissoes.add( missao );

        missao = new Missao("New Shepard", "Suborbital Test Flight", "OCT 2018", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Long March 3B", "Beidou-3G1Q", "NOV 01", "China", R.drawable.china);
        this.listaMissoes.add(missao);

        missao = new Missao("Soyuz-2", "GLONASS-M", "NOV 03", "Rússia", R.drawable.russia);
        this.listaMissoes.add(missao);

        missao = new Missao("Soyuz-2", "MetOp-C", "NOV 06", "French Guiana", R.drawable.guiana_francesa);
        this.listaMissoes.add(missao);

        missao = new Missao("Falcon 9", "Es’hail-2", "NOV 14", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Antares", "CRS NG-10E", "NOV 15", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Falcon 9", "Spaceflight SSO-A", "NOV 19", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Vega", "MOHAMMED VI-B", "NOV 20", "French Guiana", R.drawable.guiana_francesa);
        this.listaMissoes.add(missao);

        missao = new Missao("PSLV", "HySIS", "NOV 22", "India", R.drawable.india);
        this.listaMissoes.add(missao);

        missao = new Missao("Falcon 9", "CRS SpX-16", "NOV 27", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Delta IV Heavy", "NROL-71", "NOV 29", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("LauncherOne", "LauncherOne Flight 1", "NOV 2018", "United States", R.drawable.eua);
        this.listaMissoes.add(missao);

        missao = new Missao("Soyuz-FG", "Progress MS-10", "NOV 2018", "Kazakhstan", R.drawable.kazakhstan);
        this.listaMissoes.add(missao);

        missao = new Missao("GSLV-II", "GSAT-7A", "NOV 2018", "India",  R.drawable.india);
        this.listaMissoes.add(missao);

    }

    //Configurando o link das lives
    public void getLinkMissao(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rocketlaunch.live/?tag=air-launch"));
        startActivity( intent );

    }

    //Configurando o botão do menu
    public void btMenuMissoes(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity( intent );
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        /*Missao teste;
        teste = listaMissoes.get(0);
        String teste2 = teste.getNomeMissao();
        Toast.makeText(getApplicationContext(), teste2, Toast.LENGTH_LONG).show();*/
    }

}
