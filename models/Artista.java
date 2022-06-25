package models;

public class Artista extends Pessoa{
    
    private String servico;

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return
            "Nome: "+getNome()+
            " | CPF: "+getCpf()+
            " | Serviço: "+getServico();
    }

}
