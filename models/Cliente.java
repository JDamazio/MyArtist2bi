package models;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Cliente extends Pessoa{
    
    public Cliente(){
        setDataAtual(new Date()) ;
    }


    private String cel;
    private String dataNasc;
    private Date dataConvertida;
    private Date dataAtual;

    

    public Date getDataAtual() {
        return dataAtual;
    }
    public void setDataAtual(Date dataAtual ) {
        this.dataAtual = dataAtual;
    }
    
    public Date getDataConvertida(Date dataNasc){
        return dataConvertida;
    }
    public void setDataConvertida(String dataAgendada) {
            try{
                // converte para o formato date, já setado com o padrão brasileiro
            Date dataConvertida = new SimpleDateFormat("dd,MM,yyyy").parse(dataAgendada);  
            this.dataConvertida = dataConvertida;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    @Override
    public String toString() {
        return            
        "Nome: "+ getNome()+
        " | CPF: "+ getCpf()+
        " | Cel: "+ getCel();
    }
}
