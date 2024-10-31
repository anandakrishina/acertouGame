package com.krishina.acertougame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//https://developer.android.com/reference/android/widget/BaseAdapter?hl=en

public class MeuAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<ItemLista> categorias;

    public MeuAdapter(Context context,List<ItemLista> itens){
        this.categorias=itens;
        inflater = LayoutInflater.from(context);
    }


    //Retorna o número total de itens no Adapter.
    // Esse valor é usado para determinar quantas vezes o método getView() será chamado.
    @Override
    public int getCount() {
        return categorias.size();
    }


    //Retorna o objeto de dados na posição especificada.
    // Esse método é útil quando você precisa acessar o item de uma posição específica.
    @Override
    public ItemLista getItem(int position) {
        return categorias.get(position);
    }


    //Retorna o ID associado à posição específica no Adapter.
    // Em muitos casos, isso pode ser apenas a própria posição,
    // mas se cada item tiver um ID exclusivo, você pode retornar esse ID.
    @Override
    public long getItemId(int position) {
        return position;
    }


    //Ele retorna a View que representa um item da lista na posição especificada.
    @Override
    public View  getView(int position, View view, ViewGroup viewGroup) {
        ItemLista categoria = categorias.get(position);
        view = inflater.inflate(R.layout.item_list,null);
        TextView nomeCategoria = view.findViewById(R.id.texto_item);
        nomeCategoria.setText(categoria.getDados());
        ImageView imagemCategoria = view.findViewById(R.id.image);
        imagemCategoria.setImageResource(categoria.getImagem());
        return view;
    }
}
