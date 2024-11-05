package com.krishina.acertougame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//https://developer.android.com/guide/topics/resources/string-resource#StringArray

public class EsporteActivity extends AppCompatActivity {

    private TextView pergunta;
    private RadioGroup radioGroup;
    private RadioButton alternativaA, alternativaB, alternativaC, alternativaD;
    private Button buttonResponder;
    private String [] perguntas;
    private int[] respostaCorreta;
    private String[][] alternativas;
    private int index, acertos, idBotaoSelecionado;
    private RadioButton botaoSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_esporte);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pergunta = findViewById(R.id.textViewQuestao);
        radioGroup = findViewById(R.id.radioGroup);
        alternativaA = findViewById(R.id.radioButton0);
        alternativaB = findViewById(R.id.radioButton1);
        alternativaC = findViewById(R.id.radioButton2);
        alternativaD = findViewById(R.id.radioButton3);
        buttonResponder = findViewById(R.id.buttonResponder);
        perguntas = getResources().getStringArray(R.array.perguntasEsporte);
        respostaCorreta = getResources().getIntArray(R.array.respostasCorretasEsporte);
        alternativas = new String[][]{
                getResources().getStringArray(R.array.opcao0Esporte),
                getResources().getStringArray(R.array.opcao1Esporte),
                getResources().getStringArray(R.array.opcao2Esporte),
        };

        index = 0;
        exibirPerguntas(index);

        buttonResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idBotaoSelecionado = radioGroup.getCheckedRadioButtonId();
                botaoSelecionado = findViewById(idBotaoSelecionado);
                int indexRespostaSelecionada = radioGroup.indexOfChild(botaoSelecionado);


                if (idBotaoSelecionado != -1) {
                    VerificaAcerto verificaAcerto= new VerificaAcerto();
                    if(verificaAcerto.verificarAcerto(indexRespostaSelecionada,respostaCorreta[index]) ==1){
                        Toast.makeText(EsporteActivity.this, "ACERTOOOU", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(EsporteActivity.this, "ERROOOUUU", Toast.LENGTH_SHORT).show();
                    }
                    acertos += verificaAcerto.verificarAcerto(indexRespostaSelecionada,respostaCorreta[index]);
                    index++;
                    exibirPerguntas(index);
                    radioGroup.clearCheck();
                }
            }
        });
    }

    private void exibirPerguntas(int index) {
        if (index < perguntas.length) {
            String questao = perguntas[index];
            pergunta.setText(questao);
            alternativaA.setText(alternativas[index][0]);
            alternativaB.setText(alternativas[index][1]);
            alternativaC.setText(alternativas[index][2]);
            alternativaD.setText(alternativas[index][3]);
        } else {
            pergunta.setText("FIM DE JOGO! \n Você acertou " + acertos + " de " + perguntas.length + " perguntas.");
            buttonResponder.setEnabled(false);
            radioGroup.setVisibility(View.GONE); //some com o radioGroup
        }
    }
}