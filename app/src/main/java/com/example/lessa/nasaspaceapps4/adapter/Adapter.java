package com.example.lessa.nasaspaceapps4.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lessa.nasaspaceapps4.R;
import com.example.lessa.nasaspaceapps4.model.Missao;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Missao> listaMissoes;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_recycler, viewGroup, false);
        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        Missao missao = listaMissoes.get( i );

        holder.nomeMissao.setText(missao.getNomeMissao());
        holder.organizacaoMissao.setText(missao.getOrganizacaoMissao());
        holder.dataMissao.setText(missao.getDataMissao());
        holder.localMissao.setText(missao.getLocalMissao());
        holder.imageMissao.setImageResource(missao.getImageMissao());

    }

    @Override
    public int getItemCount() {
        return listaMissoes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nomeMissao;
        TextView dataMissao;
        TextView organizacaoMissao;
        TextView localMissao;
        ImageView imageMissao;

        public MyViewHolder(View itemView) {
            super(itemView);

            nomeMissao = itemView.findViewById(R.id.textNomeMissao);
            organizacaoMissao = itemView.findViewById(R.id.textOrganizacaoMissao);
            dataMissao = itemView.findViewById(R.id.textDataMissao);
            localMissao = itemView.findViewById(R.id.textLocalMissao);
            imageMissao = itemView.findViewById(R.id.imageMissao);

        }

    }

    public Adapter(List<Missao> lista) {

        this.listaMissoes = lista;

    }

}
