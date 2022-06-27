package controllers.contracts;

import java.util.ArrayList;

import models.Avaliacao;

public interface IAvaliacao {
    
    void cadastrar(Avaliacao avaliacao);

    ArrayList<Avaliacao> listar();

}
