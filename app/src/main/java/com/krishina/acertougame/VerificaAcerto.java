package com.krishina.acertougame;

public class VerificaAcerto {
    public int verificarAcerto(int indexRespostaSelecionada, int indexCorreto) {
        if(indexRespostaSelecionada == indexCorreto){
            return 1;
        } else {
            return 0;
        }
    }
}