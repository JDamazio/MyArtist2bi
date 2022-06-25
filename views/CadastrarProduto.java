package views;

import controllers.ProdutoController;
import models.Produto;
import utils.Console;
import views.contracts.IViews;

public class CadastrarProduto implements IViews{

    @Override
    public void renderizar(){
        Produto produto = new Produto();
        ProdutoController produtoController =  new ProdutoController();

        System.out.println("\n == CADASTRO DE PRODUTOS == \n");

        produto.setTipo(Console.readString("Informe o estilo da tatuagem: "));
        produto.setPreco(Console.readDouble("Informe o valor do produto: $"));

        if(produtoController.CadastrarProduto(produto)){
            System.out.println("\n Produto cadastrado com SUCESSO !! \n");
        }
    }
    
}
