package views;


import controllers.AgendamentoController;
import controllers.ArtistaController;
import controllers.ClienteController;
import controllers.ProdutoController;
import models.Agendamento;
import models.Artista;
import models.Cliente;
import models.Produto;
import utils.Console;
import views.contracts.IViews;

public class Agendar implements IViews{
    
    @Override 
    public void renderizar(){
        Agendamento agendamento = new Agendamento();

        AgendamentoController agendamentoController = new AgendamentoController();
        ClienteController clienteController = new ClienteController();
        ArtistaController artistaController = new ArtistaController();
        ProdutoController produtoController = new ProdutoController();

        System.out.println("\n == Agendar == \n");


        String cpfArtista = Console.readString("Informe o cpf do artista: ");
        Artista artista = artistaController.buscarPorCpf(cpfArtista);
        if(artista != null){
            agendamento.setArtista(artista);
        

            String cpfCliente = Console.readString("Informe o cpf do cliente: ");
            Cliente cliente = clienteController.buscarPorCpf(cpfCliente);
            if(cliente != null){
                agendamento.setCliente(cliente);

                String tipo = Console.readString("Tipo da tatuagem: ");
                Produto produto = produtoController.buscarPorTipo(tipo);
                if(produto != null){
                    agendamento.setProduto(produto);

                    String dataMarcada = Console.readString("Informe o dia: ");
                    agendamento.setDataAgendada(dataMarcada);
                    agendamentoController.cadastrar(agendamento);
                    System.out.println("Tatuagem marcada!!");
                }else{
                    System.out.println("Produto não encontrado!");
                }
            }else{
                System.out.println("Cliente não encontrado!");
            }
        }else{
            System.out.println(" não encontrado!");
        }
    }
}


