package views;

import controllers.ArtistaController;
import controllers.AvaliacaoController;
import controllers.ClienteController;
import models.Artista;
import models.Avaliacao;
import models.Cliente;
import utils.Console;
import views.contracts.IViews;

public class CadastrarAvaliacao implements IViews{
    @Override
    public void renderizar(){
        Avaliacao avaliacao = new Avaliacao();
        ArtistaController artistaController = new ArtistaController();
        ClienteController clienteController = new ClienteController();
        AvaliacaoController avaliacaoController = new AvaliacaoController();

        System.out.println("\n == CADASTRO DE AVALIAÇOES == \n");

        String cpfArtista = Console.readString("Informe o cpf do artista: ");
        Artista artista = artistaController.buscarPorCpf(cpfArtista);
        if(artista != null){
            avaliacao.setArtista(artista);

            String cpfCliente = Console.readString("Informe o cpf do cliente: ");
            Cliente cliente = clienteController.buscarPorCpf(cpfCliente);
            if(cliente != null){
                avaliacao.setCliente(cliente);

                int nota = Console.readInt("Digite uma nota de 1 à 10: ");
                if(nota>=1 && nota<=10){
                    avaliacao.setNota(nota);
                    avaliacaoController.cadastrar(avaliacao);
                    System.out.println("Avaliação Cadastrada!");
                }else{
                    System.out.println("Tente Novamente!");
                }
            }else{
                System.out.println("Cliente não encontrado!");
            }
        }else{
            System.out.println("Artista não encontrado!");
        }
    }
}
