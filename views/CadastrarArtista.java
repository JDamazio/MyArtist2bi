package views;

import controllers.ArtistaController;
import models.Artista;
import utils.Console;
import views.contracts.IViews;

public class CadastrarArtista implements IViews{

    @Override
    public void renderizar(){
        Artista artista = new Artista();
        ArtistaController artistaController = new ArtistaController();

        System.out.println("\n == CADASTRO DE ARTISTA == \n");
        artista.setNome(Console.readString("Digite o nome do artista:"));
        artista.setCpf(Console.readString("Digite o cpf do artista:"));
        artista.setDataNasc(Console.readInt("Digite a data de nascimento:"));
        artista.setSexo(Console.readString("Digite o sexo[masc/fem]:"));
        artista.setServico(Console.readString("Digite sua área de atuação:"));

        if(artistaController.cadastrar(artista)){
            System.out.println("\n Artista cadastrado com SUCESSO !! \n");
        }

    }
}
