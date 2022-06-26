package controllers.contracts;

import java.util.ArrayList;

import models.Agendamento;

public interface IAgendamentoController {

    boolean cadastrar(Agendamento agendamento);

    Agendamento buscarData(String dataAgendada);

    ArrayList<Agendamento> listar();
}
