package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    
    private Cliente cliente;
    private Artista artista;
    private Produto produto;
    public String dataAgendada; 
    private double valor;
    private Date dataConvertida;

    
    public Date getDataConvertida(String dataNasc){
        return dataConvertida;
    }
    public void setDataConvertida(String dataAgendada) {
            try{
                // converte a string para o formato Date formatando para o padrao brasileiro
            Date dataConvertida = new SimpleDateFormat("dd/MM/yyyy").parse(dataAgendada);  
            this.dataConvertida = dataConvertida;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    public String getDataAgendada() {
        return dataAgendada;
    }
    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return 
            "Cliente: " + cliente.getNome() +
            " | Artista: " + artista.getNome() + 
            " | Produto: " + produto.getTipo() +
            " | Tatuagem: " + produto.getTipo()+
            " | Data: "+ getDataAgendada();
    }
    
}
