package controllers;

import java.util.ArrayList;

import controllers.contracts.IAgendamentoController;
import models.Agendamento;

public class AgendamentoController implements IAgendamentoController{
    
    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();
    

    public boolean cadastrar(Agendamento agendamento){
        if (verAgendamento(agendamento.getDataAgendada()) == null) {
            agendamentos.add(agendamento);
            return true;
        }
        return false;
    }


    @Override
    public Agendamento verAgendamento(String dataAgendada) {
        for (Agendamento estaAgendado : agendamentos){
            if(estaAgendado.getDataAgendada().equals(dataAgendada)){
                return estaAgendado;
            }
        }
        return null;
    }

    @Override
    public boolean estaAgendado(Agendamento agendamento){
        if(verAgendamento(agendamento.getDataAgendada())==null){
            return true;
        }
        return false;
    }


	@Override
	public ArrayList<Agendamento> listar() {
		return agendamentos;
	}

}
