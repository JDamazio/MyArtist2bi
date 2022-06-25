package controllers;

import java.util.ArrayList;

import controllers.contracts.IAgendamentoController;
import models.Agendamento;

public class AgendamentoController implements IAgendamentoController{
    
    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    @Override
    public void cadastrar(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    @Override
    public ArrayList<Agendamento> listar() {
        return agendamentos;
    }

}
