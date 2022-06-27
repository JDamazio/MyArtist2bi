package controllers;

import java.util.ArrayList;

import controllers.contracts.IEncomendaController;
import models.Encomenda;

public class EncomendaController implements IEncomendaController{

    private static ArrayList<Encomenda> encomendas = new ArrayList<Encomenda>();

    @Override
    public void cadastrar(Encomenda encomenda){
        encomendas.add(encomenda);
    }

    @Override
    public ArrayList<Encomenda> listar(){
        return encomendas;
    }

}
