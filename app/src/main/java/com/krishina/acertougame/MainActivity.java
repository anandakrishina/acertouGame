package com.krishina.acertougame;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



    }
}