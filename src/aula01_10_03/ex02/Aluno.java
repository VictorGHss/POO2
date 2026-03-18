package aula01_10_03.ex02;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String logradouro, int numero, String bairro, String cidade, String uf, String nome, int idade) {
        super(logradouro, numero, bairro, cidade, uf, nome, idade);
        this.curso = "NULL";
    }

    public void realizarMatricula(String curso){
        setCurso(curso);
        System.out.println("Aluno: " + this.getNome() + " está matriculado no curso " + this.curso + ".");
    }

    public void imprimirDadosAluno(){
        super.imprimirDadosPessoa();
        System.out.println("Curso: " + this.curso);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    

}
