package controllers;

import java.util.ArrayList;

import controllers.contracts.IArtistaController;
import models.Artista;

public class ArtistaController implements IArtistaController {

    private static  ArrayList<Artista> artistas = new ArrayList<Artista>();

    @Override
    public boolean cadastrar(Artista artista) {
        if(buscarPorCpf(artista.getCpf()) == null){
            artistas.add(artista);
            return true;
        }
        return false; 
    }

    @Override
    public ArrayList<Artista> listar(){
        return artistas;
    }

    @Override
    public Artista buscarPorCpf(String cpf) {
        for (Artista artistaCadastrado : artistas){
            if(artistaCadastrado.getCpf().equals(cpf)){
                return artistaCadastrado;
            }
        }
        return null;
    }

    @Override
	public void excluirArtista(Artista artista) {
		artistas.remove(artista);
	}

    @Override
	public void editar(Artista artista) {
		int index = artistas.indexOf(artista);
		if(index > 0) artistas.add(index, artista);
	}

    public Boolean exists(Artista a){
		return artistas.contains(a);
	}

}
