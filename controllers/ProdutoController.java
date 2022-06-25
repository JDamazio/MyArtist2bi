package controllers;

import java.util.ArrayList;

import controllers.contracts.IProdutoController;
import models.Produto;

public class ProdutoController implements IProdutoController {
    
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    @Override
    public boolean CadastrarProduto(Produto produto){
        if (buscarPorTipo(produto.getTipo()) == null) {
            produtos.add(produto);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Produto> listar(){
        return produtos;
    }

    @Override 
    public Produto buscarPorTipo(String tipo) {
        for(Produto produtoCadastrado : produtos){
            if(produtoCadastrado.getTipo().equals(tipo)){
                return produtoCadastrado;
            }
        }
        return null;
    }
}
