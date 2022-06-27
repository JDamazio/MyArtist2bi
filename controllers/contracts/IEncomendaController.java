package controllers.contracts;

import java.util.ArrayList;

import models.Encomenda;

public interface IEncomendaController {

    void cadastrar(Encomenda encomenda);

    ArrayList<Encomenda> listar();
}
