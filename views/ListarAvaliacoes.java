package views;

import controllers.AvaliacaoController;
import models.Avaliacao;
import views.contracts.IViews;

public class ListarAvaliacoes implements IViews{

    @Override
    public void renderizar(){
        AvaliacaoController avaliacaoController = new AvaliacaoController();

        System.out.println("\n == LISTAGEM DE AVALIAÇÕES == \n");
        for(Avaliacao avaliacaoCadastrada : avaliacaoController.listar()){
            System.out.println(avaliacaoCadastrada);
        }
    }
    
}
