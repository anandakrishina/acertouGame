package com.krishina.acertougame;

import java.util.ArrayList;
import java.util.List;

public class Categorias {

    public static List<String> listarCategorias(){
        List <String> listaCategorias = new ArrayList<>();
        listaCategorias.add("Filme");
        listaCategorias.add("Tecnologia");
        listaCategorias.add("Esporte");
        return listaCategorias;
    }
}
