package models;

public class Encomenda {

    private String encomenda;
	
    public String getEncomenda() {
		return encomenda;
	}
	public void setEncomenda(String encomenda) {
		this.encomenda = encomenda;
	}

	private Cliente cliente;


    
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

    @Override
    public String toString() {
        return "O cliente "+cliente.getNome()+
        " encomendou uma tatuagem do tipo "+getEncomenda();
    }
}
