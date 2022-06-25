package controllers;

import java.util.ArrayList;

import controllers.contracts.IClienteController;
import models.Cliente;

public class ClienteController implements IClienteController{

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public boolean cadastrar(Cliente cliente){
        if(buscarPorCpf(cliente.getCpf()) == null){
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public Cliente buscarPorCpf(String cpf){
        for(Cliente clienteCadastrado : clientes){
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> listar() {
        return clientes;
    }
}
