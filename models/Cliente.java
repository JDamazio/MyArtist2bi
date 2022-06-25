package models;

public class Cliente extends Pessoa{
    
    private String cel;

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    @Override
    public String paraTexto() {
        return 
            "Nome: "+ getNome()+
            " | CPF: "+ getCpf()+
            " | Cel: "+ getCel();
    }
}
