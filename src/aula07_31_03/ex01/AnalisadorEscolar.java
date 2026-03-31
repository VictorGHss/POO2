package aula07_31_03.ex01;

public class AnalisadorEscolar {
    public static void verificarAprovação(double nota, double frequencia) throws FrequenciaInsuficienteException, MediaInsuficienteException{
        if(frequencia < 75.0) {
            throw new FrequenciaInsuficienteException(frequencia);
        }
        if (nota < 6.0){
            throw new MediaInsuficienteException(nota);
        }
        System.out.println("Parabens!! Aluno aprovado com sucesso.");
    }
}
