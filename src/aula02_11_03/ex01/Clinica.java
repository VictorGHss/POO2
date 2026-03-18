package aula02_11_03.ex01;

public class Clinica{
    private String cnpj;
    private String razaoSocial;
    private Mamifero mamifero;

    public Clinica(String cnpj, String razaoSocial, Mamifero mamifero) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.mamifero = mamifero;
    }

    public void cadastrarAnimal(String nome, String raca){
        System.out.println(mamifero.nome + " foi cadastrado na clinica " + razaoSocial + ".");
    }

    public void listarAnimais(){
        System.out.println("");
    }

}
