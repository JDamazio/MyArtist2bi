package controllers.contracts;

import java.util.ArrayList;

import models.Agendamento;

public interface IAgendamentoController {

    boolean cadastrar(Agendamento agendamento);

    // Agendamento buscarData(String dataAgendada);

    Agendamento verAgendamento(String dataAgendada);

    boolean estaAgendado(Agendamento agendamento);

    ArrayList<Agendamento> listar();
}
