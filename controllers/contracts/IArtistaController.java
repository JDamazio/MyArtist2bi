package controllers.contracts;

import java.util.ArrayList;

import models.Artista;

public interface IArtistaController {

    boolean cadastrar(Artista artista);

    Artista buscarPorCpf(String cpf);

    ArrayList<Artista> listar();

    void excluirArtista(Artista artista);
    
    void editar(Artista artista);

}
