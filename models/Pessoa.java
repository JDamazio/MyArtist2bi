package models;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String sexo;
    private int dataNasc;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String paraTexto(){
        return "User!";
    }

}
