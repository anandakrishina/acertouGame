package com.krishina.acertougame;

import java.util.ArrayList;
import java.util.List;

public class Categorias {

    public static List<String> listarCategorias(){

        List<ItemLista>itens = new ArrayList<>();
        ItemLista categoriaEsporte = new ItemLista(R.drawable.skate,"esporte");
        itens.add(categoriaEsporte);


        List <String> listaCategorias = new ArrayList<>();
        listaCategorias.add("Filme");
        listaCategorias.add("Tecnologia");
        listaCategorias.add("Esporte");
        return listaCategorias;
    }
}
