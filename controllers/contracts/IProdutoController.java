package controllers.contracts;

import java.util.ArrayList;

import models.Produto;

public interface IProdutoController {

    boolean CadastrarProduto(Produto produto);

    Produto buscarPorTipo(String tipo);
    
    ArrayList<Produto> listar();
}
