package aula01_10_03.ex02;

public class Professor extends Pessoa{
    private double salarioBase;
    private Titulacao titulacao;

    public Professor(String logradouro, int numero, String bairro, String cidade, String uf, String nome, int idade,
            double salarioBase, Titulacao titulacao) {
        super(logradouro, numero, bairro, cidade, uf, nome, idade);
        this.salarioBase = salarioBase;
        this.titulacao = titulacao;
    }

    public void imprimirDadosProfessor(){
        super.imprimirDadosPessoa();
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Titulação " + this.titulacao);
        if(titulacao.equals(Titulacao.MESTRE)){
            double salarioTotal = salarioBase + 3000;
            System.out.println("Salario de Mestre: R$" + salarioTotal);
        }
        else if (titulacao.equals(Titulacao.DOUTOR)){
            double salarioTotal = salarioBase + 5000;
            System.out.println("Salario de Doutor: R$" + salarioTotal);
        }
    }

}
