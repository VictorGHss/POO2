package aula07_31_03.ex02;

public class TvJaDesligadaException extends Exception{
    public TvJaDesligadaException(){
        super("Operação Invalida: A Tv já está DESLIGADA!");
    }
    
}
