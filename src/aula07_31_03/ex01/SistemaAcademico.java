package aula07_31_03.ex01;

import java.util.Scanner;

public class SistemaAcademico {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("Digite a média final: ");
double nota = scanner.nextDouble();

System.out.print("Digite a frequência (%): ");
double frequencia = scanner.nextDouble();

AnalisadorEscolar.verificarAprovação(nota, frequencia);

} catch (FrequenciaInsuficienteException e) {
System.err.println("ERRO DE FREQUÊNCIA: " + e.getMessage());

} catch (MediaInsuficienteException e) {
System.err.println("ERRO DE NOTA: " + e.getMessage());

} catch (Exception e) {
System.err.println("Ocorreu um erro inesperado: " + e.getMessage());

} finally {
scanner.close();
System.out.println("Processo finalizado.");
}
}
}
