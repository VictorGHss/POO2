package aula02_11_03.ex01;

public abstract class Mamifero{
    protected String nome;
    protected String raca;

    public Mamifero(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    
}
