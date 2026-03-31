package aula07_31_03.ex03;

public class HospedeNullException extends Exception{
    public HospedeNullException(){
        super("ERRO: Precisa do nome do hospede para realizar a reserva");
    }
}
