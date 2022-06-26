package views.contracts;

import java.util.ArrayList;

import controllers.AgendamentoController;
import models.Agendamento;

public class IListar {
    
    void renderizar(){
        AgendamentoController agendamentoController = new AgendamentoController();
        ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();


            System.out.println("\n -- LISTAGEM DE AGENDAMENTO -- \n");
            for (Agendamento agendamentoCadastrado : agendamentoController.listar()) {
                System.out.println(agendamentoCadastrado);
            }

            
        }
}

