package aula01_10_03_26.ex01;

public class Pessoa extends Endereco{
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String email;
    private EstadoCivil estadoCivil;

    public Pessoa(String logradouro, int numero, String bairro, String cidade, String uf, String nome,
            String dataNascimento, String sexo, String email, EstadoCivil estadoCivil) {
        super(logradouro, numero, bairro, cidade, uf);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Email: " + this.email);
        System.out.println("Estado Civil: " + this.estadoCivil);
        System.out.println("---Endereço---");
        super.imprimirEndereco();
    }
}
