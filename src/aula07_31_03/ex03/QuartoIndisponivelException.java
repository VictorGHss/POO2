package aula07_31_03.ex03;

public class QuartoIndisponivelException extends Exception{
    public QuartoIndisponivelException (){
        super("ERRO: O Quarto selecionado está indisponivel");
    }
}
