package aula07_31_03.ex01;

public class FrequenciaInsuficienteException extends Exception{
    public FrequenciaInsuficienteException(double frequencia){
        super("Reprovado por frequencia: " + frequencia + "%. Minimo Exigido: 75%.");
    }
}
