package views;

import controllers.AgendamentoController;
import models.Agendamento;
import views.contracts.IViews;

public class Agendamentos implements IViews{

    @Override
    public void renderizar(){
        AgendamentoController agendamentoController = new AgendamentoController();
        System.out.println("\n == AGENDAMENTO == \n");
        for(Agendamento agendamentoCadastrado : agendamentoController.listar()){
            System.out.println(agendamentoCadastrado);
        }
    }
    
}