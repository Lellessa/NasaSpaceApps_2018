package com.example.lessa.nasaspaceapps4.model;

public class Missao {

    private String nomeMissao;
    private String organizacaoMissao;
    private String dataMissao;
    private String localMissao;
    private int imageMissao;

    public Missao(String organizacaoMissao, String nomeMissao, String dataMissao, String localMissao, int imageMissao) {
        this.nomeMissao = nomeMissao;
        this.organizacaoMissao = organizacaoMissao;
        this.dataMissao = dataMissao;
        this.localMissao = localMissao;
        this.imageMissao = imageMissao;
    }

    public String getLocalMissao() {
        return localMissao;
    }

    public void setLocalMissao(String localMissao) {
        this.localMissao = localMissao;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getOrganizacaoMissao() {
        return organizacaoMissao;
    }

    public void setOrganizacaoMissao(String organizacaoMissao) {
        this.organizacaoMissao = organizacaoMissao;
    }

    public String getDataMissao() {
        return dataMissao;
    }

    public void setDataMissao(String dataMissao) {
        this.dataMissao = dataMissao;
    }

    public int getImageMissao() {
        return imageMissao;
    }

    public void setImageMissao(int imageMissao) {
        this.imageMissao = imageMissao;
    }
}
