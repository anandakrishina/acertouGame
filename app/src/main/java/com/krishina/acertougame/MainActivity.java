package com.krishina.acertougame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listViewCategorias;
    private MeuAdapter adapter;
    //private ArrayAdapter adapter;
    private List<ItemLista> listaCategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        listViewCategorias = findViewById(R.id.listaCategorias);
        preencherAdapter();
    }

    private void preencherAdapter() {
        listaCategorias = Categorias.listarCategorias();
        adapter = new MeuAdapter(MainActivity.this,listaCategorias);
        listViewCategorias.setAdapter(adapter);
        listViewCategorias.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int positon, long id) {
        ItemLista categoria = (ItemLista) adapterView.getItemAtPosition(positon);
        //Toast.makeText(this,"Você clicou em: "+categoria.getDados(),Toast.LENGTH_LONG).show();

        Intent it;
        if (categoria.getDados().equals("TECNOLOGIA")){
            //Toast.makeText(this,"Você clicou em: "+categoria.getDados(),Toast.LENGTH_LONG).show();
            it = new Intent(MainActivity.this,TecnologiaActivity.class);
            startActivity(it);
        }
        if (categoria.getDados().equals("ESPORTE")){
            //Toast.makeText(this,"Você clicou em: "+categoria.getDados(),Toast.LENGTH_LONG).show();
            it = new Intent(MainActivity.this, EsporteActivity.class);
            startActivity(it);
        }
        if (categoria.getDados().equals("FILME")){
            //Toast.makeText(this,"Você clicou em: "+categoria.getDados(),Toast.LENGTH_LONG).show();
            it = new Intent(MainActivity.this,FilmeActivity.class);
            startActivity(it);
        }


    }
}