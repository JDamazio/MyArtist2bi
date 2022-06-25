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
    public String paraTexto() {
        return
            "Nome: "+getNome()+
            " | CPF: "+getCpf()+
            " | Serviço: "+getServico();
    }

    public void add(Artista artista) {
    }
}
