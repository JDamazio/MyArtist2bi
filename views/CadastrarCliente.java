package views;



import controllers.ClienteController;
import models.Cliente;
import utils.Console;
import views.contracts.IViews;

public class CadastrarCliente implements IViews{

    @Override
    public void renderizar(){
        Cliente cliente = new Cliente();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n == CADASTRO DE CLIENTES == \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.setCpf(Console.readString("Digite o CPF do cliente: "));
        cliente.setCel(Console.readString("Digite seu celular:"));
        cliente.setDataNasc(Console.readString("Informe a data de nascimento:"));
        
        // long years = ChronoUnit.YEARS.between(cliente.getDataNasc(), cliente.getDataAtual());
        
        if(clienteController.cadastrar(cliente)){
            System.out.println("\n Cliente cadastrado com SUCESSO !! \n");
        }
        
    }
    
}
