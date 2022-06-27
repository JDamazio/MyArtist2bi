package views;


import controllers.ClienteController;
import models.Cliente;
import models.Encomenda;
import utils.Console;
import views.contracts.IViews;

public class CadastrarEncomenda implements IViews{
    
    @Override
    public void renderizar(){

        Encomenda encomenda = new Encomenda();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n == CADASTRO DE ENCOMENDAS == \n");

        String cpfCliente = Console.readString("Informe o cpf do cliente: ");
        Cliente cliente = clienteController.buscarPorCpf(cpfCliente);
        if(cliente != null){
            encomenda.setCliente(cliente);

            String tipo = Console.readString("Informe o tipo: ");
            encomenda.setEncomenda(tipo);


        }else{
            System.out.println("Cliente não encontrado!");
        }
    }
}
