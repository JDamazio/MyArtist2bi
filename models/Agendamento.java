package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    
    private Cliente cliente;
    private Artista artista;
    private Produto produto;
    public String dataAgendada; 
    public  Date dataConvertida;

    public Date getDataConvertida(Date dataConvertida){
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

    private double valor;
    
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
    
}
