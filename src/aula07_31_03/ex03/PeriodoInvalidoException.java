package aula07_31_03.ex03;

public class PeriodoInvalidoException extends Exception {
    public PeriodoInvalidoException(){
            super("ERRO: Periodo de checkin ou checkout invalido.");
    }
}
