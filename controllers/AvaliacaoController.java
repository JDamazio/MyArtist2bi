package controllers;

import java.util.ArrayList;

import controllers.contracts.IAvaliacao;
import models.Avaliacao;

public class AvaliacaoController implements IAvaliacao{
    
    private static ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    @Override
    public void cadastrar(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }

    @Override
    public ArrayList<Avaliacao> listar(){
        return avaliacoes;
    }
}
