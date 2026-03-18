package aula01_10_03.ex02;

public class Pessoa extends Endereco{
    private String nome;
    private int idade;

    public Pessoa(String logradouro, int numero, String bairro, String cidade, String uf, String nome, int idade) {
        super(logradouro, numero, bairro, cidade, uf);
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDadosPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        super.imprimirEndereco();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
