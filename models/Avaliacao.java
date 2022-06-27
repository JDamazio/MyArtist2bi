package models;

public class Avaliacao {

    private Artista artista;
    private Cliente cliente;
    private int nota;

    public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}

    @Override
    public String toString() {
        return 
            " O cliente " +cliente.getNome()+
            " avaliou o artista " + artista.getNome()+
			" com uma nota " +getNota();
    }
}
