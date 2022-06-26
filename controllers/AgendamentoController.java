package controllers;

import java.util.ArrayList;

import controllers.contracts.IAgendamentoController;
import models.Agendamento;

public class AgendamentoController implements IAgendamentoController{
    
    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    @Override
    public boolean cadastrar(Agendamento agendamento) {
        if (buscarData(agendamento.getDataAgendada()) == null){
            agendamentos.add(agendamento);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Agendamento> listar() {
        return agendamentos;
    }


    @Override
    public Agendamento buscarData(String dataAgendada) {
        for (Agendamento agendamentoDisponivel : agendamentos){
            if(agendamentoDisponivel.getDataAgendada() != dataAgendada){
                return agendamentoDisponivel;
            }
        }
        return null;
    }

}
