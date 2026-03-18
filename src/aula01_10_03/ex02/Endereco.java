package aula01_10_03.ex02;

public class Endereco {
    protected String logradouro;
    protected int numero;
    protected String bairro;
    protected String cidade;
    protected String uf;

    public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public void imprimirEndereco(){
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Número: " + this.numero);
        System.out.println("Bairro" + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.uf);
    }
}
