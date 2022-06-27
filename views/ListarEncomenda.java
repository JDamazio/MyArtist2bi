package views;

import controllers.EncomendaController;
import models.Encomenda;
import views.contracts.IViews;

public class ListarEncomenda implements IViews{
    
    @Override
    public void renderizar() {
        
        EncomendaController encomendaController = new EncomendaController();

        System.out.println("\n == LISTAGEM DE ENCOMENDAS == \n");
        for (Encomenda encomendaCadastrada : encomendaController.listar()){
            System.out.println(encomendaCadastrada);
        }
    }
}
