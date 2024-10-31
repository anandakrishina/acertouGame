package com.krishina.acertougame;

import java.util.ArrayList;
import java.util.List;

public class Categorias {

    public static List<ItemLista> listarCategorias(){

        List<ItemLista>categorias = new ArrayList<>();

        ItemLista categoriaEsporte = new ItemLista(R.drawable.skate,"ESPORTE");
        categorias.add(categoriaEsporte);

        ItemLista categoriaTecnologia = new ItemLista(R.drawable.transformacao,"TECNOLOGIA");
        categorias.add(categoriaTecnologia);

        ItemLista categoriaFilme = new ItemLista(R.drawable.pipoca,"FILME");
        categorias.add(categoriaFilme);

        return categorias;
    }
}
