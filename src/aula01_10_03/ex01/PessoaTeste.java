package aula01_10_03.ex01;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Rua dos bobos", 0, "Pavuna", "Rio de Janeiro", "RJ", "Victor", "26/10/2004", "Masculino", "vitintrembala@gmail.com", EstadoCivil.SOLTEIRO);

        p1.imprimirDados();
    }
    
}
