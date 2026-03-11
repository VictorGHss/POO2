package aula01_10_03_26.ex02;

public class Escola {
    public static void main(String[] args) {
        Professor pMestre = new Professor("Rua dos Bobos", 0, "Bras de Pinas", "Rio de Janeiro", "RJ", "Henrique Ferreira", 43, 5000, Titulacao.MESTRE);
        pMestre.imprimirDadosProfessor();

        Professor pDoutor = new Professor("Avenida Brasil", 157, "Guaianases", "São Paulo", "SP", "Antonio Neto", 55, 9000, Titulacao.DOUTOR);
        pDoutor.imprimirDadosProfessor();

        Aluno aluno = new Aluno("Avenida Munchen", 142, "Centro", "Ponta Grossa", "PR", "Gabriel Henrique", 19);
        aluno.imprimirDadosAluno();
        aluno.realizarMatricula("Analise e Desenvolvimento de Sistemas");
    }
    
}
