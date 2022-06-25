package models;

public class Produto {
    
    private String tipo;
    private Double preco;
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return 
        "Nome: " + tipo + 
        " | Preço: " + preco;
    }
}
