package com.krishina.acertougame;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listViewCategorias;
    private ArrayAdapter adapter;
    private List<String> listaCategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listViewCategorias = findViewById(R.id.listaCategorias);
        preencherAdapter();
        listViewCategorias.setAdapter(adapter);
    }

    private void preencherAdapter() {
        listaCategorias = Categorias.listarCategorias();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,listaCategorias);
    }
}