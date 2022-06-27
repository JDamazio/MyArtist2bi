package views;

import controllers.ArtistaController;
import models.Artista;
import utils.Console;

public class EditarArtista {

    private static Artista artista;
    ArtistaController artistaController = new ArtistaController();

    public void renderizar() {

        System.out.println("\n === EDIÇÃO DE ARTISTA === \n");
		String cpfArtista = Console.readString("Digite o CPF do artista: ");
		artista =  artistaController.buscarPorCpf(cpfArtista);

        if (artista == null) {
            System.out.println("\n Artista não encontrado! \n");
        } else {
            EditarArtista.printArtista();
            artista.setNome(
                Console.readString(
                    String.format("Nome: [%s]", artista.getNome())
                )
            );
            artista.setSexo(
                Console.readString(
                    String.format("Sexo: [%s]", artista.getSexo())
                )
            );
            artista.setServico(
                Console.readString(
                    String.format("Serviço/Produto: [%s]", artista.getServico())
                )
            );
            artista.setCpf(
                Console.readString(
                    String.format("CPF: [%s]", artista.getCpf())
                )
            );
            artistaController.editar(artista);
			System.out.println("\nEditado com SUCESSSO!!");
        }
    }

    public static void printArtista() {

        System.out.println("\n--Editar artista--");
		System.out.println("Nome: " + artista.getNome());
        System.out.println("------------------");
        System.out.println("\n==Editar==");

	}
}
