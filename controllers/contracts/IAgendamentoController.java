package controllers.contracts;

import java.util.ArrayList;

import models.Agendamento;

public interface IAgendamentoController {

    void cadastrar(Agendamento agendamento);

    ArrayList<Agendamento> listar();
}
