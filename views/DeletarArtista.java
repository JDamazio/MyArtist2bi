package views;

import controllers.ArtistaController;
import models.Artista;
import utils.Console;

public class DeletarArtista {

    private static Artista artista;
    ArtistaController artistaController = new ArtistaController();

    public void renderizar() {
		
        System.out.println("\n === DELETAR ARTISTA === \n");
		String cpfArtista = Console.readString("Digite o CPF do artista: ");
        artista = artistaController.buscarPorCpf(cpfArtista);
		
		
            if (artista == null) {
				System.out.println("\n Artista não encontrado! \n");
			} else {
				DeletarArtista.printArtista();
				System.out.println("\nDeseja deletar esse artista?");
				System.out.println("\nATENÇÃO: Perca permanente! ");
			
				String opcao = Console.readString("[sim/nao]");
				if("sim".equals(opcao)) {
					artistaController.excluirArtista(artista);
					if(!artistaController.exists(artista)){
						System.out.println("\nArtista deletado com SUCESSO!!");
					}else{
						System.out.println("\nERRO ao deletar!!");
					}
				} 
			}
	}
    
    public static void printArtista() {
		System.out.println("\nNome: " + artista.getNome());
	}
}
