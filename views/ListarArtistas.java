package views;

import controllers.ArtistaController;
import models.Artista;
import views.contracts.IViews;

public class ListarArtistas implements IViews{

    @Override
    public void renderizar(){
        ArtistaController artistaController = new ArtistaController();
        System.out.println("\n == LISTAGEM DE ARTISTAS == \n");
        for (Artista artistaCadastrado : artistaController.listar()){
            System.out.println(artistaCadastrado);
        }
    }
    
}
