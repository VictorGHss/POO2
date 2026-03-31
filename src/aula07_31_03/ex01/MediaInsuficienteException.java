package aula07_31_03.ex01;

public class MediaInsuficienteException extends Exception{
    public MediaInsuficienteException(double media) {
        super("Reprovado por nota: Média " + media + ". Minimo Exigido: 6.0");
    }
    
}
