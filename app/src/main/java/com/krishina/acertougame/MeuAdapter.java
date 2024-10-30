package com.krishina.acertougame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class MeuAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<ItemLista> itens;

    public MeuAdapter(Context context,List<ItemLista> itens){
        this.itens=itens;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public ItemLista getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View  getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
