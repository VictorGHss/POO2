package aula04_18_03.ex01;

public class Contato {
    private String nome;
    private String sobrenome;
    private String numTel;
    private String endereco;
    private String dataAniversario;

    public Contato(String nome, String sobrenome, String numTel, String endereco, String dataAniversario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numTel = numTel;
        this.endereco = endereco;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumTel() {
        return numTel;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    

}
