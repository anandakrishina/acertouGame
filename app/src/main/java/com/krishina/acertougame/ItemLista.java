package com.krishina.acertougame;

public class ItemLista {
    private int imagem;
    private String dados;

    public ItemLista(int imagem, String dados) {
        this.imagem = imagem;
        this.dados = dados;
    }

    public ItemLista() {
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
